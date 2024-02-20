package com.OrangreHRM_with_TestNG;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.Log;

public class AddEmployeeDetails extends LoginValidationsWithTestNG  {
	
	
	Row TestDataRow;
	Cell AddEmployeeValidationCell;
 	@Test(priority=3)
	public void addEmployeePageDirections() 
	{
		
		By PIMProperty=By.linkText("PIM");
		WebElement PIM=driver.findElement(PIMProperty);

		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(PIM).build().perform();
		
		By addEmployeProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeProperty);
		
		addEmployee.click();
	//<label class="hasTopFieldHelp">Full Name</label>
		By addEmployeePageTextProprty=By.className("hasTopFieldHelp");
		WebElement AddEmployeePageText=driver.findElement(addEmployeePageTextProprty);
		String actualAddEmployeePageText=AddEmployeePageText.getText();
		sheet = workbook.getSheet("Sheet1");
		TestDataRow=sheet.getRow(1);
		Cell AddEmployeeValidationCell=TestDataRow.createCell(12);
		AddEmployeeValidationCell.setCellValue(actualAddEmployeePageText);
		
		Log.info("Expected AddEmployeePageText is  "+" = "+actualAddEmployeePageText);
			
		sheet = workbook.getSheet("Sheet1");
			 TestDataRow=sheet.getRow(1);
			Cell TestDataRowofCell=TestDataRow.getCell(11);
			String expectedAddEmployeePageText =TestDataRowofCell.getStringCellValue();			
			Log.info("Expected AddEmployeePageText is  "+" = " +expectedAddEmployeePageText);
			if(actualAddEmployeePageText.equals(expectedAddEmployeePageText))
			{
				Log.info("Expected AddEmployeePageText is matching with Actaul AddEmployeePageText-PASS");
				sheet = workbook.getSheet("Sheet1");
				TestDataRow=sheet.getRow(1);
				AddEmployeeValidationCell=TestDataRow.createCell(13);
				AddEmployeeValidationCell.setCellValue("PASS");
			}
			else
			{
				Log.info("Expected AddEmployeePageText is NOT matching with Actaul AddEmployeePageText-FAIL");
				sheet = workbook.getSheet("Sheet1");
				TestDataRow=sheet.getRow(1);
				AddEmployeeValidationCell=TestDataRow.createCell(13);
				AddEmployeeValidationCell.setCellValue("FAIL");
				
			}
			
			Log.info("---------------------------------------------------------------------------------------------");	
	}
 	
 	@Test(priority=4)
	public void addEmployeeDetails_Multiple_Data() throws IOException, InterruptedException
	{
		
			
//		FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM_Inheritance/AddEmployeeTestSheet.xlsx");
//		XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
		 sheet = workbook.getSheet("Sheet1");
		
		
//		testDataSheetRow.createCell(17).setCellValue(emloyeeidnumber);
		
		
				int RowCount=sheet.getLastRowNum();
				for(int rowIndex=1;rowIndex<=RowCount;rowIndex++)
				{
				Row testDataSheetRow =sheet.getRow(rowIndex);
				
					for(int firstnameIndex=14;firstnameIndex<15;firstnameIndex++)
					{
						
						By addEmplfirstnameProperty=By.id("firstName");
						WebElement addEmplFirstname=driver.findElement(addEmplfirstnameProperty);
						Cell firtnamecell =testDataSheetRow.getCell(firstnameIndex);
						
						String firstname1=firtnamecell.getStringCellValue();		
						addEmplFirstname.sendKeys(firstname1);
						
						Log.info("First Name of the employee added -"+firstname1);	
						for(int MiddlenameIndex=15;MiddlenameIndex<16;MiddlenameIndex++ )
						{
							Cell middlenamecell=testDataSheetRow.getCell(MiddlenameIndex);
							String middlename1=middlenamecell.getStringCellValue();
							By middlenameProperty=By.id("middleName");
							WebElement middlenamefield=driver.findElement(middlenameProperty);
							middlenamefield.sendKeys(middlename1);
							Log.info("Middle Name of the employee added -"+middlename1);
							for(int lastnameIndex=16;lastnameIndex<17;lastnameIndex++)
							{
								Cell lastnamecell=testDataSheetRow.getCell(lastnameIndex);
								String lastname1=lastnamecell.getStringCellValue();
								By lastNmaeProperty=By.id("lastName");
								WebElement lastnamefield=driver.findElement(lastNmaeProperty);
								lastnamefield.sendKeys(lastname1);
								Log.info("Last name of the employee added -"+lastname1);
								By employeeIdProperty=By.name("employeeId");
								WebElement employeeId=driver.findElement(employeeIdProperty);
								String emloyeeidnumber=employeeId.getAttribute("value");
								Log.info("employee Id is "+emloyeeidnumber);

								
								By employeeIDProperty=By.id("btnSave");
								WebElement employeeID=driver.findElement(employeeIDProperty);
				//---------------------------------------------------------------------------------				
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell EmployeeInumberdCell=TestDataRow.createCell(17);
								EmployeeInumberdCell.setCellValue(emloyeeidnumber);
				//-----------------------------------------------------------------------------------------				
								
				//---------------------------------------------------------------------------------------				
				
								employeeID.click();
				//-------------------------------------------------------------------------------------				
								By PersonalDetailsPageTextProprty=By.className("hasTopFieldHelp");
								WebElement PersonalDetailsPageText=driver.findElement(PersonalDetailsPageTextProprty);
								String actualPersonalDetailsPageText=PersonalDetailsPageText.getText();
								
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(1);
								Cell actualPersonalDetailsPageTextCell=TestDataRow.createCell(19);
								actualPersonalDetailsPageTextCell.setCellValue(actualPersonalDetailsPageText);
								
								
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(1);
								Cell expectedPersonalDetailsPageTextCell=TestDataRow.getCell(18);
								String expectedPersonalDetailsPageText=expectedPersonalDetailsPageTextCell.getStringCellValue();
								if(actualPersonalDetailsPageText.equals(expectedPersonalDetailsPageText))
								{
									Log.info("Actual personal details page text is matching with Expected personal details page-PASS");
									sheet = workbook.getSheet("Sheet1");
									TestDataRow=sheet.getRow(1);
									Cell PersonalDetailsPageResultsTextCell=TestDataRow.createCell(20);
									PersonalDetailsPageResultsTextCell.setCellValue("PASS");
									
									
									
								}
								else
								{
										Log.info("Actual personal details page text is NOT matching with Expected personal details page-FAIL");
								
										sheet = workbook.getSheet("Sheet1");
										TestDataRow=sheet.getRow(1);
										Cell PersonalDetailsPageResultsTextCell=TestDataRow.createCell(20);
										PersonalDetailsPageResultsTextCell.setCellValue("FAIL");
										Log.info("Actual personal details page text is matching with Expected personal details page-PASS");
								}
								
			//-----------------------------------------------------------------------------------------------------------------------------					
								
								
								By Firstname_PeronalDetailsProperty=By.id("personal_txtEmpFirstName");
								WebElement Firstname_PeronalDetails=driver.findElement(Firstname_PeronalDetailsProperty);
								
								
								
								String actualFirstname=Firstname_PeronalDetails.getAttribute("value");
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell ActualFirstnameCell=TestDataRow.createCell(21);
								ActualFirstnameCell.setCellValue(actualFirstname);
				//------------------------------------------------------------------------------------				
								

								By MiddleName_PeronalDetailsProperty=By.id("personal_txtEmpMiddleName");
								WebElement MiddleName_PeronalDetails=driver.findElement(MiddleName_PeronalDetailsProperty);
								
								
								
								String actualMiddlename=MiddleName_PeronalDetails.getAttribute("value");
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell ActualmiddleNameCell=TestDataRow.createCell(23);
								ActualmiddleNameCell.setCellValue(actualMiddlename);
				//---------------------------------------------------------------------------------				
							//personal_txtEmpLastName	
								
								By LastName_PeronalDetailsProperty=By.id("personal_txtEmpLastName");
								WebElement LastName_PeronalDetails=driver.findElement(LastName_PeronalDetailsProperty);
								
								
							
								String actualLastname=LastName_PeronalDetails.getAttribute("value");
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell ActualLastNameCell=TestDataRow.createCell(25);
								ActualLastNameCell.setCellValue(actualLastname);
		//-----------------------------------------------------------------------------------		
								By actualEmployeeIDProperty=By.id("personal_txtEmployeeId");
								WebElement actualEmployyeID=driver.findElement(actualEmployeeIDProperty);
								String actualEmployyeIdValue=actualEmployyeID.getAttribute("value");
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell actualEmployeeInumberdCell=TestDataRow.createCell(27);
								actualEmployeeInumberdCell.setCellValue(actualEmployyeIdValue);
								Log.info("Actual employeeId is "+actualEmployyeIdValue);
								if(actualEmployyeIdValue.equals(emloyeeidnumber))
								{
									sheet = workbook.getSheet("Sheet1");
									TestDataRow=sheet.getRow(rowIndex);
									Cell employeeIdResultCell=TestDataRow.createCell(28);
									employeeIdResultCell.setCellValue("PASS");
									Log.info("Actual Employee Id is matching with Expected Expected Employee Id-PASS");
								}
								else
								{
									sheet = workbook.getSheet("Sheet1");
									TestDataRow=sheet.getRow(rowIndex);
									Cell employeeIdResultCell=TestDataRow.createCell(28);
									employeeIdResultCell.setCellValue("FAIL");
									Log.info("Actual Employee Id is NOT matching with Expected Expected Employee Id-FAIL");
								}
								
								
//---------------------------------------------------------------------------------------------------								
								
							if(actualFirstname.equals(firstname1))
							{
								Log.info("Actual Employee firstNamme is  matching with Expected Expected Employee fiestname -PASS");
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell FirstnameResultCell=TestDataRow.createCell(22);
								FirstnameResultCell.setCellValue("PASS");
								
							}
							else
							{
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell FirstnameResultCell=TestDataRow.createCell(22);
								FirstnameResultCell.setCellValue("PASS");
								//Log.info("FAIL");	
							}
							if(actualMiddlename.equals(middlename1))
							{
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell MiddleNameResultCell=TestDataRow.createCell(24);
								MiddleNameResultCell.setCellValue("PASS");
								//Log.info("FAIL");	
							}
							else
							{
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell MiddleNameResultCell=TestDataRow.createCell(24);
								MiddleNameResultCell.setCellValue("FAIL");
								//Log.info("FAIL");	
							}	
							
							if(actualLastname.equals(lastname1))
							{
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell LastNameResultCell=TestDataRow.createCell(26);
								LastNameResultCell.setCellValue("PASS");
								//Log.info("PASS");	
							}
							else
							{
								sheet = workbook.getSheet("Sheet1");
								TestDataRow=sheet.getRow(rowIndex);
								Cell LastNameResultCell=TestDataRow.createCell(26);
								LastNameResultCell.setCellValue("FAIL");
								//Log.info("FAIL");	
							}	
							
							
							
								
								
								
								
								driver.navigate().back();
								Thread.sleep(1000);
								driver.navigate().refresh();
								
							}
						}
					}
				
					
				
				
			}
				
	}
			
@Test(priority=5)			
public void verification_loginPage_AfterLogout() throws InterruptedException
{
	
	
 	
	By welcomeAdminProperty=By.linkText("Welcome Admin");
	 WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
	 welcomeAdmin.click();
	
	Thread.sleep(5000);
	By logoutPropperty=By.linkText("Logout");
	//By logoutPropperty=By.partialLinkText("out");
	WebElement logout=driver.findElement(logoutPropperty);
	logout.click();
	
	
	sheet = workbook.getSheet("Sheet1"); 
	TestDataRow=sheet.getRow(1);
	Cell TestDataRowofCell=TestDataRow.getCell(29);
	String expectedTexteOfLoginPage=TestDataRowofCell.getStringCellValue();			
	Log.info("Expected text of the current Webpage after Log out is "+" = " +expectedTexteOfLoginPage);
	
	
	By loginpanelHeadingProperty=By.id("logInPanelHeading");
	WebElement actualTexteOfLoginPageEle=driver.findElement(loginpanelHeadingProperty);
	 String actualTexteOfLoginPage=actualTexteOfLoginPageEle.getText();	
	 
	 	sheet = workbook.getSheet("Sheet1"); 
		TestDataRow=sheet.getRow(1);
		Cell actualTexteOfLoginPageCell=TestDataRow.createCell(30);
		actualTexteOfLoginPageCell.setCellValue(actualTexteOfLoginPage);
			
			
	
    
	if(actualTexteOfLoginPage.equals(expectedTexteOfLoginPage))
	{
		Log.info("The actual text of the login web page is MATCHING with the expected title after logout -PASS ");
		sheet = workbook.getSheet("Sheet1"); 
		TestDataRow=sheet.getRow(1);
		Cell loginDataResults_text_RowofCell=TestDataRow.createCell(31);
		loginDataResults_text_RowofCell.setCellValue("PASS");
		
		
	}
	else
	{
		Log.info("The actual text of the login web page is NOT MATCHING with the expected title after logout -FAIL ");
		sheet = workbook.getSheet("Sheet1"); 
		TestDataRow=sheet.getRow(1);
		Cell loginDataResults_text_RowofCell=TestDataRow.createCell(31);
		loginDataResults_text_RowofCell.setCellValue("FAIL");
		
	}
	
	
	sheet = workbook.getSheet("Sheet1"); 
	TestDataRow=sheet.getRow(1);
	Cell loginDataResults_text_RowofCell=TestDataRow.createCell(32);
	loginDataResults_text_RowofCell.setCellValue("PASS");
	
	
}
							
			
						
		
	}
	
	

