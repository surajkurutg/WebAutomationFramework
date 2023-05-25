package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001DD extends BaseClass {
	
	@Test
	
	public void Error_Validations() throws IOException, InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		String filepath = "C:\\Users\\SurajKurutge\\eclipse-workspace\\Testing\\Resources\\TC_001.xlsx";
		FileInputStream inputstream = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
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
			Thread.sleep(Duration.ofSeconds(3));		   
					
			WebElement toastframe= driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']"));
				
			if (toastframe.isDisplayed()) {
					 
				String text=toastframe.getText();
				
				String first_error="Please enter a Valid Email Address";
				String secont_error = "Invalid User";
				String third_error = "Please fill all the mandatory fields";
		 
					
				if(text.equalsIgnoreCase(first_error)) {
						Assert.assertEquals(text,first_error);
						log.info(text);
				}
				else if (text.equalsIgnoreCase(secont_error)) {
						Assert.assertEquals(text,secont_error);
						log.info(text);
				}
					
				else {
						Assert.assertEquals(text,third_error);
						log.info(text);
				} }
				 
			       
					jse.executeScript("window.scrollBy(0,250)");
					 Thread.sleep(Duration.ofSeconds(2));
					
				} 
			    }
		
		}}
	
	

 
