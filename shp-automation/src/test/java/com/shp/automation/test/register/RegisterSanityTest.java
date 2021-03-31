package com.shp.automation.test.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;

public class RegisterSanityTest extends ShpBaseTest{

	
	//TODO
	//Launch test
	//verify register link
	//NavigateTo register page
	//Verify the fields
	
	@FindBy(linkText = "Register")
    WebElement registerLink;
	
	@FindBy(id = "name")
	WebElement name;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "phone")
	WebElement phone;
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "billingStreet")
	WebElement billingStreet;
	
	@FindBy(id = "billingApartmentNumber")
	WebElement aptNumber;
	
	@FindBy(id = "billingCity")
	WebElement billingCity;
	
	@FindBy(id = "billingState")
	WebElement billingState;
	
	@FindBy(id = "billingCountry")
	WebElement billingCountry;
	
	@FindBy(id = "billingZip")
	WebElement zipcode;
	
	@FindBy(id = "shippingStreet")
	WebElement shippingStreet;
	
	@FindBy(id = "shippingApartmentNumber")
	WebElement apartmentNum;
	
	@FindBy(id = "shippingCity")
	WebElement shippingCity;
	
	@FindBy(id = "shippingState")
	WebElement shippingState;
	
	@FindBy(id = "shippingCountry")
	WebElement shippingCountry;
	
	@FindBy(id = "shippingZip")
	WebElement shippingZip;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//h1[text()='Registered Successfully. Please Login to start Shopping !']")
	WebElement validateText;
	
	@Test
	public void registerSanityTest() throws InterruptedException {
		
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
		username.sendKeys("testuser");
		//password.sendKeys("tejaswi");
		billingStreet.sendKeys("vehicle drive");
		aptNumber.sendKeys("222");
		billingCity.sendKeys("sacramento");
		billingState.sendKeys("california");
		billingCountry.sendKeys("usa");
		zipcode.sendKeys("95644");
		shippingStreet.sendKeys("vehicle drive");
		apartmentNum.sendKeys("222");
		shippingCity.sendKeys("sacramento");
		shippingState.sendKeys("california");
		shippingCountry.sendKeys("usa");
		shippingZip.sendKeys("95644");
		submitButton.click();
		Thread.sleep(1000);
		password.sendKeys("testuser");
		Thread.sleep(1000);
		submitButton.click();
		logger.info("verify register is successfull or not");
		Assert.assertTrue(validateText.isDisplayed(), "The registration is not success");
		System.out.println(validateText.getText());
	
	}
	
	
}
