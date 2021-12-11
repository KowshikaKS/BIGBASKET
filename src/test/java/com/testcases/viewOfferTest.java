package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void ViewOffer()
	{
		viewOffer off=new viewOffer(driver);
		off.clickOffer();
		off.performMouseHower();
		off.clearQuant();
		off.addQuant();
		off.clickAdd();
		ExtentTest test = extent.createTest("AddToCart");
		test.log(Status.PASS, "Validate view offer case passed");
		
	}
}
