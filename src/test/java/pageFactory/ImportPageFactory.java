package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverConfig;

public class ImportPageFactory extends DriverConfig{

	
	@FindBy(xpath = "(//button/preceding::a)[3]")
	public WebElement importpage;
	
	@FindBy(xpath = "//span[contains(text(), 'Import')]/parent::span")
	public WebElement importbutton;
	
//	@FindBy(xpath = "//label[@for='input-csv']/parent::div")
//	public WebElement selectCSV;
	
	@FindBy(xpath = "//input[@type='file']")
	public WebElement selectCSV;
	
	@FindBy(xpath = "//span[contains(text(), 'Create insurance')]/parent::button")
	public WebElement createInsurance;
	
	@FindBy(xpath = "//button[@aria-label='Menu']")
	public WebElement changeLanguage;
	
	@FindBy(xpath = "//span[contains(text(),'Englis')]")
	public WebElement selectLang;
	
	@FindBy(xpath = "//h6")
	public WebElement fileName;
	
	@FindBy(xpath = "//h6/following::span[contains(text(), 'Last modified')]")
	public WebElement lastModified;
	
	@FindBy(xpath = "//div[@role='alert']")
	public WebElement alertbox;
	
	@FindBy(xpath = "//button[@aria-label='Close']")
	public WebElement closeAlert;
	
	
	
	
	
	
	
	
	

	
	
	
	 public ImportPageFactory() {
		PageFactory.initElements(driver, this);
	}
}
