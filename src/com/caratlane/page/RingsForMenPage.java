package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caratlane.generic.BasePage;

public class RingsForMenPage extends BasePage
{
	@FindBy(xpath="(//label[@class='listing__checkbox__checked listing__checkbox chk'])[1]")
	private WebElement filter;
	@FindBy(xpath="(//img[@alt='Harrison Platinum Ring for Him'])[1]")
	private WebElement product;
	@FindBy(xpath="//a[@class='toggle__list__view']")
	private WebElement listView;
	@FindBy(xpath="//a[@class='listing__filter__clear']")
	private WebElement clearFilter;
	
	public RingsForMenPage(WebDriver driver) 
	{
		super(driver);
	}
	public void clickOnFilter()
	{
		filter.click();
	}
	public void clickOnClearFilter()
	{
		filter.click();
	}
	public void clickOnProduct()
	{
		product.click();
	}
	public void clickOnListView()
	{
		listView.click();
	}


}
