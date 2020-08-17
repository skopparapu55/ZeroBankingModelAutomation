package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Base;

public class AddPayeePage extends Base {
	WebDriver driver;
	WebDriverWait wait;
	public AddPayeePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Pay Bills')]")
	WebElement PayBillBtn;
	@FindBy(linkText="Add New Payee")
	WebElement AddPayeeBtn;
	@FindBy(id="np_new_payee_name")
	WebElement NPayeeBtn;
	@FindBy(id="np_new_payee_address")
	WebElement Addressbtn;
	@FindBy(id="np_new_payee_account")
	WebElement Accountbtn;
	@FindBy(name="details")
	WebElement Detailsbtn;
	@FindBy(id="add_new_payee")
	WebElement Submitbtn;
	public void PayBills()
	{
		PayBillBtn.click();
	}
	public void AddPayee()
	{
		AddPayeeBtn.click();
	}
	public void Addname()
	{
		NPayeeBtn.sendKeys("swetha");
		
	}
	public void Addadres()
	{
		Addressbtn.sendKeys("eastyork");
		
	}
	public void AddAccount()
	{
		Accountbtn.sendKeys("123456");
	}
	public void Adddetails()
	{
		Detailsbtn.sendKeys("Family");
	}
	
	public void Button()
	{
		Submitbtn.click();
	}
	
	

}
