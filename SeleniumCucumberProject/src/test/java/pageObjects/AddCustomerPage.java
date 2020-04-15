package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	
	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By link_customerMenu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By link_customersMenuItem = By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");
	
	By btn_addNew = By.xpath("/html/body/div[3]/div[3]/div/form[1]/div[1]/div/a");
	
	By txtbox_email = By.id("Email");
	By txtbox_password = By.id("Password");
	By txtbox_firstName = By.id("FirstName");
	By txtbox_lastName = By.id("LastName");
	By radiobtn_genderMale = By.id("Gender_Male");
	By radiobtn_genderFemale = By.id("Gender_Female");
	By txtbox_dob = By.id("DateOfBirth");
	By txtbox_companyName = By.id("Company");
	By chkbox_taxExempt = By.id("IsTaxExempt");
	By chkbox_newsletter1 = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div[1]/label/input");
	//*[@id="customer-info"]/div[2]/div[1]/div[9]/div[2]/div[1]/label/input
	By chkbox_newsletter2 = By.xpath("//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div[2]/label/input");
	By listitem_administrator = By.xpath("//li[contains(text(),'Administrators')]");
	By listitem_registered = By.xpath("//li[contains(text(),'Registered')]");
	By listitem_guest = By.xpath("//li[contains(text(),'Guests')]");
	By listitem_forumModerator = By.xpath("//li[contains(text(),'Forum Moderators')]");
	By listitem_vendor = By.xpath("//li[contains(text(),'Vendors')]");
	By dropdown_managerOfVendor = By.id("VendorId");
	By chkbox_active = By.id("Active");
	By txtbox_adminComment = By.id("AdminComment");
	By btn_save = By.xpath("/html/body/div[3]/div[3]/div/form/div[1]/div/button[1]");
	
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickCustomerMenu() {
		ldriver.findElement(link_customerMenu).click();
	}
	
	public void clickCustomerMenuItem() {
		ldriver.findElement(link_customersMenuItem).click();
	}
	
	public void clickAddNew() {
		ldriver.findElement(btn_addNew).click();
	}
	
	public void setEmail(String email) {
		ldriver.findElement(txtbox_email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		ldriver.findElement(txtbox_password).sendKeys(password);
	}
	
	public void setFirstName(String fname) {
		ldriver.findElement(txtbox_firstName).sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		ldriver.findElement(txtbox_lastName).sendKeys(lname);
	}
	
	public void setGender(String gender) {
		if ((gender.equalsIgnoreCase("Male")) || (gender.equalsIgnoreCase("M"))) {
			ldriver.findElement(radiobtn_genderMale).click();
		} else {
			ldriver.findElement(radiobtn_genderFemale).click();
		}
	}
	
	public void setDob(String dob) {
		ldriver.findElement(txtbox_dob).sendKeys(dob);
	}
	
	public void setCompanyName(String compname) {
		ldriver.findElement(txtbox_companyName).sendKeys(compname);
	}
	
	public void setTaxExempt(boolean exemptStatus) {
		if (exemptStatus == true) {
			ldriver.findElement(chkbox_taxExempt).click();
		}
	}
	
	public void setSubscription1(boolean sub1) {
		if (sub1 == true) {
			ldriver.findElement(chkbox_newsletter1).click();
		}
	}
	
	public void setSubscription2(boolean sub2) {
		if (sub2 == true) {
			ldriver.findElement(chkbox_newsletter2).click();
		}
	}
	
	public void setCustomerRole(String role) {
		
		WebElement listItem;
		
		if (role.equalsIgnoreCase("Administrators")) {
			listItem = ldriver.findElement(listitem_administrator);
		} else if (role.equalsIgnoreCase("Guests")) {
			listItem = ldriver.findElement(listitem_guest);
		} else if (role.equalsIgnoreCase("Registered")) {
			listItem = ldriver.findElement(listitem_registered);
		} else if (role.equalsIgnoreCase("Vendors")) {
			listItem = ldriver.findElement(listitem_vendor);
		} else if (role.equalsIgnoreCase("Forum Moderator")) {
			listItem = ldriver.findElement(listitem_forumModerator);
		} else {
			listItem = ldriver.findElement(listitem_guest);
		}
		
		//listItem.click();
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listItem);
		
	}
	
	public void setVendorManager(String manager) {
		Select drop = new Select(ldriver.findElement(dropdown_managerOfVendor));
		drop.selectByVisibleText(manager);
	}
	
	public void setActive(boolean status) {
		if (status == false) {
			ldriver.findElement(chkbox_active).click();
		}
	}
	
	public void setAdminComment(String comment) {
		ldriver.findElement(txtbox_adminComment).sendKeys(comment);
	}
	
	public void clickSave() {
		ldriver.findElement(btn_save).click();
	}
							
}
