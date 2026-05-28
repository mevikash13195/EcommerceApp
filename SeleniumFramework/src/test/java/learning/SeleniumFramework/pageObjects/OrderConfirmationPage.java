package learning.SeleniumFramework.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OrderConfirmationPage {

	public WebDriver driver;
	String msgText = "Thankyou for the order.";
	
	By orderMsg = By.cssSelector(".hero-primary");
	
	
	public OrderConfirmationPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	
	public void orderConfirmationMsg(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(orderMsg));
		
		String orderConfirmMessage = driver.findElement(orderMsg).getText();
		assertTrue(orderConfirmMessage.equalsIgnoreCase(msgText));
	}
	
	
}
