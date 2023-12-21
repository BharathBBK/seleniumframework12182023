package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private static WebDriver driver;
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static WebDriver getdriver() {
		
		return dr.get();
	}
	
	public static void setdriver(WebDriver driverref) {
		
		dr.set(driverref);
		
	}
	
	public static void closeall() {
		
		dr.remove();
	}
	
	
	public static void initbrowser() {
		
		if(Objects.isNull(driver)) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		setdriver(driver);
		
		try{Thread.sleep(3000);}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		//getdriver().manage().window().maximize();
		//getdriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		getdriver().get("https://www.google.com/");		
		}
	}
	
	public static void quitbrowser() {
		if(Objects.nonNull(getdriver())) {
			getdriver().quit();
			closeall();
		}
	}

}
