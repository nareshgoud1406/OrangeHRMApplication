package com.XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment extends BaseTest {
@Test	
public void DynmaicWebTable()
{
	String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpression2="]/td[";
	String xpathExpression3="]";
	
	
//=======================================================================================================	
	String XpathExpressionofTable="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody";
	
	
	By TableProperty =By.xpath(XpathExpressionofTable);
	WebElement Table=driver.findElement(TableProperty);
	By tableRowProperty=By.tagName("tr");
	 List<WebElement>Rowlist=Table.findElements(tableRowProperty);
	 int RowCount=Rowlist.size();
	 System.out.println("Rows count of the webTable is "+RowCount);
	 
	 
	String XpathExpressionOfsingleRow="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]";
	 
	By SingleRowleProperty =By.xpath(XpathExpressionOfsingleRow);
	WebElement SingleRow=driver.findElement(SingleRowleProperty);
	 By tableRowofcolumnProperty=By.tagName("td");
	 List<WebElement>SingleRow_RowofCellsList=SingleRow.findElements(tableRowofcolumnProperty);
	 
	 int RowOfCellCount=SingleRow_RowofCellsList.size();
	 System.out.println("Rows of Cell count of the webTable is "+RowOfCellCount);
//=====================================================================================================	 
	 	for(int rowIndex=1;rowIndex<=RowCount;rowIndex++)
		{
	
		for(int rowOfCellIndex=1;rowOfCellIndex<=RowOfCellCount;rowOfCellIndex++)
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

