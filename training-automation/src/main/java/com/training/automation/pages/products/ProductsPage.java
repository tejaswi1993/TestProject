package com.training.automation.pages.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.automation.pages.base.BasePage;
import com.training.automation.pages.login.LoginPage;

public class ProductsPage extends BasePage{

	@FindBy(xpath = "//h1[text()='All Products']")
	WebElement productsHeader;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement search;
	
	@FindBy(xpath = "//a[text()='View']")
	WebElement view;
	
	@FindBy(xpath = "//a[contains(text(),'Welcome')]")
	WebElement welcome;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath = "//div[contains(text(),'Showing')]")
	WebElement entries;
	
	public boolean isHeaderPresent() {
		boolean present = productsHeader.isDisplayed();
		return present;
	}
	
	public boolean isWelcomeDisplayed() {
		boolean present = welcome.isDisplayed();
		return present;
	}
	
	public boolean isLogoutDisplayed() {
		boolean present = logout.isDisplayed();
		return present;
	}
	public boolean isEntiresDisplayed() {
		boolean present = entries.isDisplayed();
		return present;
	}
	
	public ProductsPage searchProduct(String product) {
		logger.info("Search the product " +product);
		search.clear();
		search.sendKeys(product);
		return new ProductsPage();
	}
	public LoginPage clickOnLogout() {
		logout.click();
		return new LoginPage();
	}
	
	public boolean isViewButtonDisplayed() {
		boolean present = view.isDisplayed();
		return present;
	}
	
	public ProductDetailsPage clickOnView() {
		view.click();
		return new ProductDetailsPage();
	}
	

}
