package com.OrangeHRM_Inheritance;

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

public class AddEmployeeDetails extends OrangeHRM_LoginAndValidations  {
	
	
	
 	Row testDataSheetRow;
	public void addEmployee() 
	{
		
		By PIMProperty=By.linkText("PIM");
		WebElement PIM=driver.findElement(PIMProperty);

		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(PIM).build().perform();
		
		By addEmployeProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeProperty);
		
		addEmployee.click();
		
		
		
		
	}
	public void addEmployeeDetails() throws IOException
	{
		
			
		FileInputStream testDataFile =new FileInputStream("./src/com/OrangeHRM_Inheritance/AddEmployeeTestSheet.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
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
						
						System.out.println("First Name of the employee added -"+firstname1);	
						for(int MiddlenameIndex=15;MiddlenameIndex<16;MiddlenameIndex++ )
						{
							Cell middlenamecell=testDataSheetRow.getCell(MiddlenameIndex);
							String middlename1=middlenamecell.getStringCellValue();
							By middlenameProperty=By.id("middleName");
							WebElement middlenamefield=driver.findElement(middlenameProperty);
							middlenamefield.sendKeys(middlename1);
							System.out.println("Middle Name of the employee added -"+middlename1);
							for(int lastnameIndex=16;lastnameIndex<17;lastnameIndex++)
							{
								Cell lastnamecell=testDataSheetRow.getCell(lastnameIndex);
								String lastname1=lastnamecell.getStringCellValue();
								By lastNmaeProperty=By.id("lastName");
								WebElement lastnamefield=driver.findElement(lastNmaeProperty);
								lastnamefield.sendKeys(lastname1);
								System.out.println("Last name of the employee added -"+lastname1);
								
								
								By employeeIdProperty=By.name("employeeId");
								WebElement employeeId=driver.findElement(employeeIdProperty);
								String emloyeeidnumber=employeeId.getAttribute("value");
								
								System.out.println("employee Id is "+emloyeeidnumber);
								By employeeIDProperty=By.id("btnSave");
								WebElement employeeID=driver.findElement(employeeIDProperty);
								employeeID.click();
								driver.navigate().back();
								
								
								
							}
						}
					}
				
					
				
				}
	
				
				
	}		
			
				

	
	public static void main(String[] args) throws IOException {
		AddEmployeeDetails PIM =new AddEmployeeDetails();
		PIM.applicationLaunch();
		PIM.loginPageTextValidation();
		PIM.loginWithInvalidData();
		PIM.addEmployee();
		PIM.addEmployeeDetails();
		PIM.applicationClose();
		
		
		
		
		
		
	}
	
	

}
