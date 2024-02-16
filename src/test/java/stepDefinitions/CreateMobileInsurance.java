package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.en.*;
import methods.CreateNewOfferPage;
import methods.ImportPage;
import methods.ListPage;
import methods.LoginPage;
import methods.PaymentDetailsPage;
import methods.ProfilesPage;
import utilities.DriverConfig;

public class CreateMobileInsurance extends DriverConfig {

	@Given("User navigates to the base page of the insurance site")
	public void user_navigates_to_Naukri_webpage() {
		setUp();
		driver.get("https://insurance-manager.sb-qa-candidatetask.sisu.sh/login");
		driver.manage().window().maximize();

	}

	@When("^the user enters valid (.*) and (.*)$")
	public void the_user_login_and_enters_valid_username_and_Automation(String username, String password) {

		LoginPage.LoginFunctionality(username, password);

	}

	@Then("the user navigates to the create insurance page from profilepage")
	public void navigate_to_createnew_page() throws InterruptedException {
		
		ProfilesPage.ProfileFunctionality();

	}
	
	@Then("^the user adds the (.*), (.*), (.*), (.*) and navigates to second page$")
	public void creates_new_insurance(String serialNo, String deviceName, String invoiceName, String orderNumber) throws InterruptedException {
		
		CreateNewOfferPage.CreateInsurancePage1(serialNo, deviceName, invoiceName, orderNumber);
	
	}
	
	@Then("^the user enters the (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) and navigates to payment page$")
	public void creates_new_insurance(String firstName, String lastName, String email, String streetName, String houseNumber, String zip, String city, String country, String taxCode) throws InterruptedException {
		
		CreateNewOfferPage.CreateInsurancePage2(firstName, lastName, email, streetName, houseNumber, zip, city, country, taxCode);
	
	}
	
	@Then("adds the payment details and create the Insurance")
	public void add_payment_details() throws InterruptedException {
		
		//Payment details are to be hidden
		
		String cardNumber = "4242424242424242";
		String expiry = "0228";
		String cvc = "322";
		PaymentDetailsPage.AddPaymentDetails(cardNumber,expiry,cvc);

	}
	
	@When("the user changes the language and lands in the list page from profilepage")
	public void navigate_to_listPage() throws InterruptedException 
	{
		ListPage.ListFunctionality();
	}
	
	
	@Then("checks the sort functionality in the policy number column")
	public void checkSortFunctionality() throws InterruptedException 
	{
		ListPage.CheckSortation();
	}
	
	@Then("checks whether the filer and search functionality works fine")
	public void checkFilterFunctionality() throws InterruptedException 
	{
		ListPage.CheckFilterAndSearch();
	}
	
	@When("the user changes the language and lands in the import page from profilepage")
	public void navigate_to_importPage() throws InterruptedException 
	{
		ImportPage.Importfunctionality();
	}
	
	
	
	@When("uploads the csv file to create a bulk insurance")
	public void uploadFile() throws InterruptedException 
	{
		ImportPage.fileUpload();
	}
	
	@When("validates the response after the insurance is created")
	public void validateresponse() throws InterruptedException 
	{
		ImportPage.validation();
	}


	@After("@Insurance")
	public void endOperation() {
		driver.close();
		driver.quit();
	}

}
