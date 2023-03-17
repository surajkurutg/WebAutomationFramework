package sampleruns;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClasses {

	public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException {
		
		File file=new File("C:\\Users\\Dell\\git\\my3dmeta\\FrameWork\\Resources\\Coustome_Order.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("data_after_using");
		
		
		
		
		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\git\\my3dmeta\\FrameWork\\Drivers\\driver12\\chromedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://dev.my3dmeta.com/signup");
		
		
		//log.info("*****User on Signin Page*****");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue with Google']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satyam@my3dmeta.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satyam4741@");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	  Thread.sleep(5000);
	   WebElement ele=driver.findElement(By.xpath("//div[@class='w-[88px]  hover:w-[304px] w-[88px] h-[calc(100vh-150px)] rounded-lg  duration-[150ms] p-[20px] bg-BH_background_card sticky top-[110px] flex flex-col group']"));
	   Actions act=new Actions(driver);
	   act.moveToElement(ele).perform();
	   Thread.sleep(2000);
		
		 WebElement nl=driver.findElement(By.xpath("//p[.='Custom orders']"));
		 nl.click();
		 nl.click();
		 Thread.sleep(2000);
		 WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
		 search.sendKeys("test_118",Keys.ENTER);
		 Thread.sleep(5000);
		 
		 WebElement table=driver.findElement(By.xpath("//div[@class='relative max-w-6xl flex flex-col']/div[1]"));
		 List<WebElement> tr=table.findElements(By.xpath("div"));
		 
		 for(int r=0;r<tr.size();r++) 
		 {
			 XSSFRow rv=sh.createRow(r);
			 List<WebElement> tc=tr.get(r).findElements(By.xpath("div"));
			 for(int c=0;c<tc.size();c++) 
			 {
				List<WebElement> tc1=tr.get(r).findElements(By.xpath("div"));
				String cv=tc1.get(c).getText(); 
				System.out.println(cv+"\t");
				//rv.createCell(c).setCellValue(cv);
				rv.createCell(c).setCellValue(cv);
				//rv.createCell(c).setCellValue("1.0");
			 }
			 System.out.println();
		 }
		 
		 FileOutputStream fos=new FileOutputStream(file);
		// XSSFSheet sh1=wb.createSheet("satyam");
		 wb.write(fos);
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*WebElement table=driver.findElement(By.xpath("//div[@class='relative w-full flex flex-col gap-y-5 mt-9']"));
		 List<WebElement> irows =table.findElements(By.xpath("//div[@class='bg-BH_background_card py-4 px-8 rounded-xs w-full flex text-white font-Brutal_type']"));     
		 int iRowsCount = irows.size();     
		 List<WebElement> icols =driver.findElements(By.xpath(" //div[@class='bg-BH_background_card py-4 px-8 rounded-xs w-full flex text-white font-Brutal_type']/div['w-1/5 pr-8 flex gap-x-1']"));     
		 int iColsCount = icols.size();     
		 System.out.println("Selected web table has " +iRowsCount+ " Rows and " +iColsCount+ " Columns");     
		 System.out.println();  
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\Dell\\git\\my3dmeta\\FrameWork\\Resources\\my3dmeta.xlsx");                                 

		 XSSFWorkbook wkb = new XSSFWorkbook();       
		 XSSFSheet sheet1 = wkb.createSheet("DataStorage");*/

	                  


	
	}
}
