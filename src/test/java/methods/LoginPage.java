package methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.restassured.RestAssured;
import pageFactory.LoginPageFactory;
import utilities.DriverConfig;

public class LoginPage extends DriverConfig {

	@SuppressWarnings("deprecation")
	public static void LoginFunctionality(String username, String password) {
		LoginPageFactory pagefactory = new LoginPageFactory();

	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory.userName.click();
		pagefactory.userName.sendKeys(username);
		pagefactory.password.click();
		pagefactory.password.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		pagefactory.submitButton.click();

	}

	

}
