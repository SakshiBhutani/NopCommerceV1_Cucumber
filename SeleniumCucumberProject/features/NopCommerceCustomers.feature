Feature: Customers

Background: Combining common steps
	Given User launches chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com"
	And User enters email as "admin@yourstore.com" and Password as "admin"
	And User clicks on Login
	Then User can view Dashboard
	When User clicks Customers Menu
	And User clicks Customers menu item

@Sanity
Scenario: Add a new Customer
	
	And User clicks Add new button
	Then User can view Add a new customer page
	When User enters new customer details
	And User clicks Save buttom
	Then User can view confirmation message "The new customer has been added successfully."
	And Close browser
	
@Regression	
Scenario: Search a Customer using EmailID
	
	And User enters emailId to search
	And User clicks on search button
	Then User should be able to find EmailId in search results table
	And Close browser
	
@Regression
Scenario: Search a Customer using Name
	
	And User enters firstname to search
	And User enters lastname to search
	And User clicks on search button
	Then User should be able to find name in search results table
	And Close browser
	