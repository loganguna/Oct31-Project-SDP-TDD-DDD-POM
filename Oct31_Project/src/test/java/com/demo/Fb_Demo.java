package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;


public class Fb_Demo extends Utility_Files {
	
	public static WebDriver driver  = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);	


	
	@Test
	private void url() {
		
		get_Url("https://www.facebook.com/");
		
	}
	
	@Ignore
	@Test
	private void username() {
		
		WebElement user = driver.findElement(By.id("email"));
		
		user.sendKeys("jhgjgajgfg");
	}

	
	}

