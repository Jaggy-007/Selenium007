package com.jpmchase.digital;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
	

public class FirstTestNG {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://www.guru99.com/selenium-tutorial.html");  
		String title = driver.getTitle();	
		// Code
		Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();	
}
}
