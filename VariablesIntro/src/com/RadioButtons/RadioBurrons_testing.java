package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioBurrons_testing extends BaseTest_EchoEchoApplication{

	@Test
	public void RadioButtonsTesting() 
	{
	/*
	<input type="radio" name="group1" value="Milk">
	<input type="radio" name="group1" value="Butter" checked="">
	<input type="radio" name="group1" value="Cheese">

	<input type="radio" name="group2" value="Water">
	<input type="radio" name="group2" value="Beer">
	<input type="radio" name="group2" value="Wine" checked="">
	*/

	// System.out.println(" Application Functionality Testing ");


	By radioButtonTableProperty=By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody");
	WebElement RadioTable=driver.findElement(radioButtonTableProperty);
	By buttonPropertiesbyTagname =By.tagName("input");
	List<WebElement>totalTable=RadioTable.findElements(buttonPropertiesbyTagname);
	
	
	
	
	By group1RadioButonsProperty=By.name("group1");
	By group2RadioButonsProperty=By.name("group2");
	List<WebElement>RadioButtons_Group1=RadioTable.findElements(group1RadioButonsProperty);
	List<WebElement>RadioButtons_Group2=RadioTable.findElements(group2RadioButonsProperty);
	 int group1_radioButtonsCount=RadioButtons_Group1.size();
	 int group2_radioButtonsCount=RadioButtons_Group1.size();
	
	for(int radioButtonClick=0;radioButtonClick<6;radioButtonClick++)
	{
	String radioButtonName=totalTable.get(radioButtonClick).getAttribute("value");
	System.out.println(radioButtonName);

	RadioButtons_Group1.get(radioButtonClick).click();
	// Getting the Status of the Radio Buttons
	for(int radioButtonsStatus=0;radioButtonsStatus<group1_radioButtonsCount;radioButtonsStatus++ )
	{
	System.out.println(RadioButtons_Group1.get(radioButtonsStatus).getAttribute("value")+" - "+ RadioButtons_Group1.get(radioButtonsStatus).getAttribute("checked"));
	
	}
	
	
	}


	}
	
	
	
	
	
	
	
	
	
}
