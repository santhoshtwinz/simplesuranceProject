package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverConfig;

public class CreateNewOfferPageFactory extends DriverConfig{

	@FindBy(xpath = "//div[@id='country-select']")
	public WebElement countryDopdown;
	
	@FindBy(xpath = "//li[@data-value='DE']")
	public WebElement selectCountry;
	
	@FindBy(xpath = "//div[@id='product-name-select']")
	public WebElement productNameDropdown;
	
	@FindBy(xpath = "//li[@data-value='Nokia_v1Allianz_global']")
	public WebElement selectProductName;
	
	@FindBy(xpath = "//div[@id='tariff-name-select']")
	public WebElement tariffDropdown;
	
	@FindBy(xpath = "//li[@data-value='1-34-Nokia_v1Allianz_global-D-EUR-v1-Accidental_damage']")
	public WebElement selecttariff;
	
	@FindBy(xpath = "//div[@id='category-name-select']")
	public WebElement categoryDropdown;
	
	@FindBy(xpath = "//li[@data-value='CATEGORY_SMARTPHONE']")
	public WebElement selectcategory;
	
	@FindBy(xpath = "//div[@id='duration-select']")
	public WebElement periodDropdown;
	
	@FindBy(xpath = "//li[@data-value='24 month(s)']")
	public WebElement selectperiod;
	
	@FindBy(xpath = "//div[@id='frequency-select']")
	public WebElement paymentTypeDropdown;
	
	@FindBy(xpath = "//li[@data-value='24 month(s)']")
	public WebElement selectpayment;
	
	@FindBy(xpath = "//div[@id='class-name-select']")
	public WebElement classDropdown;
	
	@FindBy(xpath = "//li[@data-value='PDCODE902948']")
	public WebElement selectclass;
	
	@FindBy(xpath = "//input[@name='serialNumber']")
	public WebElement serialNumber;

	@FindBy(xpath = "//input[@name='deviceName']")
	public WebElement deviceName;
	
	@FindBy(xpath = "//input[@name='invoiceNumber']")
	public WebElement invoiceNumber;
	
	@FindBy(xpath = "//input[@name='orderNumber']")
	public WebElement orderNumber;
	
	@FindBy(xpath = "//span[contains(text(), 'Next')]/parent::button[@type='button']")
	public WebElement nextButton;
	
	//------------------------------------------------------------------------------------
	//Page 2
	
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@name='streetName']")
	public WebElement streetName;
	
	@FindBy(xpath = "//input[@name='streetNumber']")
	public WebElement houseNumber;
	
	@FindBy(xpath = "//input[@name='zip']")
	public WebElement zip;
	
	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@name='country']")
	public WebElement country;
	
	@FindBy(xpath = "//input[@name='taxCode']")
	public WebElement taxCode;
	
	//---------------------------------------------------------------------------------------------------
	//Page 3
	
	@FindBy(xpath = "//*[contains(text(),'All information')]/preceding::input[@type='checkbox']")
	public WebElement checkbox_1;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement checkbox_2;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	public WebElement checkbox_3;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	public WebElement checkbox_4;
	
	
	@FindBy(xpath = "//span[contains(text(), 'Create')]/parent::button[@type='button']")
	public WebElement createButton;
	
	@FindBy(xpath = "//span[contains(text(), 'Back')]/following::span[contains(text(),'EUR ')]")
	public WebElement TotalAmount;
	
	
	
	
	 public CreateNewOfferPageFactory() {
		PageFactory.initElements(driver, this);
	}
}
