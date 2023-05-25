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
      
	 WebDriverManager.chromedriver().setup();
     driver= new ChromeDriver(); 
	log=Logger.getLogger("Automation");
	PropertyConfigurator.configure("C:\\Users\\SurajKurutge\\eclipse-workspace\\Testing\\Resources\\log4j.properties");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	driver.get(baseURL);
	log.info("*Url is open**");	
  }
  

  @AfterSuite
  public void TearDown() {
	  driver.close();
	  } 
  
}