package com.tmb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	

	@Test(priority = 2)
	public void Test1() {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Basha",Keys.ENTER);
		
	    
	}
	
	@Test(priority = 1)
	public void Test2() {
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	

}
