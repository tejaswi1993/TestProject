package com.shp.automation.test.uservalidation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;

public class LoginNegativeTest extends ShpBaseTest{

	//TODO 
	//Launch test
	//Verify logo
	//verify loginLink
	//NavigateTo Login page
	//Enter Invalid credentials
	//verify invalid Text
	
	@FindBy(xpath = "//a[text()='Shopping Cart']")
	WebElement logo;
	
	@FindBy(linkText = "Login")
	WebElement loginLink;
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//form/div[1][text()='Invalid username and password!']")
	WebElement invalidText;
	
	@Test
	public void loginNegativeTest() throws InterruptedException {
		PageFactory.initElements(driver, this);
		
		logger.info("Launch shopping cart website");
		driver.get("http://mishoppingkart.com/ShoppingCart8QA/");
		logger.info("Verify logo");
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		logger.info("verify loginLink");
		Assert.assertTrue(loginLink.isDisplayed(), "Login is not displayed");
		logger.info("NavigateTo Login page");
		loginLink.click();
		Thread.sleep(1000);
		logger.info("Enter Invalid credentials");
		username.sendKeys("tejas");
		password.sendKeys("tejas");
		submit.click();
		Thread.sleep(2000);
		logger.info("verify invalid Text");
		Assert.assertTrue(invalidText.isDisplayed(), "Text is not displayed");
		
	}
	
}
