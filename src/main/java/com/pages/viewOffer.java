package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class viewOffer extends Base{
    @FindBy(xpath="//*[@id=\"navbar\"]/ul/li[2]/a")
    WebElement offer;
    @FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[3]/a")
    WebElement image;
    @FindBy(xpath="@FindBy(xpath=\"//*[@id='navbar']/ul/li[2]/a\")\r\n"+ "    WebElement offer;")
    WebElement add;
    @FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[1]/div/input")
    WebElement quantity;
    Actions action;
    public viewOffer(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    public void clickOffer() {
    	offer.click();
    }
    public void performMouseHower() {
    	action=new Actions(driver);
		action.moveToElement(image).build().perform();
		
	}
    
    public void clearQuant() {
    	quantity.clear();
    }
    public void addQuant() {
    	quantity.sendKeys("3");
    }
    public void clickAdd() {
    	add.click();
    }
   
	
   
   /* public boolean validateViewOffer(WebDriver driver) {
    	//selenium.performMouseHower(offer, driver);
    	offer.click();
    	selenium.performMouseHower(image, driver);
    	selenium.clear(quantity);
    	selenium.setText("3", quantity);
    	selenium.click(add);
    	selenium.validateText(driver, quantity, "3");
    	return selenium.validateText(driver, quantity, "3");
    }*/
}
