package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.caratlane.generic.BasePage;

public class JewelleryPage extends BasePage
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

public JewelleryPage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver,this);
}

public void verifyingTitle(String etitle)
{
	verifyTitle(etitle);
}
public void sortHighToLowJewellery() throws InterruptedException
{
	sort.click();
	Thread.sleep(1000);
	highToLow.click();
}
public void sortLowToHighJewellery() throws InterruptedException
{
	sort.click();
	Thread.sleep(1000);
	lowToHigh.click();
}
public void clickOnProduct()
{
product.click();	
}
public void addToWishList()
{
wishList.click();	
}
public void addToTryAtHome()
{
tryAtHome.click();	
}

}
