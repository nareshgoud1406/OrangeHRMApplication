package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Assignment_UserDefined_Methods {
	
	WebDriver driver;
	Row testDataSheetRow;
	
	

	public void initiatingBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver = new ChromeDriver(); 
		driver.get(ApplicationURLAddress);
		
	}
	
	public void loginPageTitleValidation()
	{
			
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
		
		
	}
	
	public void loginpageURLValidation()
	{
		
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
			
	
	}
	public void loginOrangeHRM() throws IOException
	{
		
		
		//<input name="txtUsername" id="txtUsername" type="text">	
	
		
	FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM/LoginTestData.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	Row testDataSheetRow =sheet.getRow(1);
	Cell testDataSheetRowofCell =testDataSheetRow.getCell(0);
	String usernameTestData=testDataSheetRowofCell.getStringCellValue();
	
	By usernameProperty=By.id("txtUsername");
	WebElement username=driver.findElement(usernameProperty);
	username.sendKeys(usernameTestData);
	
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

}
	
public void homePageTitleValidation()
{

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
}
public void mouseoverPIM() {
	
	By PIMProperty=By.linkText("PIM");
	WebElement PIM=driver.findElement(PIMProperty);

	Actions mouseHoverOperation = new Actions(driver);
	mouseHoverOperation.moveToElement(PIM).build().perform();
	PIM.click();

}


public void addEmployeelink() throws InterruptedException
{
	Thread.sleep(5000);
	By addEmployeProperty=By.id("menu_pim_addEmployee");
	WebElement addEmployee=driver.findElement(addEmployeProperty);
	
	//Actions addEmployyemmouseover=new Actions(driver);
	//addEmployyemmouseover.moveToElement(addEmployee).build().perform();
	addEmployee.click();
	
	
	
	
}

public void addingEmployeefirstname() throws IOException
{
	FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM/LoginTestData.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	By addEmplfirstnameProperty=By.id("firstName");
	WebElement addEmplFirstname=driver.findElement(addEmplfirstnameProperty);
	testDataSheetRow =sheet.getRow(1);
	Cell firtnamecell =testDataSheetRow.getCell(3);
	String firstname1=firtnamecell.getStringCellValue();
	addEmplFirstname.sendKeys(firstname1);
	System.out.println("First Name of the employee added -"+firstname1);	
	
}

public void excel() throws IOException {
	
	FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM/LoginTestData.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	testDataSheetRow =sheet.getRow(1);
	
	
	
	
	
}





public void addingEmployeemiddlename() throws IOException
{

	By middlenameProperty=By.id("middleName");
	WebElement middlenamefield=driver.findElement(middlenameProperty);

	FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM/LoginTestData.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	testDataSheetRow =sheet.getRow(1);
	Cell middlenamecell=testDataSheetRow.getCell(4);
	String middlename1=middlenamecell.getStringCellValue();
	middlenamefield.sendKeys(middlename1);
	System.out.println("Middle Name of the employee added -"+middlename1);
	
}
public void addingEmployeelastName() throws IOException
{
	Cell lastnamecell=testDataSheetRow.getCell(5);
	String lastname1=lastnamecell.getStringCellValue();
	By lastNmaeProperty=By.id("lastName");
	FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM/LoginTestData.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	testDataSheetRow =sheet.getRow(1);
	WebElement lastnamefield=driver.findElement(lastNmaeProperty);
	lastnamefield.sendKeys(lastname1);
	System.out.println("Last name of the employee added -"+lastname1);
		
}

public void employeeId()
{
	By employeeIdProperty=By.name("employeeId");
	WebElement employeeId=driver.findElement(employeeIdProperty);
	String emloyeeidnumber=employeeId.getAttribute("value");
	System.out.println("employee Id "+emloyeeidnumber);
	Cell employeeid1=testDataSheetRow.createCell(6);
	employeeid1.setCellValue(emloyeeidnumber);
}


	
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		OrangeHRM_Assignment_UserDefined_Methods browser=new OrangeHRM_Assignment_UserDefined_Methods();
		

		browser.initiatingBrowser();
		browser.loginPageTitleValidation();
		browser.loginpageURLValidation();
		browser.loginOrangeHRM();
		browser.homePageTitleValidation();
		browser.mouseoverPIM();
		browser.addEmployeelink();
		browser.addingEmployeefirstname();
		browser.addingEmployeemiddlename();
		browser.addingEmployeelastName();
		browser.employeeId();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
