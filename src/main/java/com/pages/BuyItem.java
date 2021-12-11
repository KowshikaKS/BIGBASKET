package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class BuyItem {
	@FindBy(xpath="//*[@id=\"navBarMegaNav\"]/li[1]/a")
    WebElement fruitsVeg;
	 @FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[3]/a")
    WebElement onion;
	 @FindBy(xpath="@FindBy(xpath=\"//*[@id='navbar']/ul/li[2]/a\")\r\n"+ "    WebElement offer;")
	WebElement add;
	@FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[1]/div/input") 
	WebElement quantity;
	@FindBy(xpath="@FindBy(xpath=\"//*[@id=\\\"navBarMegaNav\\\"]/li[1]/a\")\r\n"+ "WebElement fruitsVeg;")
    WebElement myBasket;
	@FindBy(xpath="//*[@id=\"navbar-main\"]/div/bigbasket-cart-template/div/div[2]/ul/li[1]/div/ul/comment()[1]")
	WebElement bask;
	@FindBy(xpath="//*[@id=\"navbar-main\"]/div/bigbasket-cart-template/div/div[2]/ul/li[2]/div[2]/div[2]/button")
	WebElement checkOut;
	 Base selenium;
	    public BuyItem(WebDriver driver) {
	    	PageFactory.initElements(driver,this);
	    	selenium=new Base();
	    }
	    public boolean validateBuyItem(WebDriver driver) {
	    	selenium.performMouseHower(fruitsVeg, driver);
	    	fruitsVeg.click();
	    	selenium.performMouseHower(onion, driver);
	    	selenium.clear(quantity);
	    	selenium.setText("3", quantity);
	    	selenium.click(add);
	    	selenium.validateText(driver, quantity, "3");
	    	return selenium.validateText(driver, quantity, "3");
	    }
	    public boolean validateBasket(WebDriver driver) {
	    	selenium.performMouseHower(myBasket, driver);
	    	fruitsVeg.click();
	    	selenium.performMouseHower(bask, driver);
	    	selenium.click(checkOut);
	    	selenium.validateText(driver, bask, "fresho onion 5kg");
	    	return selenium.validateText(driver, bask, "fresho onion 5kg");
	    }
	    
}
