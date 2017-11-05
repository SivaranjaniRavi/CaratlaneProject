package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.caratlane.generic.BaseTest;
import com.caratlane.page.HarrisonRingsJewelleryPage;
import com.caratlane.page.HomePage;
import com.caratlane.page.RingsForMenPage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifyByClickingOnRecentlyViewedTest extends BaseTest
{
	@Test
	public void testVerifyingRecentlyViewed() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		RingsForMenPage rp=new RingsForMenPage(driver);
		HarrisonRingsJewelleryPage hrp=new 	HarrisonRingsJewelleryPage(driver);
		hp.clickOnMensRings();
		rp.clickOnProduct();
		hrp.clickOnRecentlyViewed();
	
	}
}
