package com.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	
WebDriver driver;

String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

@BeforeTest
public void setUp()
{

System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
driver = new ChromeDriver();

driver.get(applicationUrlAddress);

driver.manage().window().maximize();

}

@AfterTest
public void tearDown()
{
driver.quit();
}
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]

}


