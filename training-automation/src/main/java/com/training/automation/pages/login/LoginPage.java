package com.training.automation.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.automation.pages.base.BasePage;
import com.training.automation.pages.products.ProductsPage;

public class LoginPage extends BasePage{

	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	
	public boolean isUsernameDisplayed() {
		boolean present = username.isDisplayed();
		return present;
	}
	
	public ProductsPage login(String user, String pwd) {
		logger.info("Enter the username and password details");
		username.sendKeys(user);
		password.sendKeys(pwd);
		submit.click();
		return new ProductsPage();
	}
	
}
