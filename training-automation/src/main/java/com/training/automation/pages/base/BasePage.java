package com.training.automation.pages.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.automation.pages.home.HomePage;
import com.training.automation.pages.login.LoginPage;
import com.training.automation.pages.products.ProductsPage;
import com.training.automation.pages.register.RegisterPage;

public class BasePage {
	
	public static final Logger logger = LogManager.getLogger(BasePage.class);
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Shopping Cart']")
	WebElement logo;
	
	@FindBy(xpath = "//a[text()='Home']")
	WebElement home;
	
	@FindBy(xpath = "//a[text()='Products']")
	WebElement products;
	
	@FindBy(partialLinkText = "Login")
	WebElement login;
	
	@FindBy(partialLinkText = "Register")
	WebElement register;
	
	
	public BasePage() {
		//super();
		PageFactory.initElements(driver, this);
		logger.info("Initialized the webelements");
		
	}
	public boolean isLogoPresent() {
		boolean present = logo.isDisplayed();
		return present;
	}

	public HomePage clickOnLogo() {
		logger.info("Clicking on logo");
		logo.click();
		return new HomePage();
	}
	
	public boolean isLoginDisplayed() {
		boolean present = login.isDisplayed();
		return present;
	}
	
	public LoginPage clickOnLogin() {
		logger.info("Clickingon login");
		login.click();
		return new LoginPage();
	}
	
	public boolean isProductLinkPresent() {
		boolean present = products.isDisplayed();
		return present;
	}
	
	public ProductsPage clickOnProduct() {
		logger.info("Clicking on products");
		products.click();
		return new ProductsPage();
	}
	
	public boolean isRegisterPresent() {
		boolean present = register.isDisplayed();
		return present;
	}
	public RegisterPage clickOnRegister() {
		logger.info("Clicking on register");
		register.click();
		return new RegisterPage();
	}
	
}
