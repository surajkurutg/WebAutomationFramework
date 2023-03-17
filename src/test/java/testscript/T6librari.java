package testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T6librari extends BaseClass {
  //T6_Librari
  @Test(priority=1)
  public void Librarys() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement ele=find("xpath","//div[@class='w-[88px]  hover:w-[304px] w-[88px] h-[calc(100vh-150px)] rounded-lg  duration-[250ms] p-[20px] bg-BH_background_card sticky top-[130px] block']");
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  Thread.sleep(2000);
	  WebElement li = find("xpath","//p[.='Library']");
	  li.click();
	    }
  
  @Test(priority=2)
  public void Filter() throws InterruptedException {
	 WebElement filt = find("xpath","//div[contains(@class,'flex flex-row gap-x-4 justify-start items-center font-Brutal_type text-xl')]//div[1]");
	 filt.click();
	  
	 List<WebElement> fil=finds("xpath","//div[@class='relative border border-BH_primary shadow-card_shadow rounded-lg py-8 px-32 inline-block bg-BH_background_container']");
     log.info(fil);

     Thread.sleep(1000);
     WebElement wearb = find("xpath","//*[text()='Wearables']");
     wearb.click();
     
     Thread.sleep(1000);
     WebElement head = find("xpath","//*[text()='Head']");
     head.click();

     Thread.sleep(1000);
	 WebElement format = find("xpath","//*[text()='Format']");
     format.click();
     
     Thread.sleep(1000);
     List <WebElement> check1=finds("xpath","//label[@class='flex items-center gap-4 text-BH_primary font-Brutal_type_medium text-base undefined']");
    	 for(WebElement webele1 : check1) {
		  if(!webele1.isSelected()) {
	        	webele1.click(); }}
	  Thread.sleep(2000);
	  
	  List <WebElement> Ttags=finds("xpath","//div[@class='cursor-pointer rounded-xs font-Brutal_type_medium text-base px-4 py-1 h-max flex justify-between items-center gap-x-1 bg-[#4F4C4D] text-BH_orange_secondary']");
	  for(WebElement webele : Ttags) {
		  if(!webele.isSelected()) {
	        	webele.click(); }}
  
	  Thread.sleep(3000);
	  List <WebElement> apllayF=finds("xpath","//div[contains(@class,'flex w-full bg-BH_background_card rounded-lg p-2')]");
	  for(WebElement webele2 : apllayF) {
		  String Aname=webele2.getText();
		  log.info(Aname);
		 }
	  
	  Thread.sleep(3000);
	  WebElement afilt = find("xpath","//button[text()='Apply Filters']");
	  afilt.click();
	 
	  Thread.sleep(3000);
	  String src= driver.getCurrentUrl();
	  log.info("["+src+"]");
	  }
  
  @Test(priority=3)
  public void Uploadimage() throws InterruptedException {

   WebElement unow=find("xpath","//button[.='Upload now']");
   unow.click();
	 
   WebElement uim=find("xpath","//input[@type='file']");
		  
   uim.sendKeys("C:\\Users\\Dell\\Downloads\\AA_C2-Copy.zip");
   
   Thread.sleep(10000);
   
   WebElement next=find("xpath","//button[.='Next']");
   next.click();
  
   }
  
  @Test(priority=4)
  public void AssitViewPage_Properties () throws InterruptedException {
	 WebElement prop=find("xpath","//p[.='Properties']");
	 prop.click();
	  
  	  
	 WebElement prop1=find("xpath","//p[@class='font-medium text-[20px] leading-[24px] cursor-pointer font-Brutal_type text-BH_primary']");
  	 prop1.click();
	  
  	 WebElement txt=find("xpath","//input[@type='text']");
  	 txt.sendKeys("Jacket Brown");

  	 WebElement cate=find("xpath","//p[.='Category']");
  	 cate.click();
  
  	 List<WebElement> cat=finds("xpath","//label[@class='flex items-center gap-4 text-BH_primary font-Brutal_type_medium text-base undefined']");
  	 for(WebElement webel : cat) {
  		  if(!webel.isSelected()) {
  			webel.click(); }}
	  log.info("sdsdshdhdwd");
  	 
	 WebElement subc=find("xpath","//p[.='Subcategory']");
	 subc.click();
  	 Thread.sleep(2000);
  	 WebElement ainfo1=find("xpath","//label[@for='5']");
  	 ainfo1.click();
  	 
  	 WebElement ainfo2=find("xpath","//p[.='Tags']");
  	 ainfo2.click();
  	 
  	 WebElement ainfo3=find("xpath","//label[@for='6Waists']");
  	 ainfo3.click();
  	 
  	 JavascriptExecutor js = (JavascriptExecutor) driver;
  	 js.executeScript("window.scrollBy(0,-500)");
  	
  	 Thread.sleep(2000);
  	 WebElement prop2=find("xpath","//p[text()='Properties']");
  	 prop2.click();
  	
  	 Thread.sleep(2000);
  	 }
  
  @Test(priority=5)
  public void AssitViewPage_Control() throws InterruptedException {
	  WebElement cont=find("xpath","//p[text()='Controls']");
	  cont.click();
	  
	  List<WebElement> rebu=finds("xpath","//span[@class='w-[32px] h-[22px] right-7 absolute rounded-lg transform transition-transform bg-white']");
      for(WebElement reb:rebu) {
    	  if (!reb.isSelected()) {
    		  Thread.sleep(2000);
    		  reb.click();
    		  Thread.sleep(2000);}}
	 
      WebElement rt=find("xpath","//button[text()='Raise a ticket']");
	  rt.click();
  }
  
  @Test(priority=6)
  public void RaiseTck() {
	  WebElement att=find("xpath","//input[@placeholder='Add a title']");
	  att.sendKeys("SatyamPatil");
	  WebElement dyih=find("xpath","//textarea[@placeholder='Describe your issue here']");
	  dyih.sendKeys("Brown Jackets For Men. Casual items that are easily coordinated are wardrobe basics and our brown jackets for men are one such example. Lightweight jackets, corduroy jackets ");
	  
	 
	  WebElement si=find("xpath","//button[text()='Submit issue']");
	  si.click();
	
	  WebElement rt1=find("xpath","//button[@class='text-[#F8938A] cursor-pointer ']");
	  rt1.click();
	  
	  WebElement rt2=find("xpath","//p[text()='Controls']");
	  rt2.click();
  }
}
