package com.qa.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.HomePage;

public class HomeTest extends Base{
	HomePage hp;
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		initi();
		hp = new HomePage(driver);
	}
	@Test
	public void verifySignUp()
	{
		hp.clkSbtn();
		String actual = driver.getTitle();
		String expected = "Zero - Log in";
		Assert.assertEquals(expected, actual);		
	}
	@AfterMethod
	public void close()
	{
		closebrowser() ;
	}
	
	
	
	

}
