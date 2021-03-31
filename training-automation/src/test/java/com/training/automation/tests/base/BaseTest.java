package com.training.automation.tests.base;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.training.automation.pages.base.BasePage;
import com.training.automation.utils.PropertyReader;

@Listeners(TrainListener.class)
public class BaseTest {
	
	public static WebDriver driver;
	
	public static final Logger logger = LogManager.getLogger(BaseTest.class);
	
	@BeforeSuite
	public void init() throws IOException {
		
		//get the browser from properties file
		String browser = PropertyReader.getMyProperty("browser");
		
		if(browser.equals("Firefox")) {
			logger.info("The browser is :"+browser);
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\tejas\\Desktop\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BasePage.driver=driver;
		String url = PropertyReader.getMyProperty("url");
		driver.get(url);
		
	}
	
	@AfterSuite
	public void cleanUp() {
		driver.close();
	}

}
