package com.shp.automation.pages.home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.base.BasePage;
import com.shp.automation.pages.login.LoginPage;
import com.shp.automation.pages.products.ProductsPage;
import com.shp.automation.pages.register.RegisterPage;

public class HomePage extends BasePage {
	public static final Logger logger = LogManager.getLogger(HomePage.class);

	

	@FindBy(xpath = "//div[@class='carousel-caption']")
	WebElement carousel;

	@FindBy(id = "hoometohome")
	WebElement homeInHomepage;


	

	public boolean isCarouselPresent() {
		boolean present = carousel.isDisplayed();
		return present;
	}
	
	@Override
	public HomePage clickLocalHome() {
		logger.info("Clicking homelink in Home Page");
		homeInHomepage.click();
		return new HomePage();
	}
	
	
	
}
