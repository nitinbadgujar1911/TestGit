package com.vtiger.Stepdefinitions;

import org.openqa.selenium.By;
import com.vtiger.Runner.BaseTest1;
import com.vtiger.pages.HomePage1;
import com.vtiger.pages.LoginPage1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest extends BaseTest1{

	LoginPage1 lp;
	HomePage1 hp;

	@Given("^user navigate to url$")
	public void user_navigate_to_url() throws Throwable {

		launchApp();
	}

	@Then("^login page will appear$")
	public void login_page_will_appear() throws Throwable {

		lp = new LoginPage1(driver);
		lp.verifyloginpage();
		
	}




	@When("^user enters valid login and passward$")
	public void user_enters_valid_login_and_passward() throws Throwable {

		lp.enterlogindetails();
		//driver.findElement(By.name("user_name")).sendKeys("admin");
		//driver.findElement(By.name("user_password")).sendKeys("admin");




	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		
		lp.clicklogin();
		//driver.findElement(By.name("Login")).click();


	}

	@Then("^User should landed on Home Page$")
	public void user_should_landed_on_Home_Page() throws Throwable {

		hp = new HomePage1(driver);
		hp.verifyhomepage();
		//driver.findElement(By.linkText("Home")).isDisplayed();

	}

	@Then("^click on logout button$")
	public void click_on_logout_button() throws Throwable {

		hp.clicklogout();
		//driver.findElement(By.linkText("Logout")).click();

	}




	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {

		closeBrowser();
		
		//driver.close();
	}



}
