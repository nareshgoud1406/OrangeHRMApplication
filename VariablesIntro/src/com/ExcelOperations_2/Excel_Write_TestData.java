package com.ExcelOperations_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData {

	public static void main(String[] args) throws IOException{
		// Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelOperations_2/Book1.xlsx");

		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		//
		int rowCount=testDataSheet.getLastRowNum();
		System.out.println("row count is "+rowCount);

		
		// create a particular Row in the Sheet
		Row newRow=testDataSheet.createRow(3);
		

		// Create a Particular Row of a Cell in the Row
		Cell newRowOfNewCell=newRow.createCell(4);

		// Sending the Test data into the New Row Of Cell Created
		newRowOfNewCell.setCellValue("Write Something");
		
		String read =newRowOfNewCell.getStringCellValue();
		System.out.println(read);
		

		// The Excel File along with the WorkBook should be saved
		FileOutputStream testDataResultFile = new FileOutputStream("./src/com/ExcelOperations_2/Book1.xlsx");
		workBook.write(testDataResultFile);



		
				
	}
		
		
		
	}

