package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class T001 extends BaseClass {
  @Test(priority =1)
  public void Loginp() throws InterruptedException {
	  LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
	log.info("******Username  add*******");
	//logger.info("********Username Add*********");
	//logger.info("********Username type*********");
	
		
		
		Thread.sleep(3000);
		
		lp.setpassword(password);
		log.info("*************Paass Enterd********");
	
		
		Thread.sleep(3000);
		
		lp.ClickButton();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("OrangeHRM")) 
		{
			Assert.assertTrue(true);
			log.info("*******TestPass**********");
			
		}
		else {
			Assert.assertTrue(false);
			log.info("******TestFail******");
			
			 }}
	
  

  
 
	  
	  
  }

