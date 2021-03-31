package com.shp.automation.products.test;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.products.ProductDetailsPage;
import com.shp.automation.pages.products.ProductsPage;
import com.shp.automation.utils.DBReader;
import com.shp.automation.utils.ExcelReader;

public class ProductDetailsTest extends ShpBaseTest{

	HomePage homePage;
	ProductsPage productsPage;
	ProductDetailsPage productDetailsPage;
	public static final Logger logger = LogManager.getLogger(ProductDetailsTest.class);

	
	@Test
	public void naviagateToProductTest() {
		homePage = new HomePage();
		logger.info("Navigating to Products page");
		productsPage = homePage.clickOnProducts();
		Assert.assertTrue(productsPage.isViewButtonPresent(), "Products page is not displayed");
		logger.info("view button is displayed");
	}
	
	@Test(dependsOnMethods = "naviagateToProductTest")
	public void searchProductTest() throws ClassNotFoundException, SQLException {
		logger.info("Search for product 'Shruti'");
		String product = DBReader.getFirstProduct();
		productsPage.searchProducts(product);
		Assert.assertTrue(productsPage.isViewButtonPresent(), "View Button is not present");
		logger.info("search product Shruti is displayed");
	}
	
	@Test(dependsOnMethods = "naviagateToProductTest", dataProvider = "products")
	public void searchProductDPTest(String productName) throws ClassNotFoundException, SQLException {
		logger.info("Search for product 'Shruti'");
	//	String product = DBReader.getFirstProduct();
		
		productsPage.searchProducts(productName);
		Assert.assertTrue(productsPage.isViewButtonPresent(), "View Button is not present");
		logger.info("search product Shruti is displayed");
	}
	
	@DataProvider(name = "products")
	public Object[][] getProductData() throws Exception{
		Object[][] prodData = ExcelReader.getTableArray("src/test/resources/testdata/productdata.xlsx", "product");
		return prodData;
	}
//	@Test(dependsOnMethods = "searchProductTest")
//	public void productDetailsPageNavigationTest() {
//		logger.info("Navigate to the product details page");
//		productDetailsPage = productsPage.navigateToProductDetailsPage();
//		Assert.assertTrue(productDetailsPage.isProductDetailsTextPresent(), "Product details text is not displayed");
//		logger.info("Product Details text is visible");
//	}
	
	
	
}
