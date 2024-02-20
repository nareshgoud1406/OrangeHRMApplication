package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseTest {
	
	@Test
	public void getData_DynamicWebTable()
	{
	// WebTable Property
	// /html/body/div[5]/section[1]/div

	// Identifying the WebTable
	By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webTableProperty);

	// In the WebTable - Identifying the Row's of the WebTable
	List<WebElement>rows=webTable.findElements(By.tagName("tr"));


	// Going to all the Rows of the WebTable
	for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
	{
	// Going to an arrayList - reaching a Particular Row of the WebTable
	WebElement row=rows.get(rowIndex);

	// going to a Row - and Identifying the Number of Row of Cells
	List<WebElement>webTableRowOfCells=row.findElements(By.tagName("td"));

	// To goto a Row - to all its Corresponding Cells
	for(int CellIndex=0;CellIndex<webTableRowOfCells.size();CellIndex++)
	{
	// reaching to a Row of a Cell
	WebElement webTableRowOfCell=webTableRowOfCells.get(CellIndex);

	//get the data from the Row of a Cell
	String data=webTableRowOfCell.getText();

	System.out.print(data+" | ");
	}
	System.out.println();


	}
	
	
	
	}
}
	
	
	
	
	
	
	
	


