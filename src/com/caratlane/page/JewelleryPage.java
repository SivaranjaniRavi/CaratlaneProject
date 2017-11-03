package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caratlane.generic.BasePage;
import com.caratlane.generic.GenericUtils;

public class JewelleryPage extends BasePage
{
@FindBy(xpath="//div[@class='sort__options']")
private WebElement sort;
public JewelleryPage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver,this);
}


public void verifyingTitle(String etitle)
{
	verifyTitle(etitle);
}
public void sortJewellery(String value)
{
	GenericUtils.selectByValue(sort, value);
}
}
