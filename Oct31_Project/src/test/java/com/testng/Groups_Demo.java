package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.Utility_Files;

public class Groups_Demo extends Utility_Files {
	public static WebDriver driver  = browser_Launch("chrome");

//	public static Page_Object_Manager manager = new Page_Object_Manager(driver);	


	 @Test(priority = -1,groups = "UrlPage")
		private void launchUrl() {
			get_Url("https://adactinhotelapp.com/index.php");
		}
		@Test(priority = 1,groups = "UrlPage")
		private void maximize() {
			driver.manage().window().maximize();
		}
		@Test(priority = 0,groups = "UserCredentials")
		private void username() {
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("maari1995");
		}
		@Test(priority = 2,groups = "UserCredentials")
		private void password() {
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("guna@2221");
		}
		@Test(priority = 3)
		private void login() {
			WebElement login = driver.findElement(By.id("login"));
			login.click();
		}
		
}
