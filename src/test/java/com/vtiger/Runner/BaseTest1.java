package com.vtiger.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 {
	
	public static WebDriver driver;
	
	public void launchApp() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
		
	}
	
	public void closeBrowser() {
		
		driver.close();
	}

}
