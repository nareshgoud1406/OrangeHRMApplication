package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		String ApplicationURLAddress= "https://www.tsrtconline.in/oprs-web/";
	
			//	ChromeDriver driver = new ChromeDriver(); 
				WebDriver driver=new ChromeDriver();
				driver.get(ApplicationURLAddress);
					
		By LinksProperty=By.tagName("a");
		List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(LinksProperty);
		
		int tsrtcApplicationHomePageLinks_Count=tsrtcApplicationHomePageLinks.size();
		
		System.out.println(tsrtcApplicationHomePageLinks_Count);
		
		for(int arrayIndex=0;arrayIndex<tsrtcApplicationHomePageLinks_Count;arrayIndex++)
		{
		String tsrtcHomePage_LinkName=tsrtcApplicationHomePageLinks.get(arrayIndex).getText();
		
		System.out.println(arrayIndex+" - "+tsrtcHomePage_LinkName);

		}
		
		driver.quit();
		
		

	}

}
