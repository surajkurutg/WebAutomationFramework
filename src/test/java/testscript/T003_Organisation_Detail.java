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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T003_Organisation_Detail extends BaseClass{
	 @Test
	  public void ORGDetails() throws InterruptedException {
			    Thread.sleep(3000);
				log.info("*************User on organization page********");
				WebElement orgd=driver.findElement(By.xpath("//input[@placeholder='Organisation Name']"));
				orgd.sendKeys(orgdet);
			   
				Thread.sleep(3000);
				 WebElement cc=driver.findElement(By.xpath("//select[@name='country_code']"));
				 cc.click();
				 WebElement scc=driver.findElement(By.xpath("//option[@value='91']"));
				 scc.click();
				 
				 WebElement mobileNO=driver.findElement(By.xpath("//input[@placeholder='Phone (optional)']"));
				 mobileNO.click();
				 mobileNO.sendKeys(mobNum);
				 
				 Thread.sleep(2000);
				 WebElement busiType=driver.findElement(By.xpath("//label[@for='4']"));
				 busiType.click();
				
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//button[@type='submit']")).click();
				 
				 log.info("*************sign up is successfully user on dashboard  ********");
		 
				String src=driver.getCurrentUrl();
				System.out.println(src);
		  
		
		 
		 
		 
		  
		  
		 
		  
		  
		  
	  }
}
