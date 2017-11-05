package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.caratlane.generic.BaseTest;
import com.caratlane.generic.ExcelData;
import com.caratlane.page.EaringsJewelleryPage;
import com.caratlane.page.HomePage;
import com.caratlane.page.JewelleryPage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifyProductByAddingToCartTest extends BaseTest
{
	@Test
	public void testVerifyingCart()
	{
		//String hptitle=ExcelData.getData(path,"Sheet1", 0, 0);
		String jptitle=ExcelData.getData(path,"Sheet1", 1, 0);
		HomePage hp=new HomePage(driver);
		JewelleryPage jp=new JewelleryPage(driver);
		EaringsJewelleryPage ep=new EaringsJewelleryPage(driver);
		//hp.verifyingTitle(hptitle);
		hp.clickOnJewelley();
		jp.verifyingTitle(jptitle);
		jp.clickOnProduct();
		ep.clickOnAddToCart();
	}
}
