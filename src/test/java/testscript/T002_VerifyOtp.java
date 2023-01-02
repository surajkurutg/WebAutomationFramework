package testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T002_VerifyOtp extends BaseClass  {
	
@Test
  public void verifyOtp() throws InterruptedException {
	
	log.info("*******User on otp verification page ********");
	  driver.findElement(By.xpath("//input[@name='otp1']"));
		Thread.sleep(20000);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		log.info("*********user enterd otp successfully********");
  }
 
     
	 
}
