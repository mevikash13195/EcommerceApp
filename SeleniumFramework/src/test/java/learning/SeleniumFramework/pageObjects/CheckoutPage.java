package learning.SeleniumFramework.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutPage {

	public WebDriver driver;
	
	
	By dropDown = By.cssSelector("[placeholder='Select Country']");
	By countryDropdown = By.cssSelector(".ta-result");
	By countryIndia = By.xpath("(//button[contains(@class, 'ta-item')])[2]");
	By placeOrderBtn = By.cssSelector(".action__submit");
	
	
	public CheckoutPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void countrySelection(String countryName) throws InterruptedException{
		
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(dropDown), countryName).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(countryIndia).click();
	}
	
	public void placeOrder(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn));
		
		WebElement bookOrder = driver.findElement(placeOrderBtn);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookOrder);
	}
	
	
}
