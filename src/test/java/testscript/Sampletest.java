package testscript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampletest {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");

		TakesScreenshot tc=(TakesScreenshot) driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File rec=new File(".\\ss\\orangehrm.png");
		FileUtils.copyFile(src, rec);
		System.out.println("captured");
		driver.quit();
	}

}
