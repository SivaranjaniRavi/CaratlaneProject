package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caratlane.generic.BasePage;

public class GoldJewelleryPage extends BasePage
{
	@FindBy(xpath="//span[.='Featured']")
	private WebElement sort;
	@FindBy(xpath="//a[.='Price: High to Low']")
	private WebElement highToLow;
	@FindBy(xpath="//a[.='Price: Low to High']")
	private WebElement lowToHigh;
	@FindBy(xpath="(//img[@alt='Aquila Trellis Earrings'])[1]")
	private WebElement product;
	@FindBy(xpath="(//span[@class='wishlist__icon'])[1]")
	private WebElement wishList;
	@FindBy(xpath="(//span[.='Try At Home'])[1]")
	private WebElement tryAtHome;
	public GoldJewelleryPage(WebDriver driver) 
	{
		super(driver);
	}
	
	

}
