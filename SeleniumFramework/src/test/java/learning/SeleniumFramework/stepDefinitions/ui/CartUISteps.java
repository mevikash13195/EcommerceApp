package learning.SeleniumFramework.stepDefinitions.ui;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learning.SeleniumFramework.pageObjects.CartPage;
import learning.SeleniumFramework.pageObjects.PageObjectManager;
import learning.SeleniumFramework.utils.TestContextSetup;

public class CartUISteps {

	public WebDriver driver;
	public CartPage cartPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	
	public CartUISteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		cartPage = testContextSetup.pageObjectManager.getcartPage();
	}

	
	@When("I validate selected product {string} is present in Cart")
	public void i_validate_selected_product_is_present_in_cart(String productName){
		Boolean validateProd = cartPage.productValidation(productName);
		Assert.assertTrue(validateProd);
		
	}
	
	@Then("I opt for checkout")
	public void i_opt_for_checkout() {
		
		cartPage.cartCheckout();
	}

	
}
