package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_getAttributesExample {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
	//Assigning URL to a variable to pass Dynamically.......................................... 
		
				ChromeDriver driver = new ChromeDriver(); 
				driver.get(ApplicationURLAddress);
				
	//######################## Validating the WebPage Text ####################
			
				
//<div id="logInPanelHeading">LOGIN Panel</div>	
				 By loginPanelHeading=By.id("logInPanelHeading");
				WebElement loginPanel=driver.findElement(loginPanelHeading);
				 String loginPaneltext=loginPanel.getText();
				 System.out.println("login Panel text /name is   -"+loginPaneltext);
		 System.out.println("-------------------------------------------------------------");
		 System.out.println();
							 
				 String usernameTestData="nareshgoudmetri";
					By usernameProperty=By.id("txtUsername");
					WebElement username=driver.findElement(usernameProperty);
					username.sendKeys(usernameTestData);
					
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
					
					String passwordTestData="Naresh@1406";
					By passwordProperty=By.id("txtPassword");
					WebElement password=driver.findElement(passwordProperty);
					password.sendKeys(passwordTestData);
					
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
					
					
					 By loginProperty=By.className("button");
					 WebElement login=driver.findElement(loginProperty);
					 login.click();
					 System.out.println("logged in Succesfully ");
						
						System.out.println("-------------------------------------------------------------");
						System.out.println();
						
				
						
				
	//#########################Validating Home page Text###############	
						
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>			
						
			
						By welcomeAdminProperty=By.linkText("Welcome Admin");
						WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
						String welcomeAdminText=welcomeAdmin.getText();
						System.out.println("the Home page text is     -"+welcomeAdminText);
						System.out.println("-------------------------------------------------------------");
						System.out.println();
						
						
	   //################## Getting Attribute Value ###################
						
			String welcomeAdminAttributeValue=welcomeAdmin.getAttribute("href");
			System.out.println("Attribute value of href locater is    -"+welcomeAdminAttributeValue);
			welcomeAdmin.click();
			String currentUrl=driver.getCurrentUrl();
			System.out.println("the Actual Url of the home page is   -"+currentUrl);
					
	driver.quit();
	}

}
