package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class dealsOfWeek extends Base{
	@FindBy(xpath="//*[@id=\"store-entry\"]/div[1]/div/div[6]/div/div/a/img")
    WebElement deal;
	@FindBy(xpath="//*[@id=\"sel1\"]")
    WebElement dropDown;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[1]")
    WebElement popularity;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[2]")
    WebElement priceLh;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[3]")
    WebElement priceHl;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[4]")
    WebElement alphabetical;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[5]")
    WebElement rsSaveLh;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[6]")
    WebElement rsSaveHl;
    Base selenium;
    public dealsOfWeek(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	selenium=new Base();
    }
    public boolean validatepopularity(WebDriver driver) {
    	selenium.performMouseHower(deal, driver);
    	deal.click();
    	selenium.performMouseHower(dropDown, driver);
    	selenium.click(dropDown);
    	selenium.setText("popularity", dropDown);
    	selenium.click(popularity);
    	selenium.validateText(driver, dropDown, "popularity");
    	return selenium.validateText(driver, dropDown, "popularity");
    }
    public boolean validatePrice(WebDriver driver) {
    	selenium.clear(dropDown);
    	selenium.setText("Price-Low to high", dropDown);
    	selenium.click(priceLh);
    	selenium.validateText(driver, dropDown, "Price-Low to high");
    	return selenium.validateText(driver, dropDown, "Price-Low to high");
    }
    public boolean validatePriceHL(WebDriver driver) {
    	selenium.clear(dropDown);
    	selenium.setText("Price-High to low", dropDown);
    	selenium.click(priceHl);
    	selenium.validateText(driver, dropDown, "Price-High to low");
    	return selenium.validateText(driver, dropDown, "Price-High to low");
    }
    public boolean validateAlph(WebDriver driver) {
    	selenium.clear(dropDown);
    	selenium.setText("alphabetically", dropDown);
    	selenium.click(alphabetical);
    	selenium.validateText(driver, dropDown, "alphabetically");
    	return selenium.validateText(driver, dropDown, "alphabetically");
    }
    public boolean validateSave(WebDriver driver) {
    	selenium.clear(dropDown);
    	selenium.setText("Rupee saving-High to low", dropDown);
    	selenium.click(rsSaveLh);
    	selenium.validateText(driver, dropDown, "Rupee saving-High to low");
    	return selenium.validateText(driver, dropDown, "Rupee saving-High to low");
    }
    public boolean validateSaveHl(WebDriver driver) {
    	selenium.clear(dropDown);
    	selenium.setText("Rupee saving-Low to high", dropDown);
    	selenium.click(rsSaveHl);
    	selenium.validateText(driver, dropDown, "Rupee saving-Low to high");
    	return selenium.validateText(driver, dropDown, "Rupee saving-Low to high");
    }
}
