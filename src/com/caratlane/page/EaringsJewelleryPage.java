package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caratlane.generic.BasePage;

public class EaringsJewelleryPage extends BasePage
{
@FindBy(xpath="//a[contains(text(),'Add')]")
private WebElement addToCart;
@FindBy(xpath="//a[@id='pd__container__buy__now']")
private WebElement buynow;

public EaringsJewelleryPage(WebDriver driver) 
{
		super(driver);
		PageFactory.initElements(driver,this);		
}
public void clickOnAddToCart()
{
	addToCart.click();
}
public void clickOnBuyNow()
{
	buynow.click();
}

}
