package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.AddPayeePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class AddPayeeTest extends Base {
	HomePage hp;
	LoginPage Lp;
	AddPayeePage App;
	@BeforeMethod
	public void setup() throws IOException
	
	{
		initi();
		hp=new HomePage(driver);
		
	}
	@Test(dataProvider="getData")
	public  void Login(String u ,String p) throws InterruptedException
	{
		hp.clkSbtn();
		Lp = new LoginPage(driver);
		Lp.dologin();
		Lp.Button();
		
		String actual = driver.getCurrentUrl();
		String expected = "http://zero.webappsecurity.com/bank/account-summary.html";
		if(actual.equalsIgnoreCase(expected))
		{
			App = new AddPayeePage(driver);
		
			App.PayBills();
			Thread.sleep(1000);
			App.AddPayee();
			System.out.println("ee");
			}
		else 
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void AddPayee() throws InterruptedException
	{
		hp.clkSbtn();
		Lp = new LoginPage(driver);
		Lp.dologin();
		Lp.Button();
		App = new AddPayeePage(driver);
		
		App.PayBills();
		Thread.sleep(1000);
		App.AddPayee();
		App.Addname();
		Thread.sleep(1000);
		App.Addadres();
		App.AddAccount();
		App.Adddetails();
		App.Button();
	}
	
		
	
	

	@AfterMethod
	public void tear()
	{
		closebrowser();
	}
	

}
