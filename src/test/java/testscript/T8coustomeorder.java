package testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T8coustomeorder extends BaseClass {
	
  @Test
  public void CsutomeOrder() throws InterruptedException, FileNotFoundException {
	  Thread.sleep(3000);
	  WebElement ele=find("xpath","//div[@class='w-[88px]  hover:w-[304px] w-[88px] h-[calc(100vh-150px)] rounded-lg  duration-[150ms] p-[20px] bg-BH_background_card sticky top-[110px] flex flex-col group']");
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  Thread.sleep(2000);
	  WebElement nl = find("xpath","//p[.='Custom orders']");
	  nl.click();
	  nl.click();
	  WebElement srh=find("xpath","//input[@type='search']");
	  srh.sendKeys("test");
	  
			  
			  
			  
			  
			
  }
 
  
  }

