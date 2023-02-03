package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class T001_Sinuppage extends BaseClass {
	
  

@Test(priority =1)
  public void Loginp() throws InterruptedException {
	
	  
	log.info("user on sign up page ");
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(firstname);
	log.info(" *first  name add*");
	Thread.sleep(3000);
		
		
	driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys(lastname);
	log.info("*last name Enterd*");
		
		
	driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(emaild);
	log.info("*email name Enterd*");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
   
	log.info("user add his details successfully ");

}
  
  @Test(priority =2)
  public void verifyOtp() throws InterruptedException {
	
	log.info("*User on otp verification page*");
	  driver.findElement(By.xpath("//input[@name='otp1']"));
		Thread.sleep(33000);
		driver.findElement(By.xpath("//button[text()='Resend']")).click();
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		log.info("*user enterd otp successfully*");
  }
 
  @Test(priority =3)
  public void ORGDetails() throws InterruptedException {
		    Thread.sleep(3000);
			log.info("*User on organization page*");
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
			 
			 log.info("sign up is successfully user on dashboard");
	 
			String src=driver.getCurrentUrl();
			log.info(src);
			System.out.println(src);
	  
	  
  }
  
  
}

