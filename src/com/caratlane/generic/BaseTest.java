package com.caratlane.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant
{
	public static  WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.caratlane.com/");
		//driver.manage().window().maximize();
	}

	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
