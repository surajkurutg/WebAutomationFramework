package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T002_Locallysignin extends BaseClass {
 
  @Test()
  public void signin() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	log.info("*User on Signin Page*");
	Thread.sleep(5000);
	
	WebElement emailid=driver.findElement(By.xpath("//input[@type='email']"));
	emailid.sendKeys(emaild);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	log.info("*user on signIN otp verification page*");
	  
	driver.findElement(By.xpath("//input[@name='otp1']"));
    Thread.sleep(30000);
		
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	log.info("*user on dashboard*");
	
	String src=driver.getCurrentUrl();
	log.info("["+src+"]");
	
	
	log.info("*sign in finish*");
		
  }
}
