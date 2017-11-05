package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caratlane.generic.BasePage;

public class HarrisonRingsJewelleryPage extends BasePage
{
	@FindBy(xpath="(//div[@class='pd__container__rgt__similar__cont'])[1]")
	private WebElement similarItem;
	@FindBy(xpath="//a[@id='recently_viewed_link']")
	private WebElement recentlyViewed;
	
	public HarrisonRingsJewelleryPage(WebDriver driver) 
	{
		super(driver);
		
	}
	public void clickOnSimilarItem()
	{
		similarItem.click();
	}
	public void clickOnRecentlyViewed()
	{
		recentlyViewed.click();
	}
	
}
