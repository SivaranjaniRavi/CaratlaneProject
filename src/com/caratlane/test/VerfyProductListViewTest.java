package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.caratlane.generic.BaseTest;
import com.caratlane.page.HomePage;
import com.caratlane.page.RingsForMenPage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerfyProductListViewTest extends BaseTest
{
	@Test
	public void testVerifyingProductListView() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		RingsForMenPage rp=new RingsForMenPage(driver);
		hp.clickOnMensRings();
		rp.clickOnListView();
	
	}
}
