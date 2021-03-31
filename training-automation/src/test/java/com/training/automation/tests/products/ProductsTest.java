package com.training.automation.tests.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.automation.pages.home.HomePage;
import com.training.automation.pages.products.ProductsPage;

public class ProductsTest {

	HomePage homePage;
	ProductsPage productsPage;
	
	public static final Logger logger = LogManager.getLogger(ProductsTest.class);
	
	@Test
	public void navigateToProductsPage() {
		homePage = new HomePage();
		Assert.assertTrue(homePage.isCarouselPresent(), "Home page is not laoded");
		Assert.assertTrue(homePage.isProductLinkPresent(), "products link is not present");
		productsPage = homePage.clickOnProduct();
		Assert.assertTrue(productsPage.isHeaderPresent(), "Header is not displayed");
		Assert.assertTrue(productsPage.isEntiresDisplayed(), "Entries not displayed");
	}
}
