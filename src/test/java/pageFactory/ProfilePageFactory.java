package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverConfig;

public class ProfilePageFactory extends DriverConfig{

	@FindBy(xpath = "//button[@aria-label='Menu']")
	public WebElement changeLanguage;
	
	@FindBy(xpath = "//span[contains(text(),'Englis')]")
	public WebElement selectLang;
	
	@FindBy(xpath = "(//button/preceding::a)[2]")
	public WebElement createNew;
	
	@FindBy(xpath = "//*[contains(text(), 'List')]/parent::button")
	public WebElement navigate_to_list;
	
	
	 public ProfilePageFactory() {
		PageFactory.initElements(driver, this);
	}
}
