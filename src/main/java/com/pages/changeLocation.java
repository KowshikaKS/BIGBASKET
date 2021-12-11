package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class changeLocation extends Base{
	@FindBy(xpath="//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/a/span/span[1]")
    WebElement location;
    @FindBy(xpath="//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[2]/form/div[1]/div/div/span")
    WebElement dropDown;
    @FindBy(xpath="//*[@id=\"ui-select-choices-row-1-0\"]/a")
    WebElement newLocation;
    Base selenium;
    public changeLocation(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	selenium=new Base();
    }
    public boolean validateChangeLocation(WebDriver driver) {
    	//selenium.performMouseHower(location, driver);
    	location.click();
    	selenium.performMouseHower(dropDown, driver);
    	selenium.click(dropDown);
    	selenium.setText("Agra", dropDown);
    	selenium.click(newLocation);
    	selenium.validateText(driver, newLocation, "Agra");
    	return selenium.validateText(driver, newLocation, "Agra");
    }
	
}
