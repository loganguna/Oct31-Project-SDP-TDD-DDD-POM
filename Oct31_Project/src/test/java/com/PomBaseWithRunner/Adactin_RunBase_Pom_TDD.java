package com.PomBaseWithRunner;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;
import com.testng.Data_Provider_Files;

public class Adactin_RunBase_Pom_TDD extends Utility_Files {	
	public static WebDriver driver;
	public static Page_Object_Manager manager;
	public static Logger log;
	
	@BeforeClass
	private void browser_Launch() {
		 driver  = browser_Launch("chrome");

		 manager = new Page_Object_Manager(driver);	
		
		 log = Logger.getLogger(Adactin_RunBase_Pom_Manager.class);
		
	}
	
	@Test(priority = -2,description = "Homepage")
	private void launch_Url() {
		
		PropertyConfigurator.configure("log4j.properties");
		
		get_Url("https://adactinhotelapp.com/index.php");

		window_Commands("maximize");

		implicitwait(10);
		
		log.info("Session Started");

	}
	
	@Test(dependsOnMethods = "launch_Url",alwaysRun = true,
			dataProvider = "user_credentials",
			dataProviderClass = Data_Provider_Files.class)
	private void user_Credentials(String username,String password) 
			throws InterruptedException {
		
		sendkeys(manager.getHp().getUsername(), username);

		sendkeys(manager.getHp().getPassword(), password);

		click_On_Element(manager.getHp().getLogin_Btn());
		
		log.info("User Credentials Submitted");

		sleep(5000);

	}
	
	
	
	@Test(priority = 1,groups = "room_booking",dataProvider = "roombooking",
			dataProviderClass = Data_Provider_Files.class)
	private void select_Room(String location,String hotel,String room,String room_nos) {
		
		select_By_Value(manager.getHsp().getLocation(),location);

		select_By_VisibleText(manager.getHsp().getHotel(),hotel);

		select_By_Value(manager.getHsp().getRoom(),room);

		select_By_Value(manager.getHsp().getRoom_nos(),room_nos);

	}
	
	@Test(priority = 2,groups = "date_book",dataProvider = "date",
			dataProviderClass = Data_Provider_Files.class)
	private void date(String check_in,String check_out) {
		
		clear(manager.getHsp().getCheck_in());
		sendkeys(manager.getHsp().getCheck_in(),check_in);
		
		clear(manager.getHsp().getCheck_out());
		sendkeys(manager.getHsp().getCheck_out(),check_out);

	}
	
	@Test(priority = 3,groups = "select_person",dataProvider = "person",
			dataProviderClass = Data_Provider_Files.class)
	private void person(String adult,String child) throws InterruptedException {
		
		select_By_Value(manager.getHsp().getAdult(),adult);

		select_By_VisibleText(manager.getHsp().getChild(),child);

		click_On_Element(manager.getHsp().getSearch_Btn());
		
		log.info("Hotel Details Updated");

		sleep(5000);

	}
	
	@Test(priority = 4,groups="hotel_select")
	private void update_Hotel() throws InterruptedException {
		
		click_On_Element(manager.getShp().getRadio_Btn());

		click_On_Element(manager.getShp().getContinue_Btn());
		
		log.info("Hotel Updated");

		sleep(5000);

	}
	
	@Test(priority = 5,groups="user_details",dataProvider = "userdetails",
			dataProviderClass = Data_Provider_Files.class)
	private void user_Personal_Details(String first_name,String last_name,
			String address) throws InterruptedException {
		
		sendkeys(manager.getBhp().getFirst_name(),first_name);

		sendkeys(manager.getBhp().getLast_name(),last_name);

		sendkeys(manager.getBhp().getAddress(),address);	

	}
	
	@Test(priority = 6,groups = "cc_details",dataProvider = "ccdetails",
			dataProviderClass = Data_Provider_Files.class)
	private void creditcard_Details(String cc_num,String cc_type){
		
		sendkeys(manager.getBhp().getCc_num(),cc_num);

		select_By_VisibleText(manager.getBhp().getCc_type(),cc_type);

		
	}
	
	@Test(priority = 7,groups = "cc_date",dataProvider = "ccdate",
			dataProviderClass = Data_Provider_Files.class)
	private void creditcard_date(String month,String year,String cvv) 
			throws InterruptedException  {
		
		select_By_Value(manager.getBhp().getCc_exp_month(),"12");

		select_By_Value(manager.getBhp().getCc_exp_year(),"2022");

		sendkeys(manager.getBhp().getCc_cvv(),"123");

		click_On_Element(manager.getBhp().getBooknow_Btn());
		
		log.info("User Personal Details Updated");

		sleep(5000);
		
	}
	
	@Test(priority = 8,groups="booking_page",invocationCount = 1)
	private void itinerary_Page() throws InterruptedException, IOException {
		
		click_On_Element(manager.getCp().getMy_itinerary());
		
		log.info("Open the Itinerary Page");

		sleep(5000);

		click_On_Element(manager.getIp().getCheck_box());

		Takes_Screenshot("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\ScreenShots\\Adatin.png");

		sleep(5000);

		click_On_Element(manager.getIp().getCancel_Btn());

		Alert a = driver.switchTo().alert();
		a.dismiss();

		sleep(5000);

	}
	
	@Ignore
	@AfterClass()
	private void logout() {
		
		click_On_Element(manager.getIp().getLogout());
		
		log.info("Session Closed");
	}
}	


































/*
@Test(priority = -1,groups = "hotel_booking",dataProvider = "hotelbooking",
				dataProviderClass = Data_Provider_Files.class)
		private void select_Hotel(String location,String hotel)  {

select_By_Value(manager.getHsp().getLocation(),location);

select_By_VisibleText(manager.getHsp().getHotel(),hotel);

}

@Test(priority = 1,groups = "room_booking",dataProvider = "roombooking",
			dataProviderClass = Data_Provider_Files.class)
	private void select_Room(String location,String hotel,String room,String room_nos) {
		
		select_By_Value(manager.getHsp().getLocation(),location);

		select_By_VisibleText(manager.getHsp().getHotel(),hotel);

		select_By_Value(manager.getHsp().getRoom(),room);

		select_By_Value(manager.getHsp().getRoom_nos(),room_nos);

	}
*/

