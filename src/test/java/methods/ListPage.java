package methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.CreateNewOfferPageFactory;
import pageFactory.ListPageFactory;
import pageFactory.ProfilePageFactory;
import utilities.DriverConfig;

public class ListPage extends DriverConfig {
	

public static void CheckSortation() throws InterruptedException {
	ListPageFactory pagefactory = new ListPageFactory();
	
	long valueposition_one = 0;
	long valueposition_two = 0;
	
	

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagefactory.firstValue));
	String firstValue = element.getText().trim();
	System.out.println(firstValue);
	String secondValue = pagefactory.secondValue.getText().trim();
	System.out.println(secondValue);

	try {
		valueposition_one = Long.parseLong(firstValue);
		valueposition_two = Long.parseLong(secondValue);
	    
	    System.out.println("Parsed First Value: " + valueposition_one);
	    System.out.println("Parsed Second Value: " + valueposition_two);
	} catch (NumberFormatException e) {
	    System.err.println("Error parsing integer value: " + e.getMessage());
	}
	
	if(valueposition_one<valueposition_two) {
		System.out.println("The sortation is in ascending order");
	}
	else {
		System.out.println("The sortation is in decending order");
	}
	
    //ascending order sort button
	pagefactory.AS_sortation_button.click();
	
	String firstValue_AS = element.getText().trim();
	System.out.println(firstValue);
	String secondValue_AS = pagefactory.secondValue.getText().trim();
	System.out.println(secondValue);

	try {
		valueposition_one = Long.parseLong(firstValue_AS);
		valueposition_two = Long.parseLong(secondValue_AS);
	    
	    System.out.println("Parsed First Value: " + valueposition_one);
	    System.out.println("Parsed Second Value: " + valueposition_two);
	} catch (NumberFormatException e) {
	    System.err.println("Error parsing integer value: " + e.getMessage());
	}
	
	if(valueposition_one<valueposition_two) {
		System.out.println("The sortation is in ascending order");
	}
	else {
		System.out.println("The sortation is in decending order");
	}
	
		
}

public static void CheckFilterAndSearch() throws InterruptedException {
	ListPageFactory pagefactory = new ListPageFactory();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagefactory.firstValue));
	String policy_Number = element.getText().trim();
	
	System.out.println("The policynumber is "+policy_Number);
	
	WebElement search = wait.until(ExpectedConditions.visibilityOf(pagefactory.search));
	search.click();
	
	WebElement PN_Search = wait.until(ExpectedConditions.visibilityOf(pagefactory.select_policynumber_search));
	PN_Search.click();
	pagefactory.policyInput.sendKeys(policy_Number);
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
	
	String insurance_details= pagefactory.insuranceDetails.getText();
	
	System.out.println("The insurance details are as follows "+insurance_details);

}
public static void ListFunctionality() throws InterruptedException {
	ProfilePageFactory pagefactory = new ProfilePageFactory();

	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	pagefactory.changeLanguage.click();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	pagefactory.selectLang.click();
	
}

}
