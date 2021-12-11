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
import com.pages.changeLocation;
import com.pages.dealsOfWeek;

import junit.framework.Assert;

public class dealsOfWeekTest extends Base {
	WebDriver driver;
	dealsOfWeek page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new dealsOfWeek(driver);
		
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
	public void validatepopularity()
	{
		ExtentTest test = extent.createTest("Popularity");
		Assert.assertTrue(page.validatepopularity(driver));
		test.log(Status.PASS, "Validate Popularity case failed");
		
	}
	@Test
	public void validatePrice()
	{
		ExtentTest test = extent.createTest("PriceLH");
		Assert.assertTrue(page.validatePrice(driver));
		test.log(Status.PASS, "Validate PriceLH case failed");
		
	}
	@Test
	public void validatePriceHL()
	{
		ExtentTest test = extent.createTest("validatePriceHL");
		Assert.assertTrue(page.validatePriceHL(driver));
		test.log(Status.PASS, "validate PriceHL case failed");
		
	}
	@Test
	public void validateAlph()
	{
		ExtentTest test = extent.createTest("validateAlph");
		Assert.assertTrue(page.validatePrice(driver));
		test.log(Status.PASS, "Validate alphabetical case failed");
		
	}
	@Test
	public void validateSave()
	{
		ExtentTest test = extent.createTest("PriceLH");
		Assert.assertTrue(page.validateSave(driver));
		test.log(Status.PASS, "Validate PriceLH case failed");
		
	}
	public void validateSaveHl()
	{
		ExtentTest test = extent.createTest("validateSaveHl");
		Assert.assertTrue(page.validateSaveHl(driver));
		test.log(Status.PASS, "Validate SaveHL case failed");
		
	}
}
