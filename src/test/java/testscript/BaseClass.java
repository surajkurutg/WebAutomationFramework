package testscript;



import org.testng.annotations.BeforeSuite;

import utilities.ResoConfig;

import java.time.Duration;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import org.testng.annotations.AfterSuite;

public class BaseClass {
	ResoConfig rec=new ResoConfig();
	public String baseURL= rec.getApplicationURL();
	public String username=rec.getApplicationUsername();
	public String password=rec.getApplicationPassword();
	
	public static WebDriver driver;
	//static org.apache.logging.log4j.Logger logger;
	static Logger log;
	
  
  @BeforeSuite
  public void Setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\FrameWork\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	/*//logger= (Logger) LogManager.getLogger(BaseClass.class.getName());
		logger= LogManager.getLogger(BaseClass.class.getName());
	//PropertyConfigurator.configure("log4j.properties");
	PropertyConfigurator.configure(".\\Reource\\log4j.properties");*/
		log=Logger.getLogger("Automation");
		PropertyConfigurator.configure("C:\\Users\\Dell\\eclipse-workspace\\Automation\\FrameWork\\Resources\\log4j.properties");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(baseURL);
	log.info("*hhhiiiii**");
	
	
	
	
   
	
  }

  @AfterSuite
  public void TearDown() {
	  //driver.close();
	  
  }

}
