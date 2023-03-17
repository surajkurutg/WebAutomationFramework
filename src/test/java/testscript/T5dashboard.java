package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.testng.annotations.Test;

public class T5dashboard extends BaseClass {
	//T5_HomepageOverview
	Actions act;
  @Test(priority=1)
  public void Dashboard() throws InterruptedException {
	  log.info("User on home page ");
      Thread.sleep(2000);
	  WebElement ele=driver.findElement(By.xpath("//div[@class='w-[88px] col-span-1 h-[800px] rounded-lg  duration-200 p-[20px] bg-BH_background_card relative block']"));
	   act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  Thread.sleep(2000);
	  List<WebElement> src=driver.findElements(By.xpath("//div[contains(@class,'w-[88px] col-span-1 h-[800px] rounded-lg  duration-200 p-[20px] bg-BH_background_card relative block')]"));
      System.out.println(src.size());

      for (WebElement webElement : src) {
          String name = webElement.getText();
          log.info("["+name+"]");
      }
  }
	  
  @Test(priority=2)
   public void  Notificationhandle() throws InterruptedException {
	  
	  WebElement not=driver.findElement(By.xpath("//img[@alt='icon']"));
	  act=new Actions(driver);
	  act.moveToElement(not).perform();
	  Thread.sleep(2000);
	  not.click();
	  Thread.sleep(2000);
	  WebElement scro=driver.findElement(By.xpath("//div[@class='flex border-BH_background_card transition-all rounded-[1.25rem] relative hover:shadow-card_shadow hover:border-BH_primary border-2 bg-BH_background_container z-10 py-4 pl-4 pr-2']"));
	  scro.click();
	  act.sendKeys(Keys.PAGE_DOWN).build().perform();
	  
	  Thread.sleep(2000);
	  act.sendKeys(Keys.PAGE_UP).build().perform();
	 
	 
	  
	

	  
	
	  
	  
	  
  }



}