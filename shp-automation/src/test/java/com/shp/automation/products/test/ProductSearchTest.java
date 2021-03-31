package com.shp.automation.products.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shp.automation.base.test.ShpBaseTest;

public class ProductSearchTest extends ShpBaseTest{

	//TestCase 1 - launch in the application and write loggers for every testcases
	//TestCase 2 -  search for any product and Assert the View 
	//TestCase 3 - assert the showing 1 to 5 of 120entries(for only particular search product)
	@Test
	public void productSearchTest() throws InterruptedException {
		driver.get("http://mishoppingkart.com/ShoppingCart8QA/");
		WebElement products = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		products.click();
		logger.info("sending key 'spl' in search box");
		WebElement searchProduct = driver.findElement(By.xpath("//input[@type='search']"));
		Thread.sleep(1000);
		searchProduct.sendKeys("spl");
		Thread.sleep(1000);
        WebElement searchedProductIs = driver.findElement(By.xpath("//tr/td[2]"));
        System.out.println("The searched product is :"+searchedProductIs.getText());
		WebElement viewBox = driver.findElement(By.xpath("//a[text()='View']"));
		Thread.sleep(1000);
		logger.info("Asserting the view box");
		Assert.assertTrue(viewBox.isDisplayed(), "View box is not displayed");
		WebElement searchResultEntries = driver.findElement(By.xpath("//div[contains(text(),'filtered from 120 total entries')]"));
		logger.info("Asserting the search result entries");
		Assert.assertTrue(searchResultEntries.isDisplayed(), "Search results entries are not dispalyed");
		
		
	}
}
