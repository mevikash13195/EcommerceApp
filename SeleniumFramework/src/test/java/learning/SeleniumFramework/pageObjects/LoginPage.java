package learning.SeleniumFramework.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

	public WebDriver driver;
	String webTitle = "Let's Shop";
	String failedLoginMsg = "Incorrect email or password.";
	
	By inputEmail = By.id("userEmail");
	By inputPassword = By.id("userPassword");
	By loginBtn = By.xpath("//*[@id=\"login\"]");
	By loginError = By.xpath("//div[contains(@class,'toast-message')]");
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void launchApp(){
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		assertTrue(pageTitle.equalsIgnoreCase(webTitle));
	}
	
	public void userInvalidLogin(String userEmail, String userPassword){
		driver.findElement(inputEmail).sendKeys(userEmail);
		driver.findElement(inputPassword).sendKeys(userPassword);
		driver.findElement(loginBtn).click();
		
	}
	
	public void errorLoginMsg(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(loginError));
		String errorLoginMsg = errorMsg.getText();
		
		assertTrue(errorLoginMsg.equalsIgnoreCase(failedLoginMsg));
		
	}
	
	
	public void userLogin(String userEmail, String userPassword){
		driver.findElement(inputEmail).sendKeys(userEmail);
		driver.findElement(inputPassword).sendKeys(userPassword);
		driver.findElement(loginBtn).click();
		
	}
	
	public String successLogin() {
		
		return driver.getTitle();
	}
	
	
	
	
	
}
