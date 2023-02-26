package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResoConfig {
	Properties pro;
	static WebDriver driver;
	public ResoConfig() 
	//this is constructor
	{
		File src=new File("./configuration/Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getApplicationfristname()
	{
		String FirstName=pro.getProperty("FirstName");
		return FirstName;
	}
	
	public String getApplicationlastname()
	{
		String LastName=pro.getProperty("LastName");
		return LastName;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getemailid() {
		String emailidu=pro.getProperty("Email");
		return emailidu;
		
	}
	
	public String getORGDetails() {
		String orgd=pro.getProperty("OrganisationName");
		return orgd;
	}
	
	public String getMobileNumber() {
		String ConNo=pro.getProperty("mobileNumber");
		return ConNo;
	}
	
	
}
