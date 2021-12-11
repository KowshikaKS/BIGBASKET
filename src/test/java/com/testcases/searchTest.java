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
import com.pages.search;

import junit.framework.Assert;

public class searchTest extends Base {
	 WebDriver driver;
		search page;
		@BeforeMethod
		public void launchBrowser()
		{
			initializaiton();
			page=new search(driver);
			
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
		public void validateSearch()
		{
			ExtentTest test = extent.createTest("search");
			Assert.assertTrue(page.validateSearch(driver));
			test.log(Status.PASS, "Validate search case passed");
			
		}
}
