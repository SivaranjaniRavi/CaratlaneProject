package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caratlane.generic.BasePage;

public class CreateNewCustomerPage extends BasePage
{
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement fName;
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lName;
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='confirmation']")
	private WebElement cPassword;
	@FindBy(xpath="//button[@title='Submit']")
	private WebElement submit;

	public CreateNewCustomerPage(WebDriver driver) 
	{
			super(driver);
			PageFactory.initElements(driver,this);		
	}
	
	public void enterDetails(String fname,String lname,String mnum,String mailid,String pwd,String cpwd)
	{
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		mobile.sendKeys(mnum);
		email.sendKeys(mailid);
		password.sendKeys(pwd);
		cPassword.sendKeys(cpwd);
		
	}
	public void clickOnSubmit()
	{
		submit.click();
	}
}
