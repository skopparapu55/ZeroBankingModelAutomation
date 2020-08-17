package com.qa.testcases;

import java.io.IOException;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.datadriven.DataDriven;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends Base 
{
	HomePage hp;
	LoginPage lp;
	@BeforeMethod
	public void setup() throws IOException
	{
		initi();
		hp=new HomePage(driver);
	}
	@Test(dataProvider="getData")
	public void Login(String u ,String p)
	{
		hp.clkSbtn();
		lp = new LoginPage(driver);
		lp.dologin();
		lp.Button();
		
		String excepted ="Zero - Account Summary";
		String actual = driver.getTitle();
		Assert.assertEquals(excepted, actual);
		
	}
	  @AfterMethod
		public void close()
		{
			closebrowser();
		}
}