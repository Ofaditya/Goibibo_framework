package com.goibibo.qa.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass
	{
		//creating reference of webdriver as static so can be accessed direcvtly
		public static WebDriver driver;
		//creating log refrence of logger class coming from log4j package 
		public static Logger log;

		@BeforeClass
		public static void init()
			{
				log = Logger.getLogger(BaseClass.class);
				String browsername = "chrome";

				if (browsername.equalsIgnoreCase("chrome"))
					{
						System.setProperty("webdriver.chrome.driver",
								"D:\\chromedriver\\chromedriver.exe");
						driver = new ChromeDriver();

					}

				log.info("browser started : ");
				driver.get("https://www.goibibo.com/hotels/");
				log.info("Goibibo opened : ");

			}
	}
