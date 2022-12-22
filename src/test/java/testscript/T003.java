package testscript;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T003 extends BaseClass{
	 @Test
	  public void punchin() throws InterruptedException {
		 Thread.sleep(5000); 
		 WebElement src=driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']"));
		  src.click();
		  log.info("***click on date format****");
			 //driver.findElement(By.xpath("//div[@class='oxd-date-input-link --clear']")).click();
		  ////i[@class='oxd-icon bi-calendar oxd-date-input-icon']
		  driver.findElement(By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']"));
		  //driver.findElement(By.xpath("//div[@class='oxd-date-input-link --cle']")).click();
		  driver.findElement(By.xpath("//div[@class='oxd-date-input-link --clear']")).click();
		 log.info("***clear tab using clear inner link****");
		 Thread.sleep(5000); 
		 src.sendKeys("2022-12-22");
		 log.info("***mention new date ****");
		 
		 
		  
		  
		  
		 
		 
		 
		  
		  
		 
		  
		  
		  
	  }
}
