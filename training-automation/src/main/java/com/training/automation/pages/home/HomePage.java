package com.training.automation.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.automation.pages.base.BasePage;

public class HomePage extends BasePage{

	@FindBy(xpath = "//div[@class='carousel-caption']")
	WebElement carousel;
	
	
	public boolean isCarouselPresent() {
		boolean present = carousel.isDisplayed();
		return present;
	}
	
	
}
