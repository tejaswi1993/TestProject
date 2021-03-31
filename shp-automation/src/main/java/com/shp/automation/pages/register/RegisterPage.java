package com.shp.automation.pages.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shp.automation.pages.base.BasePage;
import com.shp.automation.pages.home.HomePage;

public class RegisterPage extends BasePage {

	
	//TODO
	//Create Web Elements for Basic Info fields
	//Write isElementPresent for these five fields
	
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
	
	@FindBy(xpath = "//h1[text()='Register Customer']")
	WebElement registerCustomerText;
	
	@FindBy(id = "regtohome")
	WebElement homeInRegisterPage;
	
	public boolean isRegisterCustomerPresent() {
		boolean present = registerCustomerText.isDisplayed();
		return present;
		
	}
	
	public boolean isNameElementPresent() {
		boolean present = name.isDisplayed();
		return present;
		
	}
	public boolean isEmailTextPresent() {
		boolean present = email.isDisplayed();
		return present;
		
	}
	public boolean isPhoneTextPresent() {
		boolean present = phone.isDisplayed();
		return present;
		
	}
	public boolean isUsernameTextPresent() {
		boolean present = username.isDisplayed();
		return present;
		
	}
	
	public boolean isPasswordTextPresent() {
		boolean present = password.isDisplayed();
		return present;
		
	}
	
	public RegisterPage enterName(String nme) {
		logger.info("Enter the name : " +nme);
		name.sendKeys(nme);
		return new RegisterPage();
	}
	
	public RegisterPage enterEmail(String emailId) {
		logger.info("Enter the emailId : " +emailId);
		email.sendKeys(emailId);
		return new RegisterPage();
	
	}
	
	public RegisterPage enterPhone(String phn) {
		logger.info("Enter the phone : " +phn);
		phone.sendKeys(phn);
		return new RegisterPage();
	}
	
	public RegisterPage enterUsername(String user) {
		logger.info("Enter the username : " +user);
		username.sendKeys(user);
		return new RegisterPage();
	}
	
	public RegisterPage enterPassword(String pwd) {
		logger.info("Enter password : " +pwd);
		password.sendKeys(pwd);
		return new RegisterPage();
	}

	@Override
	public HomePage clickLocalHome() {
		// TODO Auto-generated method stub
		logger.info("Clicking on homeLink in Register Page");
		homeInRegisterPage.click();
		return new HomePage();
	}
}
