package testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\FrameWork\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.my3dmeta.com/signin");
		///driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		  ///log.info("*****User on Signin Page*****");
		Thread.sleep(5000);
		  WebElement emailid=driver.findElement(By.xpath("//input[@type='email']"));
		  emailid.click();
		  emailid.sendKeys("Satyam@my3dmeta.com");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		/*WebElement orgd=driver.findElement(By.xpath("//input[@placeholder='Organisation Name']"));
		orgd.sendKeys("sony pvt ltd");
		//driver.findElement(By.xpath("//input[@name='organization_name']")).sendKeys("sony"); 
		//driver.findElement(By.xpath("//input[@placeholder='Organisation Name']")).sendKeys("Juego Studios");
		 WebElement cc=driver.findElement(By.xpath("//select[@name='country_code']"));
		 cc.click();
		 WebElement scc=driver.findElement(By.xpath("//option[@value='93']"));
		 scc.click();
		 
		 WebElement mobileNO=driver.findElement(By.xpath("//input[@placeholder='Phone (optional)']"));
		 mobileNO.click();
		 mobileNO.sendKeys("1234567890");
		*/
		
	}

}
