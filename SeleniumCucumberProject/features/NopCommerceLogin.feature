Feature: NOP Commerce Login

@Sanity
Scenario: Successful login with valid credentials
	Given User launches chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com"
	And User enters email as "admin@yourstore.com" and Password as "admin"
	And User clicks on Login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User clicks on Log out link
	Then Page title should be "Your store. Login"
	And Close browser
	
@Regression
Scenario Outline: Login Verification Data Driven
	Given User launches chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com"
	And User enters email as "<email>" and Password as "<password>"
	And User clicks on Login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User clicks on Log out link
	Then Page title should be "Your store. Login"
	And Close browser
	
	Examples:
		| email | password |
		| admin@yourstore.com | admin |
		| admin@yourstore.com | admin123 |