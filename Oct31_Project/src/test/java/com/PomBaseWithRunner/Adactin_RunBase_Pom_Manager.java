package com.PomBaseWithRunner;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;

public class Adactin_RunBase_Pom_Manager extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");
	
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Adactin_RunBase_Pom_Manager.class);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		get_Url("https://adactinhotelapp.com/index.php");

		window_Commands("maximize");

		implicitwait(10);
		
		log.info("Session Started");

		sendkeys(manager.getHp().getUsername(), "maari1995");

		sendkeys(manager.getHp().getPassword(), "Guna@2221");

		click_On_Element(manager.getHp().getLogin_Btn());
		
		log.info("User Credentials Submitted");

		sleep(5000);

		select_By_Value(manager.getHsp().getLocation(),"Melbourne");

		select_By_VisibleText(manager.getHsp().getHotel(),"Hotel Sunshine");

		select_By_Value(manager.getHsp().getRoom(),"Deluxe");

		select_By_Value(manager.getHsp().getRoom_nos(),"1");

		clear(manager.getHsp().getCheck_in());
		sendkeys(manager.getHsp().getCheck_in(),"24/11/2022");
		
		clear(manager.getHsp().getCheck_out());
		sendkeys(manager.getHsp().getCheck_out(),"25/11/2022");

		select_By_Value(manager.getHsp().getAdult(),"2");

		select_By_VisibleText(manager.getHsp().getChild(),"2 - Two");

		click_On_Element(manager.getHsp().getSearch_Btn());
		
		log.info("Hotel Details Updated");

		sleep(5000);

		click_On_Element(manager.getShp().getRadio_Btn());

		click_On_Element(manager.getShp().getContinue_Btn());
		
		log.info("Hotel Updated");

		sleep(5000);

		sendkeys(manager.getBhp().getFirst_name(),"logan");

		sendkeys(manager.getBhp().getLast_name(),"x");

		sendkeys(manager.getBhp().getAddress(),"no 5 ,vivekanandar street ,dubai main road ,dubai");

		sendkeys(manager.getBhp().getCc_num(),"1234567891011121");

		select_By_VisibleText(manager.getBhp().getCc_type(),"American Express");

		select_By_Value(manager.getBhp().getCc_exp_month(),"12");

		select_By_Value(manager.getBhp().getCc_exp_year(),"2022");

		sendkeys(manager.getBhp().getCc_cvv(),"123");

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
