package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.caratlane.generic.BaseTest;
import com.caratlane.generic.ExcelData;
import com.caratlane.page.CaratlaneAccountPage;
import com.caratlane.page.HomePage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifyBySigningInTest extends BaseTest
{
	@Test
	public void testVerifyingSignUp()
	{
		String email=ExcelData.getData(path,"Sheet1", 6, 0);
		String pwd=ExcelData.getData(path,"Sheet1", 7, 0);
		HomePage hp=new HomePage(driver);
		CaratlaneAccountPage cp=new CaratlaneAccountPage (driver);
		hp.clickOnMyAccount();
		cp.enterDetails(email,pwd);
		cp.clickOnSignIn();
		cp.clickOnSignOut();
	}
}
