package com.Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest_TSRTC {
	
	
	WebDriver driver;
	@BeforeTest
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:./Resources/chromedriver.exe");
		String ApplicationURLAddress= "https://www.tsrtconline.in/oprs-web/";
		driver = new ChromeDriver(); 
		driver.get(ApplicationURLAddress);
		
	}
	@AfterTest
	public void applicationClose()
	{
		
		driver.close();
		

	}



}
