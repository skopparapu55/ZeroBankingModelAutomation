package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MoneyMapPage;

public class MoneyMapTest extends Base {
	HomePage hp;
	LoginPage Lp;
	MoneyMapPage Mp;
	@BeforeMethod
	public void setup() throws IOException
	{
		initi();
		 hp = new HomePage(driver);
		
	}
	@Test
	public void MoneyMapverify() throws InterruptedException
	{
		
		hp.clkSbtn();
		Lp = new LoginPage(driver);
		Lp.dologin();
		Lp.Button();
		Mp=new MoneyMapPage(driver);
		Thread.sleep(1000);
		Mp.MapButton();
		Thread.sleep(1000);
		
		
	}
	
	@AfterMethod
	public void tear()
	{
		closebrowser();
	}
	
	

}
