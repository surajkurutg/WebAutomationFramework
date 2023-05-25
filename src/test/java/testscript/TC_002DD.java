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

public class TC_002DD extends BaseClass {

@Test
	 
	public void Invalid_EmailorPass_Error() throws IOException, InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		String filepath = "C:\\Users\\SurajKurutge\\eclipse-workspace\\Testing\\Resources\\TC_001.xlsx";
		FileInputStream inputstream = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
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
			Thread.sleep(Duration.ofSeconds(5));
					
					
			WebElement invalidemailorpass = driver.findElement(By.xpath("//*[text()='Invalid Email or Password']"));
			
			if (invalidemailorpass.isDisplayed()) {
				
				String text =invalidemailorpass.getText();
				log.info(text); 
				
				jse.executeScript("window.scrollBy(0,250)");
				
			}	
			else {
				log.info("Test Cases Failed");
			} 	 
					
			}
		
		    }
}}	
 
