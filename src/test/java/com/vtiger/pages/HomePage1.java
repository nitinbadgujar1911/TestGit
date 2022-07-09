package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	
private WebDriver driver;
	
	public HomePage1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (linkText="Home")
	WebElement home;
	
	@FindBy (linkText="Logout")
	WebElement logout;
	
	
	public void verifyhomepage() {

		home.isDisplayed();
	}
	
	public void clicklogout() {

		logout.click();
	}

}
