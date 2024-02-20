package AutoItIntro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Add_with_Keyboard_Actions_Class{
	WebDriver driver;
@Test(priority=1)	
public void addEmployeedetails() throws InterruptedException, IOException	
{

	System.setProperty("webdriver.chrome.driver","C:./Resources/chromedriver.exe");
	String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver = new ChromeDriver(); 
	driver.get(ApplicationURLAddress);
	
	By UsernameProperty=By.id("txtUsername");
	WebElement Username=driver.findElement(UsernameProperty);
	Username.sendKeys("nareshgoudmetri");
	Actions keyboardActions=new Actions(driver);
	keyboardActions.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(2000);

	keyboardActions.sendKeys("Naresh@1406").build().perform();
	keyboardActions.sendKeys(Keys.TAB).build().perform();
	keyboardActions.sendKeys(Keys.ENTER).build().perform();
	
	By PIMProperty=By.linkText("PIM");
	WebElement PIM=driver.findElement(PIMProperty);

	//Actions mouseHoverOperation = new Actions(driver);
	//mouseHoverOperation.moveToElement(PIM).build().perform();
	
	keyboardActions.moveToElement(PIM).build().perform();
	
	
	By addEmployeProperty=By.id("menu_pim_addEmployee");
	WebElement addEmployee=driver.findElement(addEmployeProperty);
	
	addEmployee.click();
	
	//FirstNmae
	By addEmplfirstnameProperty=By.id("firstName");
	WebElement addEmplFirstname=driver.findElement(addEmplfirstnameProperty);
	addEmplFirstname.sendKeys("AutoIt");
	
	keyboardActions.sendKeys(Keys.TAB).build().perform();
	//SecondName
	keyboardActions.sendKeys("it's a third party").build().perform();	
	keyboardActions.sendKeys(Keys.TAB).build().perform();
	
	//ThirdNmae
	keyboardActions.sendKeys("Application").build().perform();
	keyboardActions.sendKeys(Keys.TAB).build().perform();
	
	
//name-photofile
	
	By photoghraphProperty=By.name("photofile");
	WebElement photoghaph=driver.findElement(photoghraphProperty);
	keyboardActions.moveToElement(photoghaph).click().build().perform();
	
	java.lang.Runtime.getRuntime().exec("/VariablesIntro/AutoItExefiles/Script.exe");
//	By saveButtonProperty=By.id("btnSave");
//	WebElement saveButton=driver.findElement(saveButtonProperty);
//
//	saveButton.click();
//
//	
	
	
	
	
	
	
	
	
	
	
}
	
	
	

}
