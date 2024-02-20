package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.OrangreHRM_with_TestNG.BaseTest;

public class WebTable_OrangeHRM extends BaseTestHRM{
	 XSSFWorkbook workBook;
	 XSSFSheet testDataSheet;
	 
	@Test(priority=1)
	public void Login_OrangeHRM() throws IOException

	{
	String validUsername="nareshgoudmetri";	
	By usernameProperty=By.id("txtUsername");
	WebElement usernamefield=driver.findElement(usernameProperty);	
	usernamefield.sendKeys(validUsername);
	
	String validPassword="Naresh@1406"; 
	By passwordProperty=By.id("txtPassword");
	WebElement passwordfield=driver.findElement(passwordProperty);
	passwordfield.sendKeys(validPassword);
		
	By loginProperty=By.id("btnLogin");
	WebElement loginbutton=driver.findElement(loginProperty);
	loginbutton.click();
		
	By PIMProperty=By.linkText("PIM");
	WebElement PIM=driver.findElement(PIMProperty);

	Actions mouseHoverOperation = new Actions(driver);
	mouseHoverOperation.moveToElement(PIM).build().perform();
	
	By employeelistProperty=By.id("menu_pim_viewEmployeeList");
	WebElement Employeelist=driver.findElement(employeelistProperty);
	Employeelist.click();
	
	
	///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/
	
	//	/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]
		
	//html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead
		// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr
	
	
	
	

	
	FileInputStream File = new FileInputStream("./src/practice/Employee_list.xlsx");
	workBook = new XSSFWorkbook(File);
	testDataSheet= workBook.getSheet("Sheet2");
	
	 	By employeelistWebTableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
		WebElement webTable=driver.findElement(employeelistWebTableProperty);
		List<WebElement>rows=webTable.findElements(By.tagName("tr"));
		
		
	 	By tableHeadProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead");
	 	WebElement tableHead=driver.findElement(tableHeadProperty);
		Row HeaderRowInExcel=testDataSheet.createRow(0);
		WebElement tableheadrow=tableHead.findElement(By.tagName("tr")); 
	 	
	 
	 	
		
		
		for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
		{
			 WebElement activeRow=rows.get(rowIndex);
			 Row RowsInExcel=testDataSheet.createRow(rowIndex);
			 
			 List<WebElement>activecells=activeRow.findElements(By.tagName("td"));
			
			 List<WebElement>tableHeaderCells=tableheadrow.findElements(By.tagName("th"));
			 
			 
			for(int rowofCellIndex=0;rowofCellIndex<activecells.size();rowofCellIndex++)
			{
				WebElement activeCell=activecells.get(rowofCellIndex);
				String cellValue=activeCell.getText();
				Cell cellofTable=RowsInExcel.createCell(rowofCellIndex);
				cellofTable.setCellValue(cellValue);
			//----------------------------------------------------------------------------	
				
				WebElement headerCellBlock=tableHeaderCells.get(rowofCellIndex);
				String headertext=headerCellBlock.getText();
				Cell HeaderCell=HeaderRowInExcel.createCell(rowofCellIndex);
				HeaderCell.setCellValue(headertext);
				
				
				//System.out.println(cellValue);
			}
		
		

	}
	
	}	
	
	
	@Test(priority=2)
	public void ExcelSave() throws IOException
	{
	FileOutputStream AddEmployyeDataResults =new FileOutputStream("./src/practice/Employee_list.xlsx");
	 workBook.write(AddEmployyeDataResults);
	}
}


