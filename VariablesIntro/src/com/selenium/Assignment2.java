package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
			//Assigning URL to a variable to pass Dynamically.......................................... 
		
				ChromeDriver driver = new ChromeDriver(); 
				driver.get(ApplicationURLAddress);
				
				
//############### Title Verification and Validation of Login page ############
				
				 System.out.println("-------------------------------------------------------------");
				 System.out.println();		 
				 String actualTitleOfLoginPage=driver.getTitle();
				 System.out.println("Actual title of the current Webpage is "+"          = "+actualTitleOfLoginPage);
				 String expectedTitleOfLoginPage="OrangeHRM";
			     System.out.println("Expected title of the current Webpage should be "+" = " +expectedTitleOfLoginPage);		 
				
			     
				if(actualTitleOfLoginPage.equals(expectedTitleOfLoginPage))
				{
					System.out.println("The actual title of the login web page is MATCHING with the expected title -PASS ");
				}
				else
				{
					System.out.println("The actual title of the login web page is NOT MATCHING with the expected title -FAIL ");
				}
				
				System.out.println("-------------------------------------------------------------");
				System.out.println();
				
//################## URL verification and Validation of Login Page ###################
				
				String actualUrlOfLoginPage=driver.getCurrentUrl();
				System.out.println("Actual URL of the Login Page is     -"+actualUrlOfLoginPage);
				String expectedUrlOfLoginPage="orangehrm-4.2.0.1";
				System.out.println("Expected URL of the Login Page is   -"+expectedUrlOfLoginPage);
				
				if(actualUrlOfLoginPage.contains(expectedUrlOfLoginPage))
				{
					System.out.println("The Acual URL of the Login Page is has Expected URL of the Login Page -PASS");
				}
				else
				{
					System.out.println("The Acual URL of the Login Page is does not have Expected URL of the Login Page -FAIL");
				}
				
				System.out.println("-------------------------------------------------------------");
				System.out.println();
					
				
//######################## Validating the Login Page Text ####################
		                
				//<div id="logInPanelHeading">LOGIN Panel</div>	
				
				By loginPanelHeadingProperty=By.id("logInPanelHeading");
				WebElement actualLoginPanel=driver.findElement(loginPanelHeadingProperty);
				String actualLoginPaneltext=actualLoginPanel.getText();
				System.out.println("Actual Login Panel Text of login is   -"+actualLoginPaneltext);
				String expectedLoginPaneltext="LOGIN Panel";
				System.out.println("Expected Login Panel text of Login is -"+expectedLoginPaneltext);
				
				if(actualLoginPaneltext.equals(expectedLoginPaneltext))
				{
				  System.out.println("Login Panel Text is smae -PASS");
					
				}
				else
				{
					System.out.println("Login Panel Text is Not same -FAIL ");
				}
									
			    System.out.println("-------------------------------------------------------------");
				System.out.println();
					
							
				
//############## Automating Login  #########################################	
				
				//<input name="txtUsername" id="txtUsername" type="text">	
			
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
				 System.out.println("Login is Done and it is redirected to Dashboard ............ ");
			
				System.out.println("-------------------------------------------------------------");
				System.out.println();
			
			
//################## Title Verification and Validation of Home Page ################################	
			
			 String actualTitleOfHomePage=driver.getTitle();
			 System.out.println("Actual title of the current Webpage is "+"= "+actualTitleOfHomePage);
			 String expectedTitleOfHomePage="OrangeHRM";
		     System.out.println("Expected title of the HomePage should be "+"= " +expectedTitleOfHomePage);
				
				if(actualTitleOfHomePage.equals(expectedTitleOfHomePage))
				{
					System.out.println("The actual title of the Home page is MATCHING with the expected title -PASS ");
				}
				else
				{
					System.out.println("The actual title of the Home page is NOT MATCHING with the expected title -FAIL ");
				}
				
				System.out.println("-------------------------------------------------------------");
				System.out.println();
				
//######################### Verification and Validation of Home page Text ###############	
				
				//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>			
				
				By welcomeAdminProperty=By.linkText("Welcome Admin");
				 WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
				 welcomeAdmin.click();
				 System.out.println("WelcomeAdmin link is Successfully opened ");
				 System.out.println("-------------------------------------------------------------");
				 System.out.println();
				 
				String actualWelcomeAdminText=welcomeAdmin.getText();
				System.out.println("the Actual Home page text is     -"+actualWelcomeAdminText);
				String expectedWelcomeAdmintext="Welcome";
				System.out.println("The Expected HomePage Text is    -"+expectedWelcomeAdmintext);
				
				if(actualWelcomeAdminText.contains(expectedWelcomeAdmintext))
				{
					System.out.println("PASS");
					
				}
				else
				{
				System.out.println("FAIL");
					
				}
				
				System.out.println("-------------------------------------------------------------");
				System.out.println();
			
				
//################### Automating Logout ###################################################
				
			//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>	
				 
				Thread.sleep(5000);
				By logoutPropperty=By.linkText("Logout");
				//By logoutPropperty=By.partialLinkText("out");
				WebElement logout=driver.findElement(logoutPropperty);
				logout.click();
				
				
				
				System.out.println("logged out.......");
				
				driver.close();		
			
	
	}
}
