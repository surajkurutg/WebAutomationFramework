package testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T9profile extends BaseClass {

  @Test(priority=1)
  public void Profile() throws InterruptedException {
	Thread.sleep(3000);
	  WebElement prf=find("xpath","//h2[@class=' uppercase text-[2rem] font-medium']");
	  Actions act=new Actions(driver);
	  act.moveToElement(prf).perform();
	  prf.click();
	  Thread.sleep(3000);
	  
	  List<WebElement> pro=finds("xpath","//div[@class='flex flex-col w-full']");
	  for(WebElement fet:pro) {
	  String up=fet.getText();
	  log.info(up);
	  }
	  
	  WebElement cp=find("xpath","//button[.='Profile ']");
	  Actions cpt=new Actions(driver);
	  act.moveToElement(cp).perform();
	  Thread.sleep(3000);
	  cp.click();
	  
	
  }
  
  @Test(priority=2)
  public void AddProfile() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement fname=find("xpath","//input[@placeholder='First name']");
	  fname.click();
	  fname.clear();
	  fname.sendKeys("Suraj");
	  
	  WebElement lname=find("xpath","//input[@placeholder='Last name']");
	  lname.click();
	  lname.clear();
	  lname.sendKeys("Kutrugai");
	  
	  WebElement addimage=find("xpath","//input[@id='upload_profile_img']");
	  addimage.sendKeys("C:\\Users\\Dell\\git\\my3dmeta\\FrameWork\\Resources\\Images\\beauty_of_nature_17.jpg");

	  Thread.sleep(2000);
	  WebElement save=find("xpath","//button[.='Save changes']");
	  save.click();
	  
	  WebElement tostify=find("xpath","//div[@role='alert']");
		 tostify.click();
		 String ActM=tostify.getText();
		 String ExpeM="User Profile Edited successfully";
		 Assert.assertEquals(ActM, ExpeM);
		 log.info(ActM);
		 
		 
	  Thread.sleep(5000);
  }
  
  @Test(priority=3)
  public void Organisation() throws InterruptedException {
	 
	  WebElement org=find("xpath","//button[.='Organisation ']");
	  org.click();
	 
	  WebElement orgname=find("xpath","//input[@placeholder='Organisation Name']");
	  orgname.sendKeys("Tech Mahindra");
	  
	  WebElement dd=find("xpath","//select[@name='organization_phone_country_code']");
	  dd.click();
	  List<WebElement> cc=finds("xpath","//select[@name='organization_phone_country_code']/option");
	  for(WebElement sc:cc) {
		  if(sc.getText().equals("India (+91)"))
          {
			  Actions act = new Actions(driver);
			  act.doubleClick(sc).perform();
          break;
          }}
	 
	  WebElement pn=find("xpath","//input[@placeholder='Phone (optional)']");
	  pn.clear();
	  pn.sendKeys("8412852926");
	  
	 List<WebElement> btype=finds("xpath","//div[@class='flex gap-x-5 gap-y-4 flex-wrap']/div");
	 for(WebElement sbtype:btype) {
		 if(sbtype.getText().equals("Game Studio")) {
			 sbtype.click();
		 }}
		 
		 WebElement save=find("xpath","//button[.='Save changes']");
		 save.click();
		 
		 
		 WebElement Tostify=find("xpath","//div[@role='alert']");
		 Tostify.click();
		 String ActM=Tostify.getText();
		 String ExpeM="Organization Profile Edited successfully";
		 Assert.assertEquals(ActM, ExpeM);
		 log.info(ActM);
		 
		 WebElement billing=find("xpath","//button[.='Billing ']");
		 billing.click();
		
		 WebElement AddNA=find("xpath","//div[@class='flex flex-col']/div[2]/p[1]");
		 AddNA.click();
		 
	 }
	  
  @Test(priority=4)
  public void Billing() throws InterruptedException { 
	
	Thread.sleep(3000);
	WebElement cc=find("xpath","//select[@name='phone_country_code']");
	cc.click();
	List<WebElement> scc=finds("xpath","//select[@name='phone_country_code']/option");
	for(WebElement icc:scc) {
       if(icc.getText().equals("91")) {
			icc.click();
			 }
	}
	 
	Thread.sleep(3000);
	 WebElement pn=find("xpath","//input[@name='phone']");
	 pn.sendKeys("7822923364");
	
	 Thread.sleep(3000);
	 WebElement cr=find("xpath","//select[@name='country_region']");
	 cr.click();
	 List<WebElement> lcr=finds("xpath","//select[@name='country_region']/option");
	 for(WebElement scr:lcr) {
		 if(scr.getText().equals("India")) {
		 /*Actions act = new Actions(driver);
		  act.doubleClick(scr).perform();*/
			 scr.click();
          }
		 }
	 Thread.sleep(3000);
	 WebElement fhcadd=find("xpath","//input[@name='addres_line_1_house_no']");
	 fhcadd.sendKeys("viman nagar flat no 3000");
	 Thread.sleep(3000);
	
	 WebElement ass=find("xpath","//input[@name='addres_line_2_area']");
	 ass.sendKeys("near axis bank pune");
	 Thread.sleep(3000);
	
	 WebElement city=find("xpath","//input[@name='city']");
	 city.sendKeys("Pune");
	 Thread.sleep(3000);
	
	 WebElement state=find("xpath","//select[@name='state']");
	 state.click();
	 Thread.sleep(3000);
	 List<WebElement> lstate=finds("xpath","//select[@name='state']/option");
	 for(WebElement sstate:lstate) {
		 if(sstate.getText().equals("Brunei")) {
			 sstate.click();
			 
		 }}
	 Thread.sleep(3000);
	 WebElement pin=find("xpath","//input[@name='pincode']");
	 pin.sendKeys("424002");
	 
  }
  




}
  





