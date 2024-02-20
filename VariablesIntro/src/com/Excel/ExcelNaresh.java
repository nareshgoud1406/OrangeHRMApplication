package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelNaresh extends BaseTest {
	public FileInputStream testDataFile;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public Row ActiveRow;
	public Cell ActiveRowOfCell;
	public String CellValue;
	
	public ExcelNaresh read=new ExcelNaresh();

public String ExcelRead(String Location,String SheetNo,int Rownumber,int Cellnumber  ) throws IOException 
{
	
	 testDataFile =new FileInputStream(Location);
	 workbook = new XSSFWorkbook(testDataFile);
	 sheet = workbook.getSheet(SheetNo);
	 ActiveRow=sheet.getRow(Rownumber);
	 ActiveRowOfCell=ActiveRow.getCell(Cellnumber);
	CellValue=ActiveRowOfCell.getStringCellValue();
	return CellValue;
	

}
		
}


