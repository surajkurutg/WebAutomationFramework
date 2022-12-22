package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Automation\\FrameWork\\Drivers\\driver12\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://india-legal-fe.antino.ca/");
	Thread.sleep(5000);
	WebElement ref=driver.findElement(By.xpath("//p[text()='Register as a Lawyer']"));
	ref.click();
	}

}
