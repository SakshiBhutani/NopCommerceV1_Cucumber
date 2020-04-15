package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver loginDriver){
		ldriver = loginDriver;
		PageFactory.initElements(loginDriver, this);
	}
	
	@FindBy(id = "Email")
	WebElement textboxEmail;
	
	@FindBy(id = "Password")
	WebElement textboxPassword;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input")
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	WebElement linkLogout;
	
	public void setUsername(String uname) {
		textboxEmail.clear();
		textboxEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		textboxPassword.clear();
		textboxPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		linkLogout.click();
	}

}
