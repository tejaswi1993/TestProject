package com.shp.automation.base.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.shp.automation.pages.base.BasePage;
import com.shp.automation.utils.ExcelReader;
import com.shp.automation.utils.PropertyReader;

@Listeners(ShpListener.class)
public class ShpBaseTest {

	public static WebDriver driver;
	
	public static final Logger logger = LogManager.getLogger(ShpBaseTest.class);
	
	//public String browser = "chrome";
	
	@BeforeSuite
	public void init() throws IOException {
		
		//Get the browser name from the Properties file
		String browser = PropertyReader.getMyProperty("browser");
		
		logger.info("browser name is "+browser);
		
		if(browser.equals("firefox")) {
			logger.info("Launching Firefox browser");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\tejas\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		////System.out.println("launching the driver in BeforeSuite");
	//	if(browser.equals("chrome")) {
	//	logger.info("launching the driver in BeforeSuite");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejas\\Desktop\\chromedriver.exe");
//		driver = new ChromeDriver();
	//	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BasePage.driver = driver; // it will send this drover to this driver
		String url = PropertyReader.getMyProperty("url");
		driver.get(url);
		
		
		
	}
	
	@DataProvider(name = "products")
	public Object[][] getProductData() throws Exception{
		Object[][] prodData = ExcelReader.getTableArray("src/test/resources/testdata/productdata.xlsx", "product");
		return prodData;
	}
	
	@AfterSuite
	public void cleanUp() {
		driver.quit();
	}
}
