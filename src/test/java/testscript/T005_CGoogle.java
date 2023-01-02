package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T005_CGoogle extends BaseClass{
  @Test
  public void connectWgoogle() throws InterruptedException {
	 /// driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		log.info("*****User on Signin Page*****");
		///Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue with Google']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("my3dmetasatya@gmail.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam1234@");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	    
  }
}
