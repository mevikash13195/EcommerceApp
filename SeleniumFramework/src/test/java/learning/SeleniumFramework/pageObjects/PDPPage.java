package learning.SeleniumFramework.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PDPPage {

	public WebDriver driver;
	WebDriverWait wait;
	
	By itemList = By.cssSelector(".mb-3");
	By requiredItem = By.cssSelector("b");
	By addToCartBtn = By.cssSelector(".card-body button:last-of-type");
	By toastElement = By.cssSelector("#toast-container");
	By blinkerAnnimation = By.cssSelector(".ng-animating");
	By cartBtn = By.cssSelector("[routerlink*='cart']");
	
	public PDPPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void searchAndAddProduct(String productName){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(itemList))	;
		
		List<WebElement> products = driver.findElements(itemList);
		WebElement item = products.stream().filter(product -> product.findElement(requiredItem)
				.getText().equals(productName)).findFirst().orElse(null);
		
		item.findElement(addToCartBtn).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastElement))	;
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(blinkerAnnimation)));
	
	}
	
	public void moveToCart() {
		
		driver.findElement(cartBtn).click();
	}
	
	
	
}
