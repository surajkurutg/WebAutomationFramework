package testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\git\\my3dmeta\\FrameWork\\Drivers\\driver12\\msedgedriver.exe");
		EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("-inprivate");
        WebDriver driver = new EdgeDriver(edgeOptions); 
		//WebDriver driver=new ChromeDriver();
		driver.get("https://dev.my3dmeta.com/signin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		///log.info("*****User on Signin Page*****");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue with Google']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satyam@my3dmeta.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam4741@");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    
	    Thread.sleep(5000);
		
		
		
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
