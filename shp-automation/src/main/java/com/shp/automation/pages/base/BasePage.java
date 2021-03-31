package com.shp.automation.pages.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.login.LoginPage;
import com.shp.automation.pages.products.ProductsPage;
import com.shp.automation.pages.register.RegisterPage;

//import com.shp.automation.base.test.ShpBaseTest;

public abstract class BasePage {
	public static final Logger logger = LogManager.getLogger(BasePage.class);

	
	// Will have all reusable methods
	
	public static WebDriver driver;

	
	@FindBy(xpath = "//a[contains(text(),'Shopping Cart')]")
	WebElement logo;
	
	@FindBy(linkText = "Login")
	WebElement loginLink;
	
	@FindBy(xpath = "//a[contains(text(),'Products')]")
	WebElement products;
	
	@FindBy(partialLinkText = "Register")
	WebElement register;
	
	@FindBy(partialLinkText = "Logout")
	WebElement logout;

	@FindBy(linkText = "Home")
	WebElement homeInHeader;

	
	//created constructor from superclass
	public BasePage() {
		//super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		logger.info("Initialized the WebElements");

	}
	public boolean isLogoPresent() {
		boolean present = logo.isDisplayed();
		return present;
	}
	
	public HomePage clickOnLogo() {
		logger.info("Clicking on logo");
		logo.click();
		HomePage homePage = new HomePage();
		return homePage;

	}

	public boolean isLoginlnkPresent() {
		boolean isPresent = loginLink.isDisplayed();
		return isPresent;
	}

	public LoginPage clickOnLogin() {
		logger.info("Clicking on login link");
		loginLink.click();
		LoginPage loginPage = new LoginPage();
		return loginPage;

	}

	public boolean isProductslnkPresent() {
		boolean isPresent = products.isDisplayed();
		return isPresent;
	}

	public ProductsPage clickOnProducts() {
		logger.info("Clicking on products link");
		products.click();
		return new ProductsPage();

	}

	public boolean isRegisterlnkPresent() {
		boolean isPresent = register.isDisplayed();
		return isPresent;
	}

	public RegisterPage clickOnRegister() {
		logger.info("Clicking on register link");
		register.click();
		return new RegisterPage();

	}
	public boolean isLogoutPresent() {
		boolean present = logout.isDisplayed();
		return present;
	}

	public LoginPage logout() {
		logger.info("clicking on logout link");
		logout.click();
		return new LoginPage();
	}
	public boolean isHomeInHeaderPresent() {
		boolean present = homeInHeader.isDisplayed();
		return present;
	}

	public HomePage clickOnHeaderHome() {
		logger.info("clicling on home link from header");
		homeInHeader.click();
		return new HomePage();
	}
	public abstract HomePage clickLocalHome();
	

	
}
