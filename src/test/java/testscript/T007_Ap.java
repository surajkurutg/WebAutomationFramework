package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T007_Ap extends BaseClass{
  @Test
  public void AddProject() throws InterruptedException {
	  
	  
	  WebElement nl = find("xpath","//button[text()='Add project']");
	  nl.click();
	  WebElement aapp = find("xpath","//button[text()='Add application']");
	  aapp.click();
	  
	  WebElement uimg = find("xpath","//input[@id='thumb']");
	  uimg.sendKeys("C:\\Users\\Dell\\Downloads\\military-text-effect_23-2149378931.png");
	  
	  
	  WebElement aname = find("xpath","//input[@name='projectTitle']");
	  aname.sendKeys("GTA Sanandri");
	  
	  WebElement choose = find("xpath","//p[text()='Choose here']");
	  choose.click();
      
	  List<WebElement> chose=finds("xpath","//label[@class='flex items-center gap-4 text-BH_primary font-Brutal_type_medium text-base undefined']");
      for(WebElement here:chose) {
    	  if(!here.isSelected()) {
    		  Thread.sleep(1000);
    		  here.click();
    		  Thread.sleep(1000);
    	  }}
    
      
      WebElement ch = find("xpath","//p[text()='Choose here']");
	  ch.click();

	 
	  List <WebElement> checkbox=finds("xpath","//div[@class='flex flex-wrap ']");
	  for(WebElement cb:checkbox) {
		  String app=cb.getText();
		  log.info(app);
	  }
	  }}
