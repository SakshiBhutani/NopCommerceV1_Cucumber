package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public SearchCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper = new WaitHelper(ldriver);
	}
	
	@FindBy(id = "SearchEmail")
	WebElement txtbox_searchEmail;
	
	@FindBy(id = "SearchFirstName")
	WebElement txtbox_searchFname;
	
	@FindBy(id = "SearchLastName")
	WebElement txtbox_searchLname;
	
	@FindBy(id = "SearchMonthOfBirth")
	WebElement txtbox_searchDOBMonth;
	
	@FindBy(id = "SearchDayOfBirth")
	WebElement txtbox_searchDOBDay;
	
	@FindBy(id = "SearchCompany")
	WebElement txtbox_searchCompany;
	
	@FindBy(id = "SearchIpAddress")
	WebElement txtbox_searchIPAdd;
	
	@FindBy(id = "SelectedCustomerRoleIds_taglist")
	WebElement listbox_searchCustomerRole;
	
	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	WebElement listItemAdministrators;
	
	@FindBy(xpath = "//li[contains(text(),'Registered')]")
	WebElement listItemRegistered;
	
	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	WebElement listItemGuests;
	
	@FindBy(xpath = "//li[contains(text(),'Vendors')]")
	WebElement listItemVendors;
	
	@FindBy(xpath = "//li[contains(text(),'Forum Moderators')]")
	WebElement listItemForumModerators;
	
	@FindBy(id = "search-customers")
	WebElement btn_search;
	
	@FindBy(xpath = "//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableColumns;
	
	public void setSearchEmail(String email) {
		waithelper.waitForElement(txtbox_searchEmail, 30);
		txtbox_searchEmail.clear();
		txtbox_searchEmail.sendKeys(email);
	}
	
	public void setSearchFname(String fname) {
		waithelper.waitForElement(txtbox_searchFname, 30);
		txtbox_searchFname.clear();
		txtbox_searchFname.sendKeys(fname);
	}
	
	public void setSearchLname(String lname) {
		waithelper.waitForElement(txtbox_searchLname, 30);
		txtbox_searchLname.clear();
		txtbox_searchLname.sendKeys(lname);
	}
	
	public void clickSearchbtn() {
		btn_search.click();
	}
	
	public int getNumberOfRows() {
		return (tableRows.size());
	}
	
	public int getNumberOfColumns() {
		return (tableColumns.size());
	}
	
	public boolean searchCustomerByEmailID(String email) {
		boolean flag = false;
		
		for (int i=1;i<=getNumberOfRows();i++) {
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
			if (emailid.equalsIgnoreCase(email)) {
				flag =true;
			}
		}
		
		return flag;
	}
	
	public boolean searchCustomerByName(String actName) {
		boolean flag = false;
		
		for (int i=1;i<=getNumberOfRows();i++) {
			String name = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
			String names[] = name.split(" ");
			String actNames[] = actName.split(" ");
			if (names[0].equals(actNames[0]) && names[1].equals(actNames[1])) {
				flag =true;
			}
		}
		
		return flag;
	}
	
	

}


