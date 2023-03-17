package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T4signupgoogle extends BaseClass {
 //T4_SignUp_wGoogle
	@Test
	public void SignupWGoogle() throws InterruptedException {
	 driver.manage().deleteAllCookies();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='Continue with Google']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satyam@my3dmeta.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam4741@");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	 
	 Thread.sleep(2000);
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
	 WebElement businType=driver.findElement(By.xpath("//label[@for='4']"));
	 businType.click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 log.info("*sign up is successfully user on dashboard*");
	
	 String src=driver.getCurrentUrl();
	 log.info("["+src+"]");
	 
	}
}
