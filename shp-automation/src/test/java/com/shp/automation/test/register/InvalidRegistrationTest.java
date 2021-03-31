package com.shp.automation.test.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;

public class InvalidRegistrationTest extends ShpBaseTest{

	//LaunchTest
	//Enter invalid details
	//verify the invalid password text
	
	
	@FindBy(linkText = "Register")
    WebElement registerLink;
	
	@FindBy(id = "name")
	WebElement name;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "phone")
	WebElement phone;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(id = "username.errors")
	WebElement errorText;
	
	@Test
	public void invalidRegistrationTest() {
		PageFactory.initElements(driver, this);
		logger.info("Launch Test application");
		driver.get("http://mishoppingkart.com/ShoppingCart8QA/");
		logger.info("Verifying register link");
		Assert.assertTrue(registerLink.isDisplayed(), "Register link is not displayed");
		logger.info("Navigate to the register page");
		registerLink.click();
		logger.info("Verify the fields");
		name.sendKeys("Tejaswi A");
		email.sendKeys("tejaswia@gmail.com");
		phone.sendKeys("9012133490");
		submitButton.click();
		logger.info("verify register is successfull or not");
		Assert.assertTrue(errorText.isDisplayed(), "The error text is not displayed");
		System.out.println("The error text is :"+errorText.getText());
		
	}
}
