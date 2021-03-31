package com.training.automation.tests.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.automation.pages.home.HomePage;
import com.training.automation.pages.login.LoginPage;
import com.training.automation.pages.products.ProductsPage;
import com.training.automation.tests.base.BaseTest;
import com.training.automation.utils.ExcelReader;

public class LoginTest extends BaseTest {

	public static final Logger logger = LogManager.getLogger(LoginTest.class);

	HomePage homePage;
	LoginPage loginPage;
	ProductsPage productsPage;

	@Test
	public void navigateToLoginPage() {
		homePage = new HomePage();
		loginPage = homePage.clickOnLogin();
		Assert.assertTrue(loginPage.isUsernameDisplayed(), "Login link is not working");
	}

	@Test(dependsOnMethods = "navigateToLoginPage",dataProvider = "userData")
	public void enterLoginDetails(String user, String pwd) {
		loginPage = new LoginPage();
		productsPage = loginPage.login(user, pwd);
		Assert.assertTrue(productsPage.isHeaderPresent(), "login is not successful");
		productsPage.clickOnLogout();
	}
	
	@DataProvider(name = "userData")
	public Object[][] getUserData() throws Exception{
		Object[][] userData = ExcelReader.getTableArray("src/test/resources/testdata/logindata.xlsx", "users");
		return userData;
	}
}
