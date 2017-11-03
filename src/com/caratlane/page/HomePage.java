package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caratlane.generic.BasePage;


public class HomePage extends BasePage
{
@FindBy(xpath="//span[.='JEWELLERY']")
private WebElement jewellery;

public HomePage(WebDriver driver) 
{
		super(driver);
		
}
public void verifyingTitle(String etitle)
{
	verifyTitle(etitle);
}
public void clickOnJewelley()
{
	jewellery.click();
}

}
