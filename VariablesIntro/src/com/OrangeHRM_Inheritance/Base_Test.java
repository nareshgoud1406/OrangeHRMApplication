package com.OrangeHRM_Inheritance;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Test {

WebDriver driver;

public void applicationLaunch()
{
	System.setProperty("webdriver.chrome.driver","C:./Resources/chromedriver.exe");
	String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver = new ChromeDriver(); 
	driver.get(ApplicationURLAddress);
	
}
public void applicationClose()
{
	
	driver.close();
	

}


public static void main(String[] args)throws IOException {
	
	Base_Test application =new Base_Test(); 	
	
	application.applicationLaunch();
	application.applicationClose();
	
	
	
}


}