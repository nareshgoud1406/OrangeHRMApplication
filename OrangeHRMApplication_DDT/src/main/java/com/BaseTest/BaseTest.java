package com.BaseTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class BaseTest {
	

		public WebDriver driver;
		@Test
		public void applicationLaunch()
		{
			System.setProperty("webdriver.chrome.driver","C:./BrowserDriverFiles/chromedriver.exe");
			String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver = new ChromeDriver(); 
			driver.get(ApplicationURLAddress);
			
		}
//		@Test(priority=2)
//		public void applicationClose()
//		{
//			
//			driver.close();
//			
//
//		}

}
	
