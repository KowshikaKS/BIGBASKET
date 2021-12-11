package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;
import com.pages.loginpage;

import junit.framework.Assert;

public class loginpageTest extends Base{
	loginpage lp;

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
	public void LoginTest() {
		driver.get("https://www.bigbasket.com/");
		loginpage lp=new loginpage(driver);
	}
	@Test
	public void titleTest()
	{
		if(driver.getTitle().equals("Online Grocery Shopping and Online Supermarket in India - bigbasket"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}

	
	
}

