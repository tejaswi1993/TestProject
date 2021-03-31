package com.shp.automation.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shp.automation.pages.base.BasePage;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.products.ProductsPage;

public class LoginPage extends BasePage{
	
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(id = "logintohome")
	WebElement homeInLoginPage;
	
	
	public boolean isUsernameDisplayed() {
		boolean present = username.isDisplayed();
		return present;
		
	}
	
	public ProductsPage login(String user, String pwd) {
		logger.info("Entering username " +user);
		logger.info("Entering password " +pwd);
		username.sendKeys(user);
		password.sendKeys(pwd);
		submitButton.click();
		return new ProductsPage();
		

	}

	@Override
	public HomePage clickLocalHome() {
		logger.info("Clicking HomeLink in Login Page");
		homeInLoginPage.click();
		return new HomePage();
	}

}
