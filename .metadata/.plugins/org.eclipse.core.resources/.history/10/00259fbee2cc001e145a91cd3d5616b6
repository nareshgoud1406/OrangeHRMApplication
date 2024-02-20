package com.utility_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	

		WebDriver driver;
		@BeforeTest
		public void applicationLaunch()
		{
			System.setProperty("webdriver.chrome.driver","C:./Resources/chromedriver.exe");
			String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver = new ChromeDriver(); 
			driver.get(ApplicationURLAddress);
			
		}
		@AfterTest
		public void applicationClose()
		{
			
			driver.close();
			

		}

}
	
