package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
	
public class TC_004DD extends BaseClass{
	
	@Test
	public void Valid_DD_TestCases() throws IOException, InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		String filepath = "C:\\Users\\SurajKurutge\\eclipse-workspace\\Testing\\Resources\\TC_001.xlsx";
		FileInputStream inputstream = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		
		int rows = sheet.getLastRowNum();
		int colmn= sheet.getRow(0).getLastCellNum();
		
		for (int i =1 ; i<=rows; i++) {
			 
			for(int j=0; j<=colmn;j++) {
				  
		WebElement email= driver.findElement(By.xpath("//*[contains(@placeholder,'Enter your email')]"));
		WebElement pass = driver.findElement(By.xpath("//*[contains(@placeholder,'Enter your password')]"));
		WebElement login = driver.findElement(By.xpath("//*[contains(@value,'Login')]"));
				
					 
		email.clear();
		email.sendKeys(sheet.getRow(i).getCell(j++).toString());
		pass.clear();
		pass.sendKeys(sheet.getRow(i).getCell(j++).toString());
	    login.click();
		WebElement profilename= driver.findElement(By.xpath("//*[@class='profile-name']")); 
		String str= profilename.getText();
		Thread.sleep(Duration.ofSeconds(2));
					 

		if(str.contains("roaming_provider")) {
			 
		    WebElement roamingprovider=  driver.findElement(By.xpath("//*[text()='roaming_provider']"));
		    Assert.assertTrue(roamingprovider.isDisplayed());
			profilename.click();
		    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			log.info(str);
			Thread.sleep(Duration.ofSeconds(5));
		}			
					
					
		else if(str.contains("roaming_partner")) {
			 WebElement roamingpartner=  driver.findElement(By.xpath("//*[text()='roaming_partner']"));
			 Assert.assertTrue(roamingpartner.isDisplayed());
			 profilename.click();
			 driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			 log.info(str);
			 Thread.sleep(Duration.ofSeconds(5));
			 
		}		
		
		else if(str.contains("account_manager")) {
			 WebElement account_manager=  driver.findElement(By.xpath("//*[text()='account_manager']"));
			 Assert.assertTrue(account_manager.isDisplayed());
			 profilename.click();
			 driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			 log.info(str);
			 Thread.sleep(Duration.ofSeconds(5));
		}
				
		
		else {
			log.info("Test Cases Failed");
		}
		
		jse.executeScript("window.scrollBy(0,450)");
						
				  
					
			}
		
		}

		
	}

}
