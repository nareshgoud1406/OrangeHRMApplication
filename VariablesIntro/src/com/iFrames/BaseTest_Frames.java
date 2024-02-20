package com.iFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest_Frames {

	

		WebDriver driver;
		String applicationUrlAddress="https://jqueryui.com/droppable/";

		@BeforeTest
		public void applicationLaunch()
		{

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();

		}
		@AfterTest
		public void applicationClose()
		{
		driver.close();
		}

	}
	



	
	
	

