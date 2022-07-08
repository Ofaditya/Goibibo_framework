package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.goibibo.qa.base.BaseClass;
import com.goibibo.qa.pages.HomePage;

@Listeners(com.goibibo.qa.utils.ExtentReporting.class)
public class HomePageTests extends BaseClass
	{
		HomePage hp;

		@BeforeMethod
		void createObject()
			{
				hp = new HomePage(); // creating the object befoe every test case 
			}

		@Test(priority = 1)
		public void OnHomePage()
			{
				hp.SelectRadioButton();
				log.info("radio button india selected");
			}

		@Test(priority = 2)
		public void SelectingCity()
			{
				hp.selectCity();
				log.info("Delhi as city selected");
			}

		@Test(priority = 3)
		public void SelctingCheckInDate() throws InterruptedException
			{
				hp.checkInDate();
				log.info("Check in date selected as 9 july ");
				Thread.sleep(5);
			}

		@Test(priority = 4)
		public void SelctingCheckOutDate()
			{
				hp.checkOutDate();
				log.info("Check out date selected as 10 july ");
			}

		@Test(priority = 5)
		public void addingguestinfo()
			{
				hp.clickonguestsandroom();
				hp.addRoom();
				log.info("added2 rooms");
				hp.addAdults();
				hp.addchildren();

				boolean flag = hp.isenabled2child();

				Assert.assertTrue(flag);
				log.info("2 child dropdown is enabled ");
			}

		@Test(priority = 6)
		public void done()
			{
				hp.clickondoneButton();
				hp.clickonsearchbtn();
				log.info("hotel searcched");
			}

	}
