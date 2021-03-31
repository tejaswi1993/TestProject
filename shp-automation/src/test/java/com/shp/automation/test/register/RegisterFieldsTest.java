package com.shp.automation.test.register;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.register.RegisterPage;

public class RegisterFieldsTest extends ShpBaseTest {

	// TODO
	// launching the application and navigate to Register page
	// Write a TestCase where we Assert these Basic Info fields

	HomePage homePage;
	RegisterPage registerPage;
	public static final Logger logger = LogManager.getLogger(RegisterFieldsTest.class);

	@Test
	public void navigateToRegisterPage() {
		homePage = new HomePage();
		logger.info("Navigating to Register Page");
		registerPage = homePage.clickOnRegister();
		Assert.assertTrue(registerPage.isRegisterCustomerPresent(), "Text is not visible");
		logger.info("The register page is launched");
	}

	@Test(dependsOnMethods = "navigateToRegisterPage")
	public void isNameFieldPresent() {
		registerPage = new RegisterPage();
		logger.info("Asserting the Name Field");
		registerPage.enterName("Tejas");
		Assert.assertTrue(registerPage.isNameElementPresent(), "Name field is not displayed");
		logger.info("Name field is displayed");

	}

	@Test(dependsOnMethods = "isNameFieldPresent")
	public void isEmailFieldPresent()  {
		logger.info("Asserting the Email field");
		registerPage.enterEmail("tejaswi@gmail.com");
		Assert.assertTrue(registerPage.isEmailTextPresent(), "Email field is not displayed");
		logger.info("EMail field is displayed");
		
	}

	@Test(dependsOnMethods = "isEmailFieldPresent")
	public void isPhoneFieldPresent() {
		logger.info("Asserting for phone field");
		registerPage.enterPhone("345-879-333");
		Assert.assertTrue(registerPage.isPhoneTextPresent(), "Phone Field is not displayed");
		logger.info("Phone field is displayed");

	}
	
	@Test(dependsOnMethods = "isPhoneFieldPresent")
	public void isUsernamePresent() {
		logger.info("Asserting for username field");
		registerPage.enterUsername("tejaswi");
		Assert.assertTrue(registerPage.isUsernameTextPresent(), "username Field is not displayed");
		logger.info("username field is displayed");

	}
	
	@Test(dependsOnMethods = "isUsernamePresent")
	public void isPasswordFieldPresent() throws InterruptedException {
		logger.info("Asserting for password field");
		//registerPage.enterPassword("tejasss");
		Thread.sleep(1000);
		Assert.assertTrue(registerPage.isPasswordTextPresent(), "Password Field is not displayed");
		logger.info("Password field is displayed");

	}
}
