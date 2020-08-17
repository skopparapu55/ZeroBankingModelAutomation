package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Base;

public class HomePage extends Base{
	WebDriver driver;
	public static WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signin_button")
	WebElement Signbtn;
	
	
	
	public  void clkSbtn()
	{
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Signbtn));
		Signbtn.click();
    }
	

}
