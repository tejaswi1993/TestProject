package com.training.automation.pages.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.automation.pages.base.BasePage;

public class RegisterPage extends BasePage{

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
	WebElement header;
	
	
	public boolean isHeaderPresent() {
		boolean present = header.isDisplayed();
		return present;
	}
	
	public boolean isNamePresent() {
		boolean present = name.isDisplayed();
		return present;
	}
	public boolean isEmailPresent() {
		boolean present = email.isDisplayed();
		return present;
	}
	public boolean isPhonerPresent() {
		boolean present = phone.isDisplayed();
		return present;
	}
	public boolean isUsernamePresent() {
		boolean present = username.isDisplayed();
		return present;
	}
	public boolean isPasswordPresent() {
		boolean present = password.isDisplayed();
		return present;
	}
	
	public RegisterPage enterName(String nam) {
		logger.info("Enter the name : " +nam);
		name.sendKeys(nam);
		return new RegisterPage();
	}
	public RegisterPage enterEmail(String emailId) {
		logger.info("Enter the name : " +emailId);
		email.sendKeys(emailId);
		return new RegisterPage();
	}
	public RegisterPage enterPhone(String phn) {
		logger.info("Enter the name : " +phn);
		phone.sendKeys(phn);
		return new RegisterPage();
	}
	public RegisterPage enterUsername(String usnName) {
		logger.info("Enter the name : " +usnName);
		username.sendKeys(usnName);
		return new RegisterPage();
	}
	public RegisterPage enterPassword(String pwd) {
		logger.info("Enter the name : " +pwd);
		password.sendKeys(pwd);
		return new RegisterPage();
	}
	
	
}
