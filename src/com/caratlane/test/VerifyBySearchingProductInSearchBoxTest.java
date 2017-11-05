package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.caratlane.generic.BaseTest;
import com.caratlane.generic.ExcelData;
import com.caratlane.page.HomePage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifyBySearchingProductInSearchBoxTest extends BaseTest
{
	@Test
	public void testVerifyingFilterProduct() throws InterruptedException
	{
		String value=ExcelData.getData(path,"Sheet1",9, 0);
		HomePage hp=new HomePage(driver);
		hp.clickOnSearch(value);
		Thread.sleep(1000);
		hp.searchDiamondRings();
	}
}
