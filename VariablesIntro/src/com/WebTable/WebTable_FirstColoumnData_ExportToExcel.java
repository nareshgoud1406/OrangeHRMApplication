package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstColoumnData_ExportToExcel extends BaseTest  {
	
	@Test
	public void excel_ExportFirstColumnData() throws IOException
	{

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

	FileInputStream testDataFile = new FileInputStream("./src/com/selenium/WebTableTestDataFile.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
	XSSFSheet testDataSheet = workBook.getSheet("TestData");


	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	Row newRow=testDataSheet.createRow(rowIndex);
	Cell newRowOfCell=newRow.createCell(0);

	By webTableCityNameProperty=By.xpath
	("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td[1]");
	WebElement cityName=driver.findElement(webTableCityNameProperty);
	String cityName_Text=cityName.getText();
	System.out.println(" The CityName is :- "+cityName_Text);

	newRowOfCell.setCellValue(cityName_Text);

	FileOutputStream testOutPutFile = new FileOutputStream("./src/com/selenium/WebTableTestDataFile.xlsx");
	workBook.write(testOutPutFile);
	}

	}
	
	
	

}
