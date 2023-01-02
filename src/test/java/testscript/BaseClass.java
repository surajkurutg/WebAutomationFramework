package testscript;



import org.testng.annotations.BeforeSuite;

import utilities.ResoConfig;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import org.testng.annotations.AfterSuite;

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
	public static EdgeOptions edgeoptions;
	public static DesiredCapabilities capabilities ;

  
  @BeforeSuite
  public void Setup() {
      capabilities = new DesiredCapabilities();
      options = new ChromeOptions();
      options.addArguments("--incognito");
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\WEBFRAME_WORK\\FrameWork\\Drivers\\driver12\\chromedriver.exe");
    driver= new ChromeDriver(options);
	
	log=Logger.getLogger("Automation");
	PropertyConfigurator.configure("C:\\Users\\Dell\\eclipse-workspace\\Automation\\FrameWork\\Resources\\log4j.properties");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(baseURL);
	log.info("*hhhiiiii**");
	
	
	
	
   
	
  }

  @AfterSuite
  public void TearDown() {
	  //driver.close();
	  
  }

}
