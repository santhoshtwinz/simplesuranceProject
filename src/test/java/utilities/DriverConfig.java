package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {

		public static WebDriver driver;

	    public void setUp() {
	        driver = new ChromeDriver();
	        ChromeOptions options = new ChromeOptions();
	        options.setCapability("javascriptEnabled", true);
	    }
	
}
