package methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.CreateNewOfferPageFactory;
import pageFactory.ProfilePageFactory;
import utilities.DriverConfig;

public class CreateNewOfferPage extends DriverConfig {
	
@SuppressWarnings("deprecation")

public static void CreateInsurancePage1(String serialNo, String deviceName, String invoiceName, String orderNumber) throws InterruptedException {
	CreateNewOfferPageFactory pagefactory = new CreateNewOfferPageFactory();

	
	pagefactory.countryDopdown.click();
	pagefactory.selectCountry.click();
	pagefactory.productNameDropdown.click();
	pagefactory.selectProductName.click();
	pagefactory.tariffDropdown.click();
	pagefactory.selecttariff.click();
	pagefactory.categoryDropdown.click();
	pagefactory.selectcategory.click();
	pagefactory.periodDropdown.click();
	pagefactory.selectperiod.click();
	pagefactory.paymentTypeDropdown.click();
	pagefactory.selectpayment.click();
	pagefactory.classDropdown.click();
	pagefactory.selectclass.click();
	pagefactory.serialNumber.sendKeys(serialNo);
	pagefactory.deviceName.sendKeys(deviceName);
	pagefactory.invoiceNumber.sendKeys(invoiceName);
	pagefactory.orderNumber.sendKeys(orderNumber);
	pagefactory.nextButton.click();
}

public static void CreateInsurancePage2(String firstName, String lastName, String email, String streetName, String houseNumber, String zip, String city, String country, String taxCode) throws InterruptedException {
	CreateNewOfferPageFactory pagefactory = new CreateNewOfferPageFactory();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement firstname = wait.until(ExpectedConditions.visibilityOf(pagefactory.firstName));
	pagefactory.firstName.sendKeys(firstName);
	pagefactory.lastName.sendKeys(lastName);
	pagefactory.email.sendKeys(email);
	pagefactory.streetName.sendKeys(streetName);
	pagefactory.houseNumber.sendKeys(houseNumber);
	pagefactory.zip.sendKeys(zip);
	pagefactory.city.sendKeys(city);
	pagefactory.country.sendKeys(country);
	pagefactory.taxCode.sendKeys(taxCode);
	pagefactory.nextButton.click();
	
	
	Actions action = new Actions(driver);
	action.moveToElement(pagefactory.checkbox_1);
	//WebElement checkbox_1 = wait.until(ExpectedConditions.visibilityOf(pagefactory.checkbox_1));
	pagefactory.checkbox_1.click();
	pagefactory.checkbox_2.click();
	pagefactory.checkbox_3.click();
	pagefactory.checkbox_4.click();
	
	String total_amount = pagefactory.TotalAmount.getText();
	
	pagefactory.createButton.click();
	
	System.out.println("The total cart value is "+total_amount);
		
}
}
