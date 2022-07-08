package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.base.BaseClass;

public class HomePage extends BaseClass
	{
		//creating constructor of this page class to initialize the page objects
		public HomePage()
			{
				PageFactory.initElements(driver, this);
			}

		//radion button element 
		@FindBy(name = "CountryType")
		WebElement RadioButton;

		@FindBy(id = "downshift-1-input")
		WebElement dropdown;

		@FindBy(xpath = "//div[normalize-space()='Check-in']")
		WebElement checkInDate;

		@FindBy(xpath = "//span[normalize-space()='9']")
		WebElement selectcheckInDate;

		@FindBy(xpath = "//div[normalize-space()='Check-out']")
		WebElement checkOutDate;

		@FindBy(xpath = "//span[normalize-space()='10']")
		WebElement selectcheckOutDate;

		@FindBy(xpath = "//span[normalize-space()='Guests & Rooms']")
		WebElement GuestAndroom;

		@FindBy(xpath = "//body//div[@id='root']//div//div//div//div//div//div//div//div//div[1]//div[1]//span[2]")
		WebElement addroom;

		@FindBy(xpath = "//body//div[@id='root']//div//div//div//div//div[2]//div[1]//span[2]")
		WebElement addadult;

		@FindBy(xpath = "//div[3]//div[1]//span[2]")
		WebElement addchildren;

		@FindBy(xpath = "//section//div[5]//div[1]")
		WebElement twochilddropdown;

		@FindBy(xpath = "//button[normalize-space()='Done']")
		WebElement doneBTN;

		@FindBy(xpath = "//button[normalize-space()='Search Hotels']")
		WebElement SearchHotelbtn;

		public void SelectRadioButton()
			{
				RadioButton.click();
			}

		public void selectCity()
			{
				dropdown.click();
				dropdown.sendKeys("Delhi");
				//				Select sel = new Select(dropdown);
				//				sel.selectByVisibleText("Delhi");

			}

		public void checkInDate()
			{
				checkInDate.click();
				selectcheckInDate.click();

			}

		public void checkOutDate()
			{
				checkOutDate.click();
				selectcheckOutDate.click();

			}

		public void clickonguestsandroom()
			{
				GuestAndroom.click();
			}

		public void addRoom()
			{
				addroom.click();
			}

		public void addAdults()
			{
				addadult.click();
			}

		public void addchildren()
			{
				addchildren.click();
			}

		public boolean isenabled2child()
			{
				if (twochilddropdown.isEnabled())
					{
						return true;
					}
				else
					return false;

			}

		public void clickondoneButton()
			{
				doneBTN.click();
			}

		public void clickonsearchbtn()
			{
				SearchHotelbtn.click();
			}
	}
