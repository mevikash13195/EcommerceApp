package learning.SeleniumFramework.stepDefinitions.ui;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learning.SeleniumFramework.pageObjects.LoginPage;
import learning.SeleniumFramework.pageObjects.PageObjectManager;
import learning.SeleniumFramework.utils.TestContextSetup;

public class LoginUISteps {

	public WebDriver driver;
	public LoginPage loginPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	
	public LoginUISteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		loginPage = testContextSetup.pageObjectManager.getLoginPage();
	}
	
	@Given("I launch the application in browser")
	public void i_launch_the_application_in_browser(){
		loginPage.launchApp();
		//Learning PR 
		
	}
	
	@When("^I login with username (.+) and password (.+)$")
	public void i_login_with_username_and_password(String username, String password){
		loginPage.userLogin(username, password);
		
	}
	
	@Then("I am able to login to site")
	public void i_am_able_to_login_to_site() {
		
		loginPage.successLogin();
	}

	@When("^I login with invalid username (.+) and password (.+)$")
	public void i_login_with_invalid_username_and_password(String username, String password){
		loginPage.userInvalidLogin(username, password);
		
	}
	
	@Then("I am able to see login error message")
	public void i_am_able_to_see_login_error_message() {
		
		loginPage.errorLoginMsg();
	}

	
	
}
