package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.caratlane.generic.BaseTest;
import com.caratlane.page.HomePage;
import com.caratlane.page.RingsForMenPage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifyProductByClearFilterTest extends BaseTest
{
	@Test
	public void testVerifyingClearFilterProduct() throws InterruptedException
	{
		//String hptitle=ExcelData.getData(path,"Sheet1", 0, 0);
		HomePage hp=new HomePage(driver);
		RingsForMenPage rp=new RingsForMenPage(driver);
		//hp.verifyingTitle(hptitle);
		hp.clickOnMensRings();
		rp.clickOnFilter();
		rp.clickOnClearFilter();
	
	}
}
