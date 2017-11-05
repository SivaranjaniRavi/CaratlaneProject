package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.caratlane.generic.BaseTest;
import com.caratlane.generic.ExcelData;
import com.caratlane.page.HomePage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerfyBySigningUpTest extends BaseTest
{
	@Test
	public void testVerifyingSignUp()
	{
		String hptitle=ExcelData.getData(path,"Sheet1", 0, 0);
		HomePage hp=new HomePage(driver);
		//hp.verifyingTitle(hptitle);
		hp.clickOnMyAccount();
	}
}
