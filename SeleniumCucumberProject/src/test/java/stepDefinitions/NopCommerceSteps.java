package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class NopCommerceSteps extends NopCommerceBaseClass{
	
	@Before
	public void setup() throws IOException {
		
		//Adding logger
		logger = Logger.getLogger("nopCommerce");
		PropertyConfigurator.configure("Log4j.properties");
				
		//Reading properties
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br = configProp.getProperty("browser");
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else if (br.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		} else if (br.equals("IE")) {
			System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		logger.info("Launching browser");
	}
	
	//Login Scenario steps
	
	@Given("User launches chrome browser")
	public void user_launches_chrome_browser() {
			
		lp = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		logger.info("Opening URL");
		driver.get(url);
	    
	}

	@When("User enters email as {string} and Password as {string}")
	public void user_enters_email_as_and_Password_as(String email, String password) {
		logger.info("Providing user credentials");
		lp.setUsername(email);
		lp.setPassword(password);  
	}

	@When("User clicks on Login")
	public void user_clicks_on_Login() {
		logger.info("Logging in");
		lp.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String exp_title) {
		String actual_title = driver.getTitle();
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			logger.info("Login failed");
			Assert.assertTrue(false);
		}else {
			logger.info("Login passed");
			Assert.assertEquals(exp_title, actual_title);
		}		
	}

	@When("User clicks on Log out link")
	public void user_clicks_on_Log_out_link() throws InterruptedException {
		logger.info("Logging out");
		lp.clickLogout();
	    Thread.sleep(2000);
	}

	@Then("Close browser")
	public void close_browser() {
		logger.info("Closing browser");
	    driver.close();
	}
	
	//Adding a new Customer steps
	
	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
		addCust = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());

	}

	@When("User clicks Customers Menu")
	public void user_clicks_Customers_Menu() throws InterruptedException {
		Thread.sleep(2000);
		addCust.clickCustomerMenu();
	}

	@When("User clicks Customers menu item")
	public void user_clicks_Customers_menu_item() throws InterruptedException {
		Thread.sleep(2000);
		addCust.clickCustomerMenuItem();
	}

	@When("User clicks Add new button")
	public void user_clicks_Add_new_button() throws InterruptedException {
		logger.info("Adding new customer");
		Thread.sleep(2000);
		addCust.clickAddNew();
	}

	@Then("User can view Add a new customer page")
	public void user_can_view_Add_a_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User enters new customer details")
	public void user_enters_new_customer_details() throws InterruptedException {
		logger.info("Adding new customer details");
		Thread.sleep(2000);
		String email = randomstring() +"@gmail.com";
		
		addCust.setEmail(email);
		addCust.setPassword("test123");
		addCust.setFirstName("abc");
		addCust.setLastName("def");
		addCust.setGender("F");
		addCust.setDob("01/01/1990");
		addCust.setCompanyName("QATest");
		addCust.setTaxExempt(true);
		addCust.setSubscription1(true);
		addCust.setSubscription2(false);
		addCust.setCustomerRole("Vendors");
		addCust.setVendorManager("Vendor 1");
		addCust.setActive(true);
		addCust.setAdminComment("This is for testing purpose.");
		Thread.sleep(2000);
		
	}

	@When("User clicks Save buttom")
	public void user_clicks_Save_buttom() throws InterruptedException {
		logger.info("Saving new customer");
		addCust.clickSave();
		Thread.sleep(2000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String message) {
		Assert.assertTrue(driver.findElement(By.tagName("Body")).getText()
				.contains("The new customer has been added successfully."));
	}
	
	//Searching customer details via EmailID
	@When("User enters emailId to search")
	public void user_enters_emailId_to_search() {
		searchCust = new SearchCustomerPage(driver);
		searchCust.setSearchEmail("victoria_victoria@nopCommerce.com");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		searchCust.clickSearchbtn();
		Thread.sleep(2000);
	}

	@Then("User should be able to find EmailId in search results table")
	public void user_should_be_able_to_find_EmailId_in_search_results_table() {
		logger.info("Searching customer using emailID");
		boolean searchStatus = searchCust.searchCustomerByEmailID("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, searchStatus);
	}
	
	//Searching customer details via EmailID
	@When("User enters firstname to search")
	public void user_enters_firstname_to_search() {
		searchCust = new SearchCustomerPage(driver);
		searchCust.setSearchFname("Victoria");
	}

	@When("User enters lastname to search")
	public void user_enters_lastname_to_search() {
	    searchCust.setSearchLname("Terces");
	}

	@Then("User should be able to find name in search results table")
	public void user_should_be_able_to_find_name_in_search_results_table() {
		logger.info("Searching customer using name");
		boolean searchStatus = searchCust.searchCustomerByName("Victoria Terces");
		Assert.assertEquals(true, searchStatus);
	}

}
