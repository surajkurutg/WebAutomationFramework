package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T006_addasset extends BaseClass {
  
	@Test(priority=1)
  public void UploadImage() throws InterruptedException {
	  
	  WebElement ele=driver.findElement(By.xpath("//div[@class='w-[88px] col-span-1 h-[800px] rounded-lg  duration-200 p-[20px] bg-BH_background_card relative block']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//p[text()='Library']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[text()='Upload now']")).click();
		Thread.sleep(3000);
		WebElement uimg=driver.findElement(By.xpath("//input[@type='file']"));
		//uimg.click();
		Thread.sleep(3000);
		uimg.sendKeys("C:\\Users\\Dell\\Downloads\\AA_C2.zip");
		
		log.info("picture uploded");
		
		driver.findElement(By.xpath("//button[@class='text-[#F8938A] cursor-pointer']")).click();
		Thread.sleep(3000);
  }
  
  @Test(priority=2)
  public void Filter() throws InterruptedException {
	  driver.findElement(By.xpath("//div[contains(@class,'flex flex-row gap-x-4 justify-start items-center font-Brutal_type text-xl')]//div[1]")).click();
	  List<WebElement> fil=driver.findElements(By.xpath("//div[@class='relative border border-BH_primary shadow-card_shadow rounded-lg py-8 px-32 inline-block bg-BH_background_container']"));
      System.out.println(fil.size());

      
     driver.findElement(By.xpath("//*[text()='Wearables']")).click();
	 driver.findElement(By.xpath("//*[text()='Head']")).click();
     driver.findElement(By.xpath("//*[text()='Format']")).click();
     List <WebElement> check1= driver.findElements(By.xpath("//label[@class='text-BH_primary font-Brutal_type_medium text-base cursor-pointer']"));
	  for(WebElement webele1 : check1) {
		  if(!webele1.isSelected()) {
	        	webele1.click(); }}
	 
	  List <WebElement> Ttags= driver.findElements(By.xpath("//div[@class='cursor-pointer rounded-xs font-Brutal_type_medium text-base px-4 py-1 h-max flex justify-between items-center gap-x-1 bg-[#4F4C4D] text-BH_orange_secondary']"));
	  for(WebElement webele : Ttags) {
		  if(!webele.isSelected()) {
	        	webele.click(); }}
  
	  Thread.sleep(3000);
	  List <WebElement> apllayF= driver.findElements(By.xpath("//div[@class='mt-[50px] flex bg-BH_background_card w-full h-[120px] rounded-xs p-2 justify-between max-w-[928px]']"));
	  for(WebElement webele2 : apllayF) {
		  String Aname=webele2.getText();
		  log.info(Aname);
		  
		  }
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[text()='Apply Filters']")).click();
	  driver.findElement(By.xpath("//button[@class='text-[#F8938A]']")).click();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[normalize-space()='Go to editor']")).click();
  }
}
