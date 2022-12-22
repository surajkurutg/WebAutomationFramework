package testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T002 extends BaseClass  {
	
	
	
  @Test
  public void Admin() throws InterruptedException {
	  //driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-actio']")).click();

     
	 driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']")).click();
		  log.info("*******click on harberger******");
	  
  }
}
