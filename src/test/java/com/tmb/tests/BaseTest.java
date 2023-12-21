package com.tmb.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.tmb.driver.Driver;

public class BaseTest {
	
	protected BaseTest() {
		
	}
	
	
	
	@BeforeTest
	public void launchbrowser() {
		
		Driver.initbrowser();
		
	}
	
	@AfterTest
	public void quitbrowser() {
		
		Driver.quitbrowser();
		
	}

}
