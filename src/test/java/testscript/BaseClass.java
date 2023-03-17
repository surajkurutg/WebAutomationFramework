package testscript;



import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ResoConfig;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	ResoConfig rec=new ResoConfig();
	public String baseURL= rec.getApplicationURL();
	public String firstname=rec.getApplicationfristname();
	public String lastname=rec.getApplicationlastname();
	public String emaild=rec.getemailid();
	public String orgdet=rec.getORGDetails();
	public String mobNum=rec.getMobileNumber();
	
	public static WebDriver driver;
	//static org.apache.logging.log4j.Logger logger;
	static Logger log;
	public static ChromeOptions options;
	public static DesiredCapabilities capabilities ;

  
  @BeforeSuite
  public void Setup() {
     /* capabilities = new DesiredCapabilities();
      options = new ChromeOptions();
      options.addArguments("--incognito");
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
	  WebDriverManager.edgedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\WEBFRAME_WORK\\FrameWork\\Drivers\\driver12\\chromedriver.exe");
    driver= new EdgeDriver();
	
	log=Logger.getLogger("Automation");
	PropertyConfigurator.configure("C:\\Users\\Dell\\git\\my3dmeta\\FrameWork\\Resources\\log4j.properties");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(baseURL);
	log.info("*Url is open**");	
  }

  @AfterSuite
  public void TearDown() {
	 // driver.close();
	  }
  
  public WebElement find(String type,String locator){
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebElement we = null;
	  if(type.equalsIgnoreCase("xpath")){
	    we = driver.findElement(By.xpath(locator));
	  }
	  if(type.equalsIgnoreCase("id")){
	    we = driver.findElement(By.id(locator));
	  } 
	  // and so on...
	return we;
	 }
  
  public List<WebElement> finds(String type,String locator){
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  List<WebElement> elms = null;
	  if(type.equalsIgnoreCase("xpath")){
	    elms = driver.findElements(By.xpath(locator));
	  }
	  if(type.equalsIgnoreCase("id")){
	    elms= driver.findElements(By.id(locator));
	  } 
	  // and so on...
	return elms;
	 }
  
  
}