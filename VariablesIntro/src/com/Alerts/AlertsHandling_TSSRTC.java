package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsHandling_TSSRTC extends BaseTest_TSRTC {
	
	@Test
	public void hadlingAlert() throws InterruptedException
	{
	// id="searchBtn"
	By checkAvailabilityProperty=By.id("searchBtn");
	WebElement checkAvailability=driver.findElement(checkAvailabilityProperty);
	checkAvailability.click();

	Thread.sleep(3000);

	Alert tsrtcAlert=driver.switchTo().alert(); //Switch to Alert block

	String expected_AlertWindowTextMessage="Please select start place.";
	System.out.println(" The Expected Alert Message is "+expected_AlertWindowTextMessage);

	String actual_AlertWindowText=tsrtcAlert.getText(); //to get text of the Alert block
	System.out.println(" The Actual Alert Message is :- "+actual_AlertWindowText);

	if(actual_AlertWindowText.equals(expected_AlertWindowTextMessage))
	{
	System.out.println(" Message existing - PASS ");
	}
	else
	{
	System.out.println(" No Message Found - FAIL ");
	}


	tsrtcAlert.accept(); // accepting the "OK" button in the Alert Window

	// tsrtcAlert.dismiss(); // is used to work with cancel Button

	// tsrtcAlert.sendKeys(" Hyderabad "); // sending the Test Data into the Alert window



	}

	}

	
	


