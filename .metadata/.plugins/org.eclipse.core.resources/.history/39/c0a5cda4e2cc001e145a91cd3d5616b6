package TryAndCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Signature {
	
		
	FileInputStream testDataFile;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
		public void ExcelRead(String Location,String SheetNo,int Rownumber,int Cellnumber ) throws IOException
		{
	
			 testDataFile =new FileInputStream(Location);
			 workbook = new XSSFWorkbook(testDataFile);
			 sheet = workbook.getSheet(SheetNo);
			Row ActiveRow=sheet.getRow(Rownumber);
			Cell ActiveRowOfCell=ActiveRow.getCell(Cellnumber);
			String CellValue=ActiveRowOfCell.getStringCellValue();
			System.out.println(CellValue);
			
	

			
		
		}
		
		public static void main(String[] args) throws IOException {
			
			Signature s=new Signature();
			s.ExcelRead("C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\src\\TryAndCatch\\AddEmployeeTestSheet.xlsx", "Sheet1", 1, 1);
			
			
		}
	
	}
	


