package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class loginpage extends Base{
    
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	
}