package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practice extends BaseClass {

	
	
	
	@Test
	public void test() {
		List <WebElement> ss =driver.findElements(By.xpath("//*[@id='nav-xshop']/child::a"));
		
		for (WebElement s : ss) {
			 String str = s.getText();
			 
			  if(str.contains("  Amazon miniTV")) {
				  Assert.assertEquals(str, "  Amazon miniTV");
				  System.out.println(str);
			  }
			  
			  else if(str.contains("Sell")) {
				  Assert.assertEquals(str, "Sell");
				  System.out.println(str);
			  }
		 
			  else if(str.equalsIgnoreCase("Best Sellers")) {
				  Assert.assertEquals(str, "Best Sellers");
				  System.out.println(str);
			  }
			  else if(str.contains("Today's Deals")) {
				  Assert.assertEquals(str, "Today's Deals");
				  System.out.println(str);
			  }
		}
		
	}
}
