package learning.SeleniumFramework.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public LoginPage loginPage;
	public PDPPage pdpPage;
	public CartPage cartPage;
	public CheckoutPage checkoutPage;
	public OrderConfirmationPage orderConfirmationPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
		
	}
	
	public PDPPage getPDPPage() {
		pdpPage = new PDPPage(driver);
		return pdpPage;
		
	}
	
	public CartPage getcartPage() {
		cartPage = new CartPage(driver);
		return cartPage;
		
	}
	
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
		
	}
	
	public OrderConfirmationPage getorderConfirmationPage() {
		orderConfirmationPage = new OrderConfirmationPage(driver);
		return orderConfirmationPage;
		
	}
	
	
}
