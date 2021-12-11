package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;
import com.pages.BuyItem;


import junit.framework.Assert;

public class BuyItemTest extends Base{
	WebDriver driver;
	BuyItem page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new BuyItem(driver);
		
	}
	@AfterMethod
	public void closeSetup()
	{
		tearDown();
	}
	@BeforeTest
	public void reportSetup()
	{
		extentReportSetup();
	}
	@AfterTest
	public void closeReportSetup()
	{
		closeExtentReportSetup();
	}
	@Test
	public void validateBuyItem()
	{
		ExtentTest test = extent.createTest("BuyItem");
		Assert.assertTrue(page.validateBuyItem(driver));
		test.log(Status.PASS, "Validate BuyItem case failed");
		
	}
	@Test
	public void validateBasket()
	{
		ExtentTest test = extent.createTest("Basket");
		Assert.assertTrue(page.validateBasket(driver));
		test.log(Status.PASS, "Validate Basket case failed");
		
	}
}
