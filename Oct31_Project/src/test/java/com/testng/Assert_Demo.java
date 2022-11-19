package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;

public class Assert_Demo extends Utility_Files{

	public static WebDriver driver  = browser_Launch("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);	
	
	@Test
	private void launchurl() {
		
		get_Url("https://adactinhotelapp.com/index.php");
		String expected_Url = "https://adactinhotelapplication.com/index.php";
		Assert.assertNotEquals(get_CurrentUrl(), expected_Url);
		sendkeys(manager.getHp().getUsername(), "maari1995");
		System.out.println("Username Entered");	
		sendkeys(manager.getHp().getPassword(), "Guna@2221");
		System.out.println("Password Entered");	
		click_On_Element(manager.getHp().getLogin_Btn());
		System.out.println("Hotel booking page arrived");	

	}
		@Test(priority = 1)
		private void hotelPage() throws InterruptedException {
		
		String expected_url = "https://adactinhotelapppp.com/SearchHotel.php";
		sleep(2000);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(get_CurrentUrl(), expected_url);
		soft.assertAll();
		select_By_Value(manager.getHsp().getLocation(), "Melbourne");
		System.out.println("Location Entered");	
		
	}

}
/*	
1)	get_Url("https://adactinhotelapp.com/index.php");
	String expected_Url = "https://adactinhotelapp.com/index.php";
	Assert.assertEquals(get_CurrentUrl(), expected_Url);
	sendkeys(manager.getHp().getUsername(), "maari1995");
	System.out.println("Username Entered");
	
2)	get_Url("https://adactinhotelapp.com/index.php");
	String expected_Url = "https://adactinhotelapplication.com/index.php";
	Assert.assertEquals(get_CurrentUrl(), expected_Url);
	sendkeys(manager.getHp().getUsername(), "maari1995");
	System.out.println("Username Entered");	

3)  get_Url("https://adactinhotelapp.com/index.php");
	String expected_Url = "https://adactinhotelapplication.com/index.php";
	Assert.assertNotEquals(get_CurrentUrl(), expected_Url);
	sendkeys(manager.getHp().getUsername(), "maari1995");
	System.out.println("Username Entered");	
	

*/