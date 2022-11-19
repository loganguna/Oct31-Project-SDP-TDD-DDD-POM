package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.Utility_Files;

public class GroupOfGroups_Demo extends Utility_Files {

	public static WebDriver driver  = browser_Launch("chrome");

	//public static Page_Object_Manager manager = new Page_Object_Manager(driver);	
	
	@Test(priority = -2,groups = "website")
	private void launchUrl() {
		get_Url("https://adactinhotelapp.com/index.php");
	}
 	
	@Test(priority = -1,groups = "window")
	private void maximize() {
		driver.manage().window().maximize();
	}
	@Test(priority = 0,groups = "username")
	private void username() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("maari1995");
	}
	@Test(priority = 2,groups = "password")
	private void password() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Guna@2221");
	}
	@Test(priority = 3,groups = "button")
	private void login() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

}
