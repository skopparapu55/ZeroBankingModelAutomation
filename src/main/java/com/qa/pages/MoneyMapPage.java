package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Base;

public class MoneyMapPage  extends Base{
	WebDriver driver;
	WebDriverWait wait;
	public MoneyMapPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'My Money Map')]")
	WebElement MapBtn;
	
	public void MapButton() {
		// TODO Auto-generated method stub
		MapBtn.click();
	}
	
	
	

}
