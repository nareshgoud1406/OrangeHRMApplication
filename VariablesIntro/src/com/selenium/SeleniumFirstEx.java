package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; //import chromeDriver

public class SeleniumFirstEx {

	public static void main(String[] args) {
		
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		//creating a object(chromeBrowser)
		//we cannot directly interact with the Class
		//In order to interact with the class we should be creating an Object for the Class
		
		driver.get("https://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("youtube");
		
		
		
	}

}
