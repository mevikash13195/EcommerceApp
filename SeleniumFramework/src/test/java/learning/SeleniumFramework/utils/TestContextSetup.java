package learning.SeleniumFramework.utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import learning.SeleniumFramework.pageObjects.PageObjectManager;

public class TestContextSetup {

	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException{
		
		testBase = new TestBase();
		WebDriver driver = testBase.WebDriverManager();
		
		if (driver == null) {
				throw new IllegalStateException("Driver is null in TestContextSetup constructor");
	}
		
		pageObjectManager = new PageObjectManager(driver);
		genericUtils = new GenericUtils(driver);
		
	}
}
