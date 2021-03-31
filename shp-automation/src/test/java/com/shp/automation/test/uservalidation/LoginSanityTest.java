package com.shp.automation.test.uservalidation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.login.LoginPage;

public class LoginSanityTest extends ShpBaseTest{

	HomePage homepage;
	LoginPage loginpage; // because line 38 return LoginPage
	
	@FindBy(partialLinkText = "Welcome")
	WebElement welcomeText;
	
	@Test
	public void launchTest() {
		
		homepage = new HomePage();
		Assert.assertTrue(homepage.isLogoPresent(), "Logo is not displayed");
	}
	
	@Test(dependsOnMethods = "launchTest")
	public void loginLinkTest() {
		//logger.info("Asserting the loginLink");
		Assert.assertTrue(homepage.isLoginlnkPresent(), "Login link is not displayed");
	}
	
	//Navigate to login
	
	@Test(dependsOnMethods = "loginLinkTest")
	public void navigateToLoginTest() {
		logger.info("Navigate to login Page");
		loginpage = homepage.clickOnLogin();
		//loginLink.click();
		logger.info("Asserting the username");
		Assert.assertTrue(loginpage.isUsernameDisplayed(), "Username is not displayed");
	}
//	
//	@Test(dependsOnMethods = "navigateToLoginTest")
//	public void fieldVerificationTest() {
//		logger.info("Asserting the Username");
//		Assert.assertTrue(username.isDisplayed(), "Username is not displayed");
//		logger.info("Asserting the Password");
//		Assert.assertTrue(password.isDisplayed(), "password is not displayed");
//	}
//	
//	@Test(dependsOnMethods = "fieldVerificationTest")
//	public void loginTest() {
//		logger.info("Verifying the Username");
//		username.sendKeys("testuser");
//		logger.info("Verifying the Password");
//		password.sendKeys("testuser");
//		submitButton.click();
//		logger.info("Asserting the Credentials");
//		Assert.assertTrue(welcomeText.isDisplayed(), "Text is not displayed");
//		
//	}
}
