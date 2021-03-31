package com.shp.automation.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.products.ProductsPage;

public class ProductTest extends ShpBaseTest {

	HomePage homepage;
	ProductsPage productsPage;
	
	//TestCase 1 - launch the application and write loggers everywhere and very title
	//TestCase 2 - Assert the Logo test
	//TestCase 3 - Assert the All Product Text
	//TestCase 3 - assert the showing 1 to 5 of 120entries
	
	@Test
	public void productTest() {
		
		homepage = new HomePage();
		Assert.assertTrue(homepage.isCarouselPresent(), "Home page is not loaded");
		Assert.assertTrue(homepage.isProductslnkPresent(), "Products link is not loaded");
		productsPage = homepage.clickOnProducts();
		Assert.assertTrue(productsPage.isHeaderPresent(), "Products page not loaded");
		Assert.assertTrue(productsPage.isEntriesPresent(), "Entries are not loaded");

	}
	
}
