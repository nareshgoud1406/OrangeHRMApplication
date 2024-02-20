package com.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableData extends BaseTest {
	
	
	@Test(priority=1,description=" Capturing Complete WebTable data from World Clock WebTable ")
	public void getting_CompleteWebTableData()
	{

	// First Row of First Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// Last Row of the Last Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		// By webTableDataProperty=By.xpath
		//("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");

	String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpression2="]/td[";
	String xpathExpression3="]";


	// TO Goto Every Row
	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	// To goto every Row - of all its Respective Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{

	

	By webTableDataProperty=By.xpath(xpathExpression1+rowIndex+xpathExpression2+rowOfCellIndex+xpathExpression3);
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableData_Text=webTableData.getText();
	System.out.print(webTableData_Text+" | ");
	
	
	}
	System.out.println();

	}


	}

	}

