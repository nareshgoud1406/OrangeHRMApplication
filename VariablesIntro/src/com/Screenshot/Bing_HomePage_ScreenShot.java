package com.Screenshot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_HomePage_ScreenShot {

	public static void main(String[] args) throws IOException {
	
	
System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");
		
		String ApplicationURLAddress= "http://bing.com";
		
	//Assigning URL to a variable to pass Dynamically.......................................... 
		
				ChromeDriver driver = new ChromeDriver(); 
				driver.get(ApplicationURLAddress);
				
			
			File SourceFile=driver.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("./ApplicationScreenShots/img1.jpg");
			FileUtils.copyFile(SourceFile, DestFile);
				
				
			System.out.println("Screenshot was taken succesfully");
			driver.quit();
			

			// TakesScreenshot - its an interface
			// driver - is an object of a Class / Interface
			// ((TakesScreenshot)driver) - this process is referred to as Type Casting

			//File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(webPageScreenShot, new File("/VariablesIntro/ApplicationScreenShots/img1.png"));

			
			
	}
	

	}


