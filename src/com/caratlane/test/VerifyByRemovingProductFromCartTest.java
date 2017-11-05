package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.caratlane.generic.BaseTest;
import com.caratlane.page.CaratlanePage;
import com.caratlane.page.HomePage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifyByRemovingProductFromCartTest extends BaseTest
{
	@Test
	public void testVerifyProductRemovingFromCart() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		CaratlanePage cp=new CaratlanePage(driver);
		hp.clickOnCart();
		Thread.sleep(1000);
		cp.clickOnRemoveItem();
	
	}
}
