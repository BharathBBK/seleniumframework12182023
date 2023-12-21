package com.tmb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;

public final class HomePageTest extends BaseTest {

	private HomePageTest() {
		
	}
	
	@Test
	public void check() {
		
		
		Driver.getdriver().findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}
}
