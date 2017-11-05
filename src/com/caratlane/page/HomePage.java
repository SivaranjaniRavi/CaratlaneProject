package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caratlane.generic.BasePage;


public class HomePage extends BasePage
{
@FindBy(xpath="//span[.='JEWELLERY']")
private WebElement jewellery;
@FindBy(xpath="//a[.='My Account']")
private WebElement myAccount;

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

}
