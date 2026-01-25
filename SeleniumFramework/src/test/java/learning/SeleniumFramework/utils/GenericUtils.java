package learning.SeleniumFramework.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {

	public  WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void ExpWait(By locatorDetail) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorDetail));
	
	}
	
}
