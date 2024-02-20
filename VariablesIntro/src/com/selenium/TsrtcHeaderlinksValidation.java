package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcHeaderlinksValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		String ApplicationURLAddress= "https://www.tsrtconline.in/oprs-web/";
	
				//	ChromeDriver driver = new ChromeDriver(); 
					WebDriver driver=new ChromeDriver();
					driver.get(ApplicationURLAddress);
	
					By LinksProperty=By.className("menu-wrap");
					WebElement tsrtcApplicationHomePageLinksProperty=driver.findElement(LinksProperty);
					By linksbytagName=By.tagName("a");
					List<WebElement>tsrtcApplicationHomePageLinks=tsrtcApplicationHomePageLinksProperty.findElements(linksbytagName);
					int tsrtcApplicationHomePageLinksCount=tsrtcApplicationHomePageLinks.size();
					
					System.out.println("tsrtc Aplication Header link count is:- "+tsrtcApplicationHomePageLinksCount);
					
					
					for(int arrayIndex=0;arrayIndex<tsrtcApplicationHomePageLinksCount;arrayIndex++)
					{
				
						System.out.println(arrayIndex+"-"+tsrtcApplicationHomePageLinks.get(arrayIndex).getText());
						tsrtcApplicationHomePageLinks.get(arrayIndex).click();
						
						String actualUrloftsrtcApplicationHomePAgeHeaderLinks=driver.getCurrentUrl();
						String actualTitleoftsrtcApplicationHomePageHeaderlinks=driver.getTitle();
						System.out.println("Actual Title is -"+actualTitleoftsrtcApplicationHomePageHeaderlinks);
						System.out.println("Actual Url is -"+actualUrloftsrtcApplicationHomePAgeHeaderLinks);
						
						driver.navigate().back();
						
						
						tsrtcApplicationHomePageLinksProperty=driver.findElement(LinksProperty);
						tsrtcApplicationHomePageLinks=tsrtcApplicationHomePageLinksProperty.findElements(linksbytagName);
					
						String AttributeValue=tsrtcApplicationHomePageLinks.get(arrayIndex).getAttribute("href");
						System.out.println("Expected Attribute value of href locater of link is  -"+AttributeValue);
						
						
						if(actualUrloftsrtcApplicationHomePAgeHeaderLinks.equals(AttributeValue))
						{
							System.out.println("PASS");
							
							
						}
						else
						{
							System.out.println("FAIL");
							
							
						}
						System.out.println();
						System.out.println("############################################");
						
					}
					
					
						
						
						driver.quit();
	}

}


