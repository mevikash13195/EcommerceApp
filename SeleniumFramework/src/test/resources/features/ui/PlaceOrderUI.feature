Feature: Place order feature

@PlaceOrderTest @Regression
Scenario Outline:  User able to place order with mentioned product

	Given I launch the application in browser
	When I login with username <username> and password <credentials>
	Then I am able to login to site
	When I search for product "ADIDAS ORIGINAL" and add to cart
	Then I navigate to Cart page
	Then I validate selected product "ADIDAS ORIGINAL" is present in Cart
	And I opt for checkout
	When I select country "INDIA"
	Then I place the order
	And I receive order placement success message
	
Examples:
| username  			   | credentials |
| urmailvikas139@gmail.com | Test@123 	 |
	
	
	
	