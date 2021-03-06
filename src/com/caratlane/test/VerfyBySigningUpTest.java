package com.caratlane.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.caratlane.generic.BaseTest;
import com.caratlane.generic.ExcelData;
import com.caratlane.page.CaratlaneAccountPage;
import com.caratlane.page.CreateNewCustomerPage;
import com.caratlane.page.HomePage;

@Listeners(com.caratlane.generic.ListenersTest.class)
public class VerfyBySigningUpTest extends BaseTest
{
	@Test
	public void testVerifyingSignUp()
	{
		String fname=ExcelData.getData(path,"Sheet1", 3, 0);
		String lname=ExcelData.getData(path,"Sheet1", 4, 0);
		String mnum=ExcelData.getData(path,"Sheet1", 5, 0);
		String mailid=ExcelData.getData(path,"Sheet1", 6, 0);
		String pwd=ExcelData.getData(path,"Sheet1", 7, 0);
		String cpwd=ExcelData.getData(path,"Sheet1",8, 0);
		HomePage hp=new HomePage(driver);
		CaratlaneAccountPage cp=new CaratlaneAccountPage (driver);
		CreateNewCustomerPage cnp=new CreateNewCustomerPage(driver);
		hp.clickOnMyAccount();
		cp.clickOnCreateAccount();
		cnp.enterDetails(fname, lname, mnum, mailid, pwd, cpwd);
		cnp.clickOnSubmit();
	}
}
