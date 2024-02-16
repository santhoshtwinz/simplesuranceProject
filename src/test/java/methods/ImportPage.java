package methods;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.CreateNewOfferPageFactory;
import pageFactory.ImportPageFactory;
import pageFactory.ListPageFactory;
import pageFactory.ProfilePageFactory;
import utilities.DriverConfig;

public class ImportPage extends DriverConfig {

	public static void Importfunctionality() throws InterruptedException {
		ImportPageFactory pagefactory = new ImportPageFactory();

		pagefactory.importpage.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		pagefactory.changeLanguage.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		pagefactory.selectLang.click();

	}

	public static void fileUpload() throws InterruptedException {
		ImportPageFactory pagefactory = new ImportPageFactory();
		File file = new File("./src/test/resources/csv_package/testdata.csv");
		pagefactory.selectCSV.sendKeys(file.getAbsolutePath());
		Thread.sleep(5000);
		pagefactory.createInsurance.click();
	}
	
	public static void validation() throws InterruptedException {
		ImportPageFactory pagefactory = new ImportPageFactory();
		File file = new File("./src/test/resources/csv_package/testdata.csv");
		pagefactory.selectCSV.sendKeys(file.getAbsolutePath());
		pagefactory.importpage.click();

		
		try {
		String error_message = pagefactory.alertbox.getText();
		System.out.println("The error message reads "+error_message);
		}
		catch (Exception e) {
			System.out.println(e);

		}
		String fileName = pagefactory.fileName.getText();
		System.out.println("The file name is "+fileName);
		
		String lastModified = pagefactory.lastModified.getText();
		System.out.println("LastModified "+lastModified);
		
				
	}

}
