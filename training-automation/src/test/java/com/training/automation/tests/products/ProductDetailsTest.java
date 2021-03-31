package com.training.automation.tests.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.automation.pages.home.HomePage;
import com.training.automation.pages.products.ProductDetailsPage;
import com.training.automation.pages.products.ProductsPage;
import com.training.automation.tests.base.BaseTest;
import com.training.automation.utils.ExcelReader;

public class ProductDetailsTest extends BaseTest{

	HomePage homePage;
	ProductsPage productsPage;
	ProductDetailsPage productDetailsPage;
	
	public static final Logger logger = LogManager.getLogger(ProductDetailsTest.class);
	
	
	
	@Test
	public void navigateToProductsPage() {
		homePage = new HomePage();
		logger.info("CLick on products link");
		productsPage = homePage.clickOnProduct();
		Assert.assertTrue(productsPage.isHeaderPresent(), "Header is not displayed");
		logger.info("Header is displayed");
	}
	@Test(dependsOnMethods = "navigateToProductsPage", dataProvider = "products")
	public void searchProduct(String product) {
		productsPage = new ProductsPage();
		logger.info("Searching for the product 'shruti'");
		productsPage.searchProduct(product);
		Assert.assertTrue(productsPage.isViewButtonDisplayed(), "View is not displayed");
		logger.info("view button is present");
	}
	
	@DataProvider(name = "products")
	public Object[][] getProductsData() throws Exception{
		Object[][] data = ExcelReader.getTableArray("src/test/resources/testdata/productdata.xlsx", "product");
		return data;
	}
}
