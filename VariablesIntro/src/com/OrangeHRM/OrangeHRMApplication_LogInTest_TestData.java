package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMApplication_LogInTest_TestData {

	public static void main(String[] args) throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
	//Assigning URL to a variable to pass Dynamically.......................................... 
		
				ChromeDriver driver = new ChromeDriver(); 
				driver.get(ApplicationURLAddress);
				
				
//############### Title Verification and Validation of Login page ############
				
				 System.out.println("-------------------------------------------------------------");
				 System.out.println();		 
				 String actualTitleOfLoginPage=driver.getTitle();
				 System.out.println("Actual title of the current Webpage is "+"= "+actualTitleOfLoginPage);
				 String expectedTitleOfLoginPage="OrangeHRM";
			     System.out.println("Expected title of the current Webpage should be "+"= " +expectedTitleOfLoginPage);		 
				
			     
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
				System.out.println("Actual URL of the Login Page is  "+actualUrlOfLoginPage);
				String expectedUrlOfLoginPage="orangehrm-4.2.0.1";
				System.out.println("Expected URL of the Login Page is   "+expectedUrlOfLoginPage);
				
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
					
//############## Automating Login  #########################################	
				
				//<input name="txtUsername" id="txtUsername" type="text">	
			
			
				//String usernameTestData="nareshgoudmetri";
				
//#################### Aditional code For Getting/Reading  data from Excel ############################	
				
			FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM/LoginTestData.xlsx");
			XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			Row testDataSheetRow =sheet.getRow(1);
			Cell testDataSheetRowofCell =testDataSheetRow.getCell(0);
			String usernameTestData=testDataSheetRowofCell.getStringCellValue();
			
			By usernameProperty=By.id("txtUsername");
			WebElement username=driver.findElement(usernameProperty);
			username.sendKeys(usernameTestData);
			
//#####################################################################################################
			
				//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			
			
			Cell PasswordRowofCell=testDataSheetRow.getCell(1);
			String passwordTestData=PasswordRowofCell.getStringCellValue();
			By passwordProperty=By.id("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(passwordTestData);
			
			//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			
			
			 By loginProperty=By.className("button");
			 WebElement login=driver.findElement(loginProperty);
			 login.click();
			
						
//#####################Creating only row of cell and writing #####################################
		//Row newrow =sheet.createRow(1);	
		Cell newrowofcell=testDataSheetRow.createCell(2);
		newrowofcell.setCellValue("Login is Done and it is redirected to Dashboard");
			
//#################################################################################################
//################## Title Verification and Validation of Home Page ###############################	
		System.out.println("-------------------------------------------------------------");
		System.out.println();
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
			
	//############################### MOUSE OVER OPERATIONS ##################################################
		
		//<b>PIM</b>
			By PIMProperty=By.linkText("PIM");
			WebElement PIM=driver.findElement(PIMProperty);

			Actions mouseHoverOperation = new Actions(driver);
			mouseHoverOperation.moveToElement(PIM).build().perform();
			PIM.click();
			
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
			Thread.sleep(5000);
			
			By addEmployeProperty=By.id("menu_pim_addEmployee");
			WebElement addEmployee=driver.findElement(addEmployeProperty);
			
			//Actions addEmployyemmouseover=new Actions(driver);
			//addEmployyemmouseover.moveToElement(addEmployee).build().perform();
			addEmployee.click();
			
			
			
			
			
	//################################# Adding Employee Details ############################## 
			
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
			 
			
			 	testDataSheetRow =sheet.getRow(1);
				Cell firtnamecell =testDataSheetRow.getCell(3);
				String firstname1=firtnamecell.getStringCellValue();
				By addEmplfirstnameProperty=By.id("firstName");
				WebElement addEmplFirstname=driver.findElement(addEmplfirstnameProperty);
				addEmplFirstname.sendKeys(firstname1);
				System.out.println("First Name of the employee added -"+firstname1);
				
//####################################################################	
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">		
				Cell middlenamecell=testDataSheetRow.getCell(4);
				String middlename1=middlenamecell.getStringCellValue();
				By middlenameProperty=By.id("middleName");
				WebElement middlenamefield=driver.findElement(middlenameProperty);
				middlenamefield.sendKeys(middlename1);
				System.out.println("Middle Name of the employee added -"+middlename1);
				
//######################################################################################
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
				
			Cell lastnamecell=testDataSheetRow.getCell(5);
			String lastname1=lastnamecell.getStringCellValue();
			By lastNmaeProperty=By.id("lastName");
			WebElement lastnamefield=driver.findElement(lastNmaeProperty);
			lastnamefield.sendKeys(lastname1);
			System.out.println("Last name of the employee added -"+lastname1);
			
			By employeeIdProperty=By.name("employeeId");
			WebElement employeeId=driver.findElement(employeeIdProperty);
			String emloyeeidnumber=employeeId.getAttribute("value");
			System.out.println("employee Id "+emloyeeidnumber);
			Cell employeeid1=testDataSheetRow.createCell(6);
			employeeid1.setCellValue(emloyeeidnumber);
			
			
//############################## SAVE BUTTON #################################
		//<input type="button" class="" id="btnSave" value="Save">
			By savebuttonProperty=By.id("btnSave");
			WebElement savebutton=driver.findElement(savebuttonProperty);
			savebutton.click();
//##################################################################
			
			
			
			
	
		
			
			
				
			FileOutputStream TestDataResults =new FileOutputStream("src/com/OrangeHRMResults/LoginTestData.xlsx");
			workbook.write(TestDataResults);
			 
			
		
			System.out.println("-------------------------------------------------------------");
			System.out.println();
		

		
			driver.quit();
		
		
		
		
		
		
		
		

	}

}
