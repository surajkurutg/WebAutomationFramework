package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver idriver;

	
	 
	

	public LoginPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);// constructor	
	}



	@FindBy(xpath="//input[@placeholder='First name']")
	 WebElement txtfirstname ;
	 
	 @FindBy(xpath="//input[@placeholder='Last name']")
	 WebElement txtlastname;

	 @FindBy(xpath="//input[@placeholder='Enter Email']")
	 WebElement txtemailid;
	
	 @FindBy(xpath="//button[normalize-space()='Get started']")
	 WebElement button;
	 
	 public void Login (String UFirstname, String ULastname, String Uemail ) {
		 txtfirstname.sendKeys("UFirstname");
		 txtlastname.sendKeys("ULastname");
		 txtlastname.sendKeys("Uemail");
		 button.click();
		  }
	 
	
	 
	

	

}
