package com.training.automation.tests.register;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.automation.pages.home.HomePage;
import com.training.automation.pages.register.RegisterPage;
import com.training.automation.tests.base.BaseTest;

public class RegisterTest extends BaseTest{

	
	HomePage homePage;
	RegisterPage registerPage;
	
	public static final Logger logger = LogManager.getLogger(RegisterTest.class);
	
	@Test
	public void navigateToRegisterPage() {
		homePage = new HomePage();
		logger.info("Clicking on Register link");
		registerPage=homePage.clickOnRegister();
		Assert.assertTrue(registerPage.isHeaderPresent(), "Header is not present");
		logger.info("Register page is loaded");
	}
	
	@Test(dependsOnMethods = "navigateToRegisterPage")
	public void isNameFieldPresent() {
		registerPage = new RegisterPage();
		logger.info("Asserting the name field");
		Assert.assertTrue(registerPage.isNamePresent(), "name field is not displayed");
		logger.info("name is present");
		
	}
	
	@Test(dependsOnMethods = "isNameFieldPresent")
	public void isEmailFieldPresent() {
		registerPage = new RegisterPage();
		logger.info("Asserting the email field");
		Assert.assertTrue(registerPage.isEmailPresent(), "email field is not displayed");
		logger.info("email is present");
		
	}
	
	@Test(dependsOnMethods = "isEmailFieldPresent")
	public void isPhoneFieldPresent() {
		registerPage = new RegisterPage();
		logger.info("Asserting the phone field");
		Assert.assertTrue(registerPage.isPhonerPresent(), "phone field is not displayed");
		logger.info("phone is present");
		
	}
	
	@Test(dependsOnMethods = "isPhoneFieldPresent")
	public void isUsernameFieldPresent() {
		registerPage = new RegisterPage();
		logger.info("Asserting the username field");
		Assert.assertTrue(registerPage.isUsernamePresent(), "username field is not displayed");
		logger.info("username is present");
		
	}
	
	@Test(dependsOnMethods = "isUsernameFieldPresent")
	public void isPasswordFieldPresent() {
		registerPage = new RegisterPage();
		logger.info("Asserting the password field");
		Assert.assertTrue(registerPage.isPasswordPresent(), "password field is not displayed");
		logger.info("password is present");
		
	}
}

