package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Base;

public class LoginPage extends Base {
	WebDriver driver;
	public static WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "user_login")
	WebElement UserN;
	@FindBy(id="user_password")
	WebElement Password;
	@FindBy(name="submit")
	WebElement Subbtn;
	public void dologin()
	{
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(UserN));
		UserN.sendKeys("username");
		wait.until(ExpectedConditions.visibilityOf(Password));
		Password.sendKeys("password");
		}
	
	public void Button() {
		Subbtn.click();
		
	}
	
	

}
