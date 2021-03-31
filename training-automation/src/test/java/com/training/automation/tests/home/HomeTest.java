package com.training.automation.tests.home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.automation.pages.home.HomePage;
import com.training.automation.tests.base.BaseTest;

public class HomeTest extends BaseTest{

	public static final Logger logger = LogManager.getLogger(HomeTest.class);
	
	HomePage homePage;
	
	
	@Test
	public void lauchTest() {
		homePage = new HomePage();
		String expectedTitle = "Shopping Cart";
		String actualTilte = driver.getTitle();
		Assert.assertTrue(expectedTitle.equals(actualTilte), "Title is not matched");
	}
	
	@Test(dependsOnMethods = "lauchTest")
	public void logoTest() {
		
		Assert.assertTrue(homePage.isLogoPresent(), "Logo is not displayed");
	}
	
	@Test(dependsOnMethods = "logoTest")
	public void logoNavigationTest() {
		homePage.clickOnLogo();
		Assert.assertTrue(homePage.isCarouselPresent(), "Carusel is not displayed");
	}
}
