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



	@FindBy(name="username")
	 WebElement txtusername;
	 
	 @FindBy(name="password")
	 WebElement txtpassword;

	 @FindBy(css="button[type='submit']")
	 WebElement button;
	 
	 public void setUsername (String Uname) {
		 txtusername.sendKeys(Uname);
		  }
	 
	 public void setpassword(String Upass) {
		 txtpassword.sendKeys(Upass);
		 }
	 
	 public void ClickButton() {
		 button.click();
	 }

	

}
