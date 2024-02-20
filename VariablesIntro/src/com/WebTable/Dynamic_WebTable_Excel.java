package com.WebTable;

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
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dynamic_WebTable_Excel extends BaseTest   {
	
	WebElement driver;
	XSSFWorkbook workBook;
	@Test
	public void getData_DynamicWebTable() throws IOException
	{
	// WebTable Property
	// /html/body/div[5]/section[1]/div

	// Identifying the WebTable
	
	
	FileInputStream File = new FileInputStream("./src/com/selenium/WebTableTestDataFile.xlsx");
	 workBook = new XSSFWorkbook(File);
	XSSFSheet testDataSheet = workBook.getSheet("TestData");
	
	By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webTableProperty);
	List<WebElement>rows=webTable.findElements(By.tagName("tr"));
	

	for(int rowIndex=1;rowIndex<=rows.size();rowIndex++)
	{
		
		Row newRow=testDataSheet.createRow(rowIndex);
		WebElement WebTablerow=rows.get(rowIndex);	
		List<WebElement>webTableRowOfCells=WebTablerow.findElements(By.tagName("td"));
	
	for(int CellIndex=1;CellIndex<webTableRowOfCells.size();CellIndex++)
	{
	
	WebElement webTableRowOfCell=webTableRowOfCells.get(CellIndex);	
	String data=webTableRowOfCell.getText();
	WebElement TableCell=webTableRowOfCells.get(CellIndex);
	String WebTableCellValue=TableCell.getText();
	Cell newRowOfCell=newRow.createCell(CellIndex);
	newRowOfCell.setCellValue(WebTableCellValue);

	System.out.print(data+" | ");
	}
	System.out.println();


	}
	
	FileOutputStream AddEmployyeDataResults =new FileOutputStream("./src/com/selenium/WebTableTestDataFile.xlsx");
	 workBook.write(AddEmployyeDataResults);
	
	}
	
	
	
	
	
	
	
	
	
	

}
