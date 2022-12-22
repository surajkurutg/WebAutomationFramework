package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ResoConfig {
	Properties pro;
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
	
	public String getApplicationUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getApplicationPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	
	

}
