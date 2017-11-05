package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caratlane.generic.BasePage;
import com.caratlane.generic.GenericUtils;


public class HomePage extends BasePage
{
@FindBy(xpath="//span[.='JEWELLERY']")
private WebElement jewellery;
@FindBy(xpath="//a[.='My Account']")
private WebElement myAccount;
@FindBy(xpath="//a[.='Rings for Men']")
private WebElement menRings;
@FindBy(xpath="//span[.='GOLD JEWELLERY']")
private WebElement goldJewellery;
@FindBy(xpath="//a[.='Pearl']")
private WebElement pearl;
@FindBy(xpath="//div[@id='cart_container']")
private WebElement cart;
@FindBy(xpath="//div[@id='search_container']")
private WebElement searchBTN;
@FindBy(xpath="//input[@id='search']")
private WebElement search;
@FindBy(xpath="(//em[.='diamond ring'])[1]")
private WebElement searchDiamondRing;


public HomePage(WebDriver driver) 
{
		super(driver);
		PageFactory.initElements(driver,this);		
}
public void verifyingTitle(String etitle)
{
	verifyTitle(etitle);
}
public void clickOnJewelley()
{
	jewellery.click();
}
public void clickOnMyAccount()
{
	myAccount.click();
}
public void clickOnMensRings() throws InterruptedException
{
GenericUtils.moveToElement(jewellery, driver);	
Thread.sleep(1000);
menRings.click();
}
public void clickOnPearl() throws InterruptedException
{
GenericUtils.moveToElement(goldJewellery, driver);	
Thread.sleep(1000);
pearl.click();
}
public void clickOnCart()
{
	cart.click();
}
public void clickOnSearch(String value) throws InterruptedException
{
	searchBTN.click();
	Thread.sleep(1000);
	search.sendKeys(value);
}
public void searchDiamondRings()
{
	searchDiamondRing.click();
}
}
