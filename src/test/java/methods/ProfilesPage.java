package methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.ProfilePageFactory;
import utilities.DriverConfig;

public class ProfilesPage extends DriverConfig {
	
@SuppressWarnings("deprecation")

public static void ProfileFunctionality() throws InterruptedException {
	ProfilePageFactory pagefactory = new ProfilePageFactory();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	pagefactory.changeLanguage.click();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	pagefactory.selectLang.click();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	pagefactory.createNew.click();
	
	
}
}
