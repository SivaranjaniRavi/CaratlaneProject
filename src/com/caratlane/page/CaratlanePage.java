package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caratlane.generic.BasePage;

public class CaratlanePage extends BasePage
{
	@FindBy(xpath="//a[.='Remove Item']")
	private WebElement removeItem;
	@FindBy(xpath="//button[.='Remove']")
	private WebElement removeBTN;
	
	public CaratlanePage(WebDriver driver) 
	{
		super(driver);
		
	}
	public void clickOnRemoveItem() throws InterruptedException
	{
		removeItem.click();
		Thread.sleep(1000);
		removeBTN.click();
	}

}
