package com.MouseOverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOperations {

	public static void main(String[] args) {
		
		
		
			WebDriver driver;
			String applicationUrlAddress="http://amazon.in";

			System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(applicationUrlAddress);


			// <a href="/hz/wishlist/ls?requiresSignIn=1&amp;ref_=nav_AccountFlyout_wl" class="nav-link nav-item"><span class="nav-text">Your Wish List</span></a>
			// <a href="/hz/wishlist/ls?requiresSignIn=1&amp;ref_=nav_AccountFlyout_wl" class="nav-link nav-item"><span class="nav-text">Your Wish List</span></a>

			// id="nav-link-accountList" - Property of Hello SignIn WebElement Element
			By helloSignInProperty=By.id("nav-link-accountList");
			WebElement helloSignIn=driver.findElement(helloSignInProperty);

			Actions mouseHoverOperation = new Actions(driver);
			mouseHoverOperation.moveToElement(helloSignIn).build().perform();



	}

}
