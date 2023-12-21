package com.tmb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;

public final class LoginPageTest extends BaseTest {
	
	private LoginPageTest(){
		
	}

	@Test
	public void Test1() {
		
		
		Driver.getdriver().findElement(By.name("q")).sendKeys("Basha",Keys.ENTER);
		
	    
	}
	
	
	

}
