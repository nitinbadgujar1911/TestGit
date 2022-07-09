package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage1 {

	public WebDriver driver;

	public LoginPage1 (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//strong[text()='User Log-in']")
	WebElement loginwindow;

	@FindBy (name = "user_name")
	WebElement userid;

	@FindBy (name = "user_password")
	WebElement pass;

	@FindBy (name = "Login")
	WebElement login;

	public void enterlogindetails() {

		userid.sendKeys("admin");
		pass.sendKeys("admin");
	}

	public void clicklogin() {

		login.click();
	}



	public void verifyloginpage() {

		loginwindow.isDisplayed();


	}



}
