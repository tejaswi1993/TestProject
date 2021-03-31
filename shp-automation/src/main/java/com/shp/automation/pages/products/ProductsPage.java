package com.shp.automation.pages.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shp.automation.pages.base.BasePage;
import com.shp.automation.pages.home.HomePage;
import com.shp.automation.pages.login.LoginPage;

public class ProductsPage extends BasePage {

	@FindBy(xpath = "//h1[text()='All Products']")
	WebElement productsHeader;

	@FindBy(partialLinkText = "Welcome")
	WebElement welcome;

	@FindBy(xpath = "//div[contains(text(),'Showing')]")
	WebElement entries;

	@FindBy(xpath = "//input[@type='search']")
	WebElement search;

	@FindBy(xpath = "//a[contains(text(),'View')]")
	WebElement viewButton;

	@FindBy(linkText = "Logout")
	WebElement logout;
	
	@FindBy(id = "prodtohome")
	WebElement homeInProductsPage;
	
	public boolean isHeaderPresent() {
		boolean present = productsHeader.isDisplayed();
		return present;
	}

	public boolean isEntriesPresent() {
		boolean present = entries.isDisplayed();
		return present;
	}

	public boolean isWelcomeLinkPresent() {
		boolean present = welcome.isDisplayed();
		return present;
	}

	public boolean isLogoutPresent() {
		boolean present = logout.isDisplayed();
		return present;
	}
	public ProductsPage searchProducts(String product) {
		logger.info("Searching for the product " + product);
		search.clear();
		search.sendKeys(product);
		return new ProductsPage();
	}
	
	public LoginPage logout (){
		logout.click();
		return new LoginPage();
	}
	

	public boolean isViewButtonPresent() {
		boolean present = viewButton.isDisplayed();
		return present;
	}

	public ProductDetailsPage navigateToProductDetailsPage() {
		viewButton.click();
		return new ProductDetailsPage();
	}

	@Override
	public HomePage clickLocalHome() {
		logger.info("clicking on homeLink in Products Page");
		homeInProductsPage.click();
		return new HomePage();
	}

}
