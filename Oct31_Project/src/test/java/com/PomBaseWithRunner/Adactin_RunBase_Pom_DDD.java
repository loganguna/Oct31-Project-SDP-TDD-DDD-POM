package com.PomBaseWithRunner;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;

	public class Adactin_RunBase_Pom_DDD extends Utility_Files {
	
		public static WebDriver driver = browser_Launch("chrome");
	
		public static Page_Object_Manager manager = new Page_Object_Manager(driver);
	
		public static Logger log = Logger.getLogger(Adactin_RunBase_Pom_Manager.class);
	
		public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		get_Url("https://adactinhotelapp.com/index.php");

		window_Commands("maximize");

		implicitwait(10);
		
		log.info("Session Started");

		String username = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 2, 5);
		sendkeys(manager.getHp().getUsername(), username);
		
		String password = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 3, 5);
		sendkeys(manager.getHp().getPassword(), password);

		click_On_Element(manager.getHp().getLogin_Btn());
		
		log.info("User Credentials Submitted");

		sleep(5000);

		String  location= particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 5, 5);
		select_By_Value(manager.getHsp().getLocation(),location);
		
		String hotel = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 6, 5);
		select_By_VisibleText(manager.getHsp().getHotel(),hotel);
		
		String room = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 7, 5);
		select_By_Value(manager.getHsp().getRoom(),room);
		
		String room_nos = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 8, 5);
		select_By_Value(manager.getHsp().getRoom_nos(),room_nos);
		
		clear(manager.getHsp().getCheck_in());
		sendkeys(manager.getHsp().getCheck_in(),"24/11/2022");
		
		clear(manager.getHsp().getCheck_out());
		sendkeys(manager.getHsp().getCheck_out(),"25/11/2022");
		
		String adult = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 11, 5);
		select_By_Value(manager.getHsp().getAdult(),adult);

		String child = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 12, 5);
		select_By_VisibleText(manager.getHsp().getChild(),child);

		click_On_Element(manager.getHsp().getSearch_Btn());
		
		log.info("Hotel Details Updated");

		sleep(5000);

		click_On_Element(manager.getShp().getRadio_Btn());

		click_On_Element(manager.getShp().getContinue_Btn());
		
		log.info("Hotel Updated");

		sleep(5000);
		
		String firstname = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 16, 5);
		sendkeys(manager.getBhp().getFirst_name(),firstname);

		String lastname = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 17, 5);
		sendkeys(manager.getBhp().getLast_name(),lastname);
		
		String address = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 18, 5);
		sendkeys(manager.getBhp().getAddress(),address);
		
		String cc_num = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 19, 5);
		sendkeys(manager.getBhp().getCc_num(),cc_num);
		
		String cc_type = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 20, 5);
		select_By_VisibleText(manager.getBhp().getCc_type(),cc_type);
		
		String cc_exp_month = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 21, 5);
		select_By_Value(manager.getBhp().getCc_exp_month(),cc_exp_month);

		String cc_exp_year = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 22, 5);
		select_By_Value(manager.getBhp().getCc_exp_year(),cc_exp_year);
		
		String cc_cvv = particular_cell_data("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\Adactin Test Case.xlsx", 0, 23, 5);
		sendkeys(manager.getBhp().getCc_cvv(),cc_cvv);

		click_On_Element(manager.getBhp().getBooknow_Btn());
		
		log.info("User Personal Details Updated");

		sleep(5000);

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

		click_On_Element(manager.getIp().getLogout());
		
		log.info("Session Closed");
	}

}
