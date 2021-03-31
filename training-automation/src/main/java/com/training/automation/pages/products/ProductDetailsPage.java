package com.training.automation.pages.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.automation.pages.base.BasePage;

public class ProductDetailsPage extends BasePage{

	@FindBy(xpath = "//h1[text()='Product Details']")
	WebElement header;
	
	public boolean isHeaderDisplayed() {
		boolean present = header.isDisplayed();
		return present;
	}
}
