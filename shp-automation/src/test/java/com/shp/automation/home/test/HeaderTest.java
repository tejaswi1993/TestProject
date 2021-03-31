package com.shp.automation.home.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.shp.automation.base.test.ShpBaseTest;

public class HeaderTest extends ShpBaseTest{

	//launch the application and also add logger messages everywhere- one testcase
	//Next Testcase- Test2 - Assert all the links in the header
	//TestCase
	
	public static final Logger logger = LogManager.getLogger((HeaderTest.class));
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void headerTest() {
		driver.get("http://mishoppingkart.com/ShoppingCart8QA/");
		logger.info("Asserting the Shopping Cart link");
		WebElement header1 = driver.findElement(By.xpath("//a[text()='Shopping Cart']"));
		Assert.assertTrue(header1.isDisplayed(), "Header1 is not dispalyed");
		
		WebElement header2 = driver.findElement(By.xpath("//a[text()='Home']"));
		logger.info("Asserting the Home Header");
		Assert.assertTrue(header2.isDisplayed(), "Header 2 'Home' is not displayed");
		
		WebElement header3 = driver.findElement(By.xpath("//a[text()='Products']"));
		logger.info("Asserting the Products Header");
		Assert.assertTrue(header3.isDisplayed(), "Products header is not displayed");
		
		WebElement header4 = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		logger.info("Asserting the Login Header");
		Assert.assertTrue(header4.isDisplayed(), "Login header is not dispalyed");
		
		WebElement header5 = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		logger.info("Asserting the Register header");
		Assert.assertTrue(header5.isDisplayed(), "Register header is not dispalyed");
		
		WebElement header6 = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
		logger.info("Asserting the Help Header");
		Assert.assertTrue(header6.isDisplayed(), "Help header is not displayed");
		
		WebElement header7 = driver.findElement(By.xpath("//a[contains(text(),'SlowLinkPage')]"));
		logger.info("Asserting the SlowLinkPage header");
		Assert.assertTrue(header7.isDisplayed(), "SlowLinkPage header is not dispalyed");
		
		WebElement header8 = driver.findElement(By.xpath("//a[contains(text(),'Exercise')]"));
		logger.info("Asserting the Exercise Header");
		Assert.assertTrue(header8.isDisplayed(), "Exercise header is not displayed");	
	}
}
