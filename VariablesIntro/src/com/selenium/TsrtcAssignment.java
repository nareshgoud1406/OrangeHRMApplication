package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcAssignment {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
		
		String ApplicationURLAddress= "https://www.tsrtconline.in/oprs-web/";
	
			//	ChromeDriver driver = new ChromeDriver(); 
				WebDriver driver=new ChromeDriver();
				driver.get(ApplicationURLAddress);
				
				
	/*<div class="menu">
				<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				Home</a>
			<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
			<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
			<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
			<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
			<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
			<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
			<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
			</div>			
*/					
		    By LinksProperty=By.className("menu-wrap");
		    WebElement tsrtcApplicationHomePageLinkProperty=driver.findElement(LinksProperty);
		    By tsrtcApplicationHomePageLinkssProperty=By.tagName("a");
		    List<WebElement>linksList=tsrtcApplicationHomePageLinkProperty.findElements(tsrtcApplicationHomePageLinkssProperty);
		
		    //We again find elements in Web element not whole driver 
		
		int tsrtcApplicationHomePageLinks_Count=linksList.size();
		
		System.out.println(tsrtcApplicationHomePageLinks_Count);
		
		for(int arrayIndex=0;arrayIndex<tsrtcApplicationHomePageLinks_Count;arrayIndex++)
		{
		String tsrtcHomePage_LinkName=linksList.get(arrayIndex).getText();
		
		System.out.println(arrayIndex+"-"+tsrtcHomePage_LinkName);
		}
		
		
		
		driver.quit();

	}

}
