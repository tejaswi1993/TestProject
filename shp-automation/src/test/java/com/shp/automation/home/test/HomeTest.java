package com.shp.automation.home.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.home.HomePage;

public class HomeTest extends ShpBaseTest {

	public static final Logger logger = LogManager.getLogger(HomeTest.class);

	HomePage homepage;

	// Have the tests for the home page

	@Test
	// Step 1: luach our application
	public void launchTest() {

		homepage = new HomePage();
		String expectedTitle = "Shopping Cart Application";
		String actualTitle = driver.getTitle();
		// System.out.println("Asserting the title ");
		Assert.assertTrue(actualTitle.equals(expectedTitle), "Title is not matched");
		logger.info("Asserting the title");

	}

	@Test(dependsOnMethods = "launchTest")
	public void logoTest() {
		// logger.info("Executing the logoTest");
		// WebElement logo = driver.findElement(By.xpath("//a[contains(text(),'Shopping
		// Cart')]"));
		// logo.isDisplayed();
		// logger.info("Asserting the logo");
		Assert.assertTrue(homepage.isLogoPresent(), "logo is not dispalayed");

	}

	@Test(dependsOnMethods = "launchTest")
	public void logoNavigationTest() {
		// logger.info("Executing Logo Test");
		// WebElement logo = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		// logger.info("Asserting Logo");

		homepage = homepage.clickOnLogo();
		Assert.assertTrue(homepage.isCarouselPresent(), "Carousel is not present");
	}

}
