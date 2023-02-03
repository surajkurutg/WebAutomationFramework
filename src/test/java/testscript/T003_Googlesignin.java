package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T003_Googlesignin extends BaseClass{
  @Test()
  public void connectWgoogle() throws InterruptedException {
	 /// driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		log.info("*****User on Signin Page*****");
		///Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue with Google']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satyam@my3dmeta.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam4741@");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	    Thread.sleep(2000);
	   String src= driver.getCurrentUrl();
	   log.info("["+src+"]");
	   
	   log.info("*user login successfully*");
	   
	   
	 
	    
  }// <class name="testscript.T002_Locallysignin"/>
//  <class name="testscript.T003_Googlesignin"/>
}
