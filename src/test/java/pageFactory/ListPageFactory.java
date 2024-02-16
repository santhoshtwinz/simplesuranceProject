package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverConfig;

public class ListPageFactory extends DriverConfig{

	@FindBy(xpath = "(//button[contains(text(), '2000')])[1]")
	public WebElement firstValue;
	
	@FindBy(xpath = "(//button[contains(text(), '2000')])[2]")
	public WebElement secondValue;
	
	@FindBy(xpath = "//*[@data-testid='ExpandMoreIcon']")
	public WebElement AS_sortation_button;
	
	@FindBy(xpath = "//*[@data-testid='ExpandLessIcon']")
	public WebElement DS_sortation_button;
	
	
	@FindBy(xpath = "//*[contains(text(), 'Search')]/parent::div")
	public WebElement search;
	
	@FindBy(xpath = "//li[@data-value='policy_number']")
	public WebElement select_policynumber_search;
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement policyInput;
	
	
	@FindBy(xpath = "//tr[contains(@class, 'MuiTableRow-root css')]")
	public WebElement insuranceDetails;
	
	
	
	

	
	
	
	 public ListPageFactory() {
		PageFactory.initElements(driver, this);
	}
}
