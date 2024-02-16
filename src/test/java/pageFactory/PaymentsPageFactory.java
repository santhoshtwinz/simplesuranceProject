package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverConfig;

public class PaymentsPageFactory extends DriverConfig{

	@FindBy(xpath = "//button[@type='button']")
	public WebElement nextPage;
	
	@FindBy(xpath = "//iframe[@allow='payment *']")
	public WebElement iframe;
	
	@FindBy(xpath = "//h3[@data-testid='total-component']")
	public WebElement totalAmount;
	
	@FindBy(xpath = "//input[@name='cardnumber']")
	public WebElement cardNumber;
	
	@FindBy(xpath = "//input[@name='exp-date']")
	public WebElement expiryDate;
	
	@FindBy(xpath = "//input[@name='cvc']")
	public WebElement cvcNumber;
	
	@FindBy(xpath = "//button[@type='button'][1]")
	public WebElement CreateButton;
	
	@FindBy(xpath = "//span[contains(text(), 'Status')]/following::span[1]")
	public WebElement insuranceStatus;
	
	@FindBy(xpath = "//*[contains(text(), 'List')]/parent::button")
	public WebElement navigateToList;
	
	
	
	
	
	 public PaymentsPageFactory() {
		PageFactory.initElements(driver, this);
	}
}
