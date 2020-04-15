package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class OrangeHRMsteps {
	
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "F://Eclipse//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("I open OrangeHRM homepage")
	public void i_open_OrangeHRM_homepage() {
	    driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
	    boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
	    Assert.assertEquals(true, status);
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

}
