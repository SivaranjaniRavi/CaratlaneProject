package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.caratlane.generic.BaseTest;
import com.caratlane.generic.ExcelData;
import com.caratlane.page.HomePage;
import com.caratlane.page.JewelleryPage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerifySortingHighToLowTest extends BaseTest
{
@Test
public void testVerifySortingHighToLow() throws InterruptedException
{
	String jptitle=ExcelData.getData(path,"Sheet1", 1, 0);
	HomePage hp=new HomePage(driver);
	JewelleryPage jp=new JewelleryPage(driver);
	hp.clickOnJewelley();
	jp.verifyingTitle(jptitle);
	jp.sortHighToLowJewellery();
	}
}
