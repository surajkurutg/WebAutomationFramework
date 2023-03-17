package testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	

  public static void main(String[] args) throws InterruptedException {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\WEBFRAME_WORK\\FrameWork\\Drivers\\driver12\\chromedriver.exe");
	  WebDriverManager.edgedriver().setup(); 
	  WebDriver driver= new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://dev.my3dmeta.com/signin");
	  Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Continue with Google']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satyam@my3dmeta.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam4741@");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	    WebElement ele=driver.findElement(By.xpath("//h2[@class=' uppercase text-[2rem] font-medium']"));
	    Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		/*WebElement nl=driver.findElement(By.xpath("//button[.='Profile ']"));
	    nl.click();*/
		WebElement nl1=driver.findElement(By.xpath("//button[.='Billing ']"));
		nl1.click();
		WebElement nl2=driver.findElement(By.xpath("//div[@class='flex flex-col']/div[2]/p[1]"));
	    nl2.click();
	    Thread.sleep(5000);
	    WebElement nl3=driver.findElement(By.xpath("//select[@name='phone_country_code']"));
	    nl3.click();
	    
	   
	    List<WebElement> nl4=driver.findElements(By.xpath("//select[@name='phone_country_code']/option"));
	    for(WebElement icc:nl4) {
	        if(icc.getText().equals("91")) {
	 			icc.click();
	 			
	 			 }
	 	}
	    System.out.println("finish");
	    
	   
	    
	    
	  	 
	  	 
	  	  
	  	  
	    }}

