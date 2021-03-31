package com.shp.automation.test.uservalidation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.login.LoginPage;
import com.shp.automation.pages.products.ProductsPage;
import com.shp.automation.utils.ExcelReader;

public class UserLoginTest extends ShpBaseTest {

	public static final Logger logger = LogManager.getLogger(UserLoginTest.class);

	HomePage homePage;
	LoginPage loginPage;
	ProductsPage productsPage;

	@Test
	public void naviagateToLoginTest() {
		homePage = new HomePage();
		loginPage = homePage.clickOnLogin();
		Assert.assertTrue(loginPage.isUsernameDisplayed(), "Login page is not displayed");
	}

//	@Test(dependsOnMethods = "navigateToLoginTest")
//	public void loginTest() {
//		productsPage = loginPage.login("testuser", "testuser");
//		Assert.assertTrue(productsPage.isWelcomeLinkPresent(), "Products page is not loaded");
//	}
	
	@Test(dependsOnMethods = "naviagateToLoginTest" , dataProvider = "userData")
	public void loginTest(String user, String pwd) {
		productsPage = loginPage.login(user, pwd);
		Assert.assertTrue(productsPage.isWelcomeLinkPresent(), "Login is not successful");
		productsPage.logout();
	}
	
	@DataProvider(name = "userData")
	public Object[][] getUserData() throws Exception{
		Object[][] loginData = ExcelReader.getTableArray("src/test/resources/testdata/logindata.xlsx", "users");
		return loginData;
	}
}
