package testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SampleTest {
	
	public static ChromeOptions options;
	public static DesiredCapabilities capabilities ;
  public static void main(String[] args) throws InterruptedException {
	  capabilities = new DesiredCapabilities();
      options = new ChromeOptions();
      options.addArguments("--incognito");
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  
	
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\WEBFRAME_WORK\\FrameWork\\Drivers\\driver12\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://dev.my3dmeta.com/library");
	
	  	   //log.info("["+src+"]");
	  	  ///driver.findElement(By.xpath("//button[normalize-space()='Go to editor']")).click();  
	    
	    
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[.='Upload now']")).click();
	     WebElement uim=driver.findElement(By.xpath("//input[@type='file']"));
	     //uim.click();
	     uim.sendKeys("C:\\Users\\Dell\\Downloads\\AA_C2-Copy.zip");
	     
	     Thread.sleep(10000);
	     
	     driver.findElement(By.xpath("//button[.='Next']")).click();
	     
	    
	   
	  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	  driver.findElement(By.xpath("//p[.='Properties']")).click();
	  	  
	  	  driver.findElement(By.xpath("//p[@class='font-medium text-[20px] leading-[24px] cursor-pointer font-Brutal_type text-BH_primary']")).click();
	  	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jacket Brown");
	  	  driver.findElement(By.xpath("//p[.='Category']")).click();
	  	  List<WebElement> cat=driver.findElements(By.xpath("//label[@class='flex items-center gap-4 text-BH_primary font-Brutal_type_medium text-base undefined']")) ;
	  	 for(WebElement webel : cat) {
	  		  if(!webel.isSelected()) {
	  			webel.click(); }}
	  	  //driver.findElement(By.xpath("//p[.='Tags']")).click();
	  
	  	 
	  	 
	  	  
	  	  
	    }
	  
}

