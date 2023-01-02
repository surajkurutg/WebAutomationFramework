package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class T001Signup extends BaseClass {
  @Test(priority =1)
  public void Loginp() throws InterruptedException {
	  
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(firstname);
	log.info("******first  name add*******");
	Thread.sleep(3000);
		
		
	driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys(lastname);
	log.info("*************last name Enterd********");
		
		
	driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(emaild);
	log.info("*************email name Enterd********");
	
	Thread.sleep(3000);
	
	

	driver.findElement(By.xpath("//button[@type='submit']")).click();
    /*driver.findElement(By.xpath("//input[@name='otp1']"));
	Thread.sleep(20000);
	
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		//lp.ClickButton();	  
	  
  }}

