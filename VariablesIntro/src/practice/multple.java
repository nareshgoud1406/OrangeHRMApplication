package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multple {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Javaselenium\\VariablesIntro\\Resources\\chromedriver.exe");
				
				String ApplicationURLAddress= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
				
			//Assigning URL to a variable to pass Dynamically.......................................... 
				
						ChromeDriver driver = new ChromeDriver(); 
						driver.get(ApplicationURLAddress);
		
					FileInputStream testDataFile =new FileInputStream("./src/practice/LoginTestData.xlsx");
					XSSFWorkbook workbook =new XSSFWorkbook(testDataFile);
					XSSFSheet sheet = workbook.getSheet("Sheet1");
					
					int RowCount=sheet.getLastRowNum();
					
					
					for(int rowindex=1;rowindex<=RowCount;rowindex++)
					{
						Row testDataSheetRow=sheet.getRow(rowindex);
						//int RowOfCellCount=testDataSheetRow.getLastCellNum();
				
					
						
					for(int RowOfIndex=0;RowOfIndex<1;RowOfIndex++)
					{
						Cell usernameCell=testDataSheetRow.getCell(RowOfIndex);
						String usernameTestData=usernameCell.getStringCellValue();
						By usernameProperty=By.id("txtUsername");
						WebElement username=driver.findElement(usernameProperty);
						username.sendKeys(usernameTestData);
						
						for(int PasswordIndex=1;PasswordIndex<2;PasswordIndex++)
						{
						
							Cell PasswordCell=testDataSheetRow.getCell(PasswordIndex);
							String PasswordTestData=PasswordCell.getStringCellValue();
							By passwordProperty=By.id("txtPassword");
							WebElement password=driver.findElement(passwordProperty);
							password.sendKeys(PasswordTestData);
						
							}
					}
					
					 By loginProperty=By.className("button");
					 WebElement login=driver.findElement(loginProperty);
					 login.click();
					 
					 
					 String actualUrl=driver.getCurrentUrl();
					 String expectedUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
					 
					 
					 if(actualUrl.equals(expectedUrl))
					 {
					 By welcomeAdminProperty=By.linkText("Welcome Admin");
					 WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
					 welcomeAdmin.click();
					 
					 Thread.sleep(5000);
						By logoutPropperty=By.linkText("Logout");
						//By logoutPropperty=By.partialLinkText("out");
						WebElement logout=driver.findElement(logoutPropperty);
						logout.click();
					 } 
					 else {
					
						 driver.navigate().refresh();
						 

							File SourceFile=driver.getScreenshotAs(OutputType.FILE);
							File DestFile=new File("./ApplicationScreenShots/img1.jpg");
							FileUtils.copyFile(SourceFile, DestFile);
						 
					 }
					
					
					
					
					}
					
					
					
					
					 
					}
	
	
	
					
					
					
					
					
					
					
					
				
}

