package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class search extends Base{
	@FindBy(xpath="//*[@id=\"input\"]")
    WebElement searchBox;
	@FindBy(xpath="//*[@id='navbar-main']/div/div[3]/div/div[1]/button/i[1]")
    WebElement searchBtn;
	WebElement newLocation;
    Base selenium;
    public search(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	selenium=new Base();
    }
    public boolean validateSearch(WebDriver driver) {
    	//selenium.performMouseHower(searchBox, driver);
    	selenium.setText("Fruits", searchBox);
    	searchBtn.click();
    	selenium.clear(searchBox);
    	selenium.setText("vegetables", searchBox);
    	selenium.validateText(driver, searchBox, "vegetables");
    	selenium.clear(searchBox);
    	selenium.setText("oil", searchBox);
    	selenium.validateText(driver, searchBox, "oil");
    	return selenium.validateText(driver, searchBox, "oil"); 	
    	
    }
}
