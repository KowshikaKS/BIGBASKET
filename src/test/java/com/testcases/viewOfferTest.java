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
import com.pages.loginpage;
import com.pages.viewOffer;

import junit.framework.Assert;

public class viewOfferTest extends Base {
	 WebDriver driver;
	viewOffer page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new viewOffer(driver);
		
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
	public void validateViewOffer()
	{
		ExtentTest test = extent.createTest("AddToCart");
		Assert.assertTrue(page.validateViewOffer(driver));
		test.log(Status.FAIL, "Validate view offer case failed");
		
	}
}
