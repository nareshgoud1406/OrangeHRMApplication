package com.utility_OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utility.Log;

public class LoginValidationsWithTestNG extends BaseTest {
	
	FileInputStream testDataFile;
	XSSFSheet sheet;
 	XSSFWorkbook workbook;
 
	
 	@Test(priority=1)
	public void loginPageTextValidation() throws IOException
	{
			
		
		 	testDataFile =new FileInputStream(".src/com/utility_OrangeHRM/AddEmployeeTestSheet.xlsx");
		 	workbook =new XSSFWorkbook(testDataFile);
		 	sheet = workbook.getSheet("Sheet1"); 
			Row TestDataRow=sheet.getRow(1);
			Cell TestDataRowofCell=TestDataRow.getCell(0);
			String expectedTexteOfLoginPage=TestDataRowofCell.getStringCellValue();			
			Log.info("Expected text of the current Webpage is "+" = " +expectedTexteOfLoginPage);
			
			//<div id="logInPanelHeading">LOGIN Panel</div>
			By loginPanelProperty=By.id("logInPanelHeading");
			WebElement loginpaneltext=driver.findElement(loginPanelProperty);
			String actualTextOfLoginPage=loginpaneltext.getText();
			
			 Log.info("Actual text of the current Webpage is "+"= "+actualTextOfLoginPage);
			 TestDataRow.createCell(1).setCellValue(actualTextOfLoginPage);
			 
			 
	     
		if(actualTextOfLoginPage.equals(expectedTexteOfLoginPage))
		{
			
			Log.info("The actual text of the login web page is MATCHING with the expected text -PASS ");
			String LoginPageTextReults="PASS";
			TestDataRow.createCell(2).setCellValue(LoginPageTextReults);
			
		}
		
		else
		{
			Log.info("The actual text of the login web page is NOT MATCHING with the expected text -FAIL ");
			String LoginPageTextReults=" FAIL";
			TestDataRow.createCell(3).setCellValue(LoginPageTextReults);
		}
		
	
		
		Log.info("------------------------------------------------------------------");
	}
	
	

 	@Test(priority=2)
	public void loginWithData() throws IOException 
	{
//		testDataFile =new FileInputStream("./src/com/OrangeHRM_Inheritance/AddEmployeeTestSheet.xlsx");
//		workbook =new XSSFWorkbook(testDataFile);
//		sheet = workbook.getSheet("Sheet1");
		Row TestDataRow=sheet.getRow(1);
		Cell TestDataRowofCell=TestDataRow.getCell(3);
		String invalidUsername =TestDataRowofCell.getStringCellValue();			
		Log.info("Username of invalid test data is  "+" = " +invalidUsername);
		By usernameProperty=By.id("txtUsername");
		WebElement usernamefield=driver.findElement(usernameProperty);
		usernamefield.sendKeys(invalidUsername);
		

		TestDataRowofCell=TestDataRow.getCell(4);
		String invalidPassword =TestDataRowofCell.getStringCellValue();			
		Log.info("Password of invalid test data is  "+" = " +invalidPassword);
		By passwordProperty=By.id("txtPassword");
		WebElement passwordfield=driver.findElement(passwordProperty);
		passwordfield.sendKeys(invalidUsername);
		
		By loginProperty=By.id("btnLogin");
		WebElement loginbutton=driver.findElement(loginProperty);
		loginbutton.click();
		
		By spanMessegeProperty=By.id("spanMessage");
		WebElement spanMessege=driver.findElement(spanMessegeProperty);
		String actuallogipagetext=spanMessege.getText();
		TestDataRow.createCell(6).setCellValue(actuallogipagetext);
		Log.info("Actual login page text after invalid test data "+"-"+actuallogipagetext);
		
		TestDataRowofCell=TestDataRow.getCell(5);
		String expectedloginpagetext =TestDataRowofCell.getStringCellValue();
		Log.info("Expected login page text after invalid test data "+"-"+expectedloginpagetext);
		
		if(actuallogipagetext.equals(expectedloginpagetext))
		{
			Log.info("Login with invalid is done and it is not directed to homepage-PASS");
			String LoginPageTextReults="PASS";
			TestDataRow.createCell(7).setCellValue(LoginPageTextReults);
		}
		else
		{
			String LoginPageTextReults="FAIL";
			TestDataRow.createCell(7).setCellValue(LoginPageTextReults);	
		}
		Log.info("------------------------------------------------------------------");
		
		driver.navigate().back();
		
	
		String validUsername="nareshgoudmetri";
		usernamefield.clear();
		usernamefield.sendKeys(validUsername);
		Log.info("valid username given as "+validUsername);
		
		String validPassword="Naresh@1406";
		passwordfield.clear();
		passwordfield.sendKeys(validPassword);
		Log.info("valid username given as "+validPassword);
		loginbutton.click();
		
		Log.info("------------------------------------------------------------------");
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welcomeAdminProperty=By.linkText("Welcome Admin");
		WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
		String actualTitleOfHomePage=welcomeAdmin.getText();
		Cell actualTitleOfHomePageCell=TestDataRow.createCell(9);
		actualTitleOfHomePageCell.setCellValue(actualTitleOfHomePage);
		Log.info("Actual tile of the Homepage is  "+"-"+actualTitleOfHomePage );
		Cell expectedTitleOfHomePageCell=TestDataRow.getCell(8);
		String expectedTitleOfHomePage=expectedTitleOfHomePageCell.getStringCellValue();
		Log.info("Expected tile of the Homepage is  "+"-"+expectedTitleOfHomePage );
		
		
			if(actualTitleOfHomePage.contains(expectedTitleOfHomePage))
			{
				Log.info("The actual title of the Home page is CONTAINSthe expected title -PASS ");
				Cell HomepageResultcell=TestDataRow.createCell(10);
				HomepageResultcell.setCellValue("The actual title of the Home page is CONTAINSthe expected title -PASS");
			}
			else
			{
				Log.info("The actual title of the Home page is NOT CONTAINS the expected title -FAIL ");
				Cell HomepageResultcell=TestDataRow.createCell(10);
				HomepageResultcell.setCellValue("The actual title of the Home page is NOT CONTAINS the expected title -FAIL");
			}	
			
		
			Log.info("------------------------------------------------------------------");
		
		
				
	

	}
 		@Test(priority=6)
 		public void excel_save() throws IOException {
		FileOutputStream AddEmployyeDataResults =new FileOutputStream(".src/com/utility_OrangeHRM/AddEmployeeTestSheet.xlsx");
		workbook.write(AddEmployyeDataResults);
 		}

	

	

}
