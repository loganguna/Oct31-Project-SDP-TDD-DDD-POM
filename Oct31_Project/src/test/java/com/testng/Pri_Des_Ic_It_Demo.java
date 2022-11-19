package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;

public class Pri_Des_Ic_It_Demo extends Utility_Files {

	public static WebDriver driver  = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);	

	@Test(priority = -2,description = "Adactin Hotel App",
			timeOut = 9000)
	private void launch_Url() {
		get_Url("https://adactinhotelapp.com/index.php");	
	}
	@Test(priority = -1, invocationCount = 2,
			invocationTimeOut = 2000)
	private void refresh() {
		navigation_Commands("refresh");
	}
	@Test(priority = 0)
	private void window_Size() {
		window_Commands("maximize");
	}
	@Test(priority = 1,description = "UserName")
	private void username() {
		sendkeys(manager.getHp().getUsername(),"maari1995");
	}
	@Test(priority = 2,description = "Password")
	private void password() {
		sendkeys(manager.getHp().getPassword(), "Guna@2221");
	}
	@Test(priority = 3)
	private void login() {
		click_On_Element(manager.getHp().getLogin_Btn());
	}
}

/* 	@Test(invocationCount = 0)
private void launch() {

get_Url("https://adactinhotelapp.com/index.php");

}*/