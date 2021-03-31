package com.shp.automation.pages.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shp.automation.pages.base.BasePage;
import com.shp.automation.pages.home.HomePage;

public class ProductDetailsPage extends BasePage{

	@FindBy(xpath = "//h1[text()='Product Details']")
	WebElement productDetailsText;
	
	
	public boolean isProductDetailsTextPresent() {
		boolean present = productDetailsText.isDisplayed();
		return present;
	}



	@Override
	public HomePage clickLocalHome() {
		// TODO Auto-generated method stub
		return clickOnHeaderHome();
	}


	
}
