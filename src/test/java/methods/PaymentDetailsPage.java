package methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.CreateNewOfferPageFactory;
import pageFactory.PaymentsPageFactory;
import pageFactory.ProfilePageFactory;
import utilities.DriverConfig;

public class PaymentDetailsPage extends DriverConfig {
	
@SuppressWarnings("deprecation")

public static void AddPaymentDetails(String Cardnumber, String Expiry, String CVC) throws InterruptedException {
	PaymentsPageFactory pagefactory = new PaymentsPageFactory();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagefactory.totalAmount));
	String total_Value = element.getText();
	System.out.println("The total cart value is "+total_Value);
	
	pagefactory.nextPage.click();
	Thread.sleep(5000);
	
	driver.switchTo().frame(0);
	pagefactory.cardNumber.click();
	pagefactory.cardNumber.sendKeys(Cardnumber);
	pagefactory.expiryDate.click();
	pagefactory.expiryDate.sendKeys(Expiry);
	pagefactory.cvcNumber.click();
	pagefactory.cvcNumber.sendKeys(CVC);
	
	driver.switchTo().defaultContent();
	pagefactory.CreateButton.click();

	WebElement elementstatus = wait.until(ExpectedConditions.elementToBeClickable(pagefactory.insuranceStatus));

	String Insurance_status = elementstatus.getText();
	
	System.out.println("The status of the insurance is "+Insurance_status);

	pagefactory.navigateToList.click();
	
	

}
}
