package learning.SeleniumFramework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	public String apiurl;
	
	public String getBaseURI() throws IOException{
		
		FileInputStream fileinput = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		
		Properties prop = new Properties();
		prop.load(fileinput);
		
		String apiurl = prop.getProperty("baseURI");
		return apiurl;
	
	}
	
    public WebDriver WebDriverManager() throws IOException{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("ProdUrl");
		String browser_property = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
	
		String browserName = browser_maven != null ? browser_maven : browser_property;
		
		
		if (driver ==null ) {
			
			if(browserName.equalsIgnoreCase("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

           driver.get(url);
		}
		return driver;
	}
	
    public Map<String, String> getJsonData(String filePath) throws IOException{
    	
    	ObjectMapper mapper = new ObjectMapper();
    	return mapper.readValue(new File(filePath), Map.class);
    }
    
    
}
