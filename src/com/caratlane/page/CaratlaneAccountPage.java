package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caratlane.generic.BasePage;

public class CaratlaneAccountPage extends BasePage
{
	@FindBy(xpath="//button[@title='Create an Account']")
	private WebElement createAccount;
	@FindBy(xpath="//a[.='My Account']")
	private WebElement myAccount;
	@FindBy(xpath="//input[@name='login[username]']")
	private WebElement emailAddress;
	@FindBy(xpath="//input[@name='login[password]']")
	private WebElement password;
	@FindBy(xpath="//button[@title='Sign In']")
	private WebElement signIn;
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signOut;

	public CaratlaneAccountPage(WebDriver driver) 
	{
			super(driver);
			PageFactory.initElements(driver,this);		
	}
	public void verifyingTitle(String etitle)
	{
		verifyTitle(etitle);
	}
	public void clickOnCreateAccount()
	{
		createAccount.click();
	}
	public void enterDetails(String email,String pwd)
	{
		emailAddress.sendKeys(email);
		password.sendKeys(pwd);
	}
	public void clickOnSignIn()
	{
		signIn.click();
	}
	public void clickOnSignOut()
	{
		signOut.click();
	}

}
