package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverConfig;

public class LoginPageFactory extends DriverConfig{

	
	@FindBy(xpath = "//input[@id='login_username']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='login_password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	public WebElement submitButton;
	
	
	 public LoginPageFactory() {
		PageFactory.initElements(driver, this);
	}
}
