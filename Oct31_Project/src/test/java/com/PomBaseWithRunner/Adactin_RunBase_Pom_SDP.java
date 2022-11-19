package com.PomBaseWithRunner;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.Base.Utility_Files;
import com.pageobjectmanager.Page_Object_Manager;
import com.readproperties.SDP_Read_Data;

public class Adactin_RunBase_Pom_SDP extends Utility_Files{

public static WebDriver driver = browser_Launch("chrome");
	
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Adactin_RunBase_Pom_Manager.class);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		get_Url("https://adactinhotelapp.com/index.php");

		window_Commands("maximize");

		implicitwait(10);
		
		log.info("Session Started");
		
		String username = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getUsername();
		sendkeys(manager.getHp().getUsername(), username);
		
		String password = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getPassword();
		sendkeys(manager.getHp().getPassword(), password);

		click_On_Element(manager.getHp().getLogin_Btn());
		
		log.info("User Credentials Submitted");

		sleep(5000);
		
		String location = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getLocation();
		select_By_Value(manager.getHsp().getLocation(),location);
		
		String hotel = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getHotel();
		select_By_VisibleText(manager.getHsp().getHotel(),hotel);

		String room = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getRoom();
		select_By_Value(manager.getHsp().getRoom(),room);
		
		String room_nos = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getRoom_nos();
		select_By_Value(manager.getHsp().getRoom_nos(),room_nos);

		String check_in = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCheck_in();
		clear(manager.getHsp().getCheck_in());
		sendkeys(manager.getHsp().getCheck_in(),check_in);
		
		String check_out = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCheck_out();
		clear(manager.getHsp().getCheck_out());
		sendkeys(manager.getHsp().getCheck_out(),check_out);
		
		String adult = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getAdult();
		select_By_Value(manager.getHsp().getAdult(),adult);
		
		String child = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getChild();
		select_By_VisibleText(manager.getHsp().getChild(),child);

		click_On_Element(manager.getHsp().getSearch_Btn());
		
		log.info("Hotel Details Updated");

		sleep(5000);

		click_On_Element(manager.getShp().getRadio_Btn());

		click_On_Element(manager.getShp().getContinue_Btn());
		
		log.info("Hotel Updated");

		sleep(5000);
		
		String first_name = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getFirst_name();
		sendkeys(manager.getBhp().getFirst_name(),first_name);
		
		String last_name = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getLast_name();
		sendkeys(manager.getBhp().getLast_name(),last_name);
		
		String address = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getAddress();
		sendkeys(manager.getBhp().getAddress(),address);
		
		String cc_num = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCc_num();
		sendkeys(manager.getBhp().getCc_num(),cc_num);
		
		String cc_type = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCc_type();
		select_By_VisibleText(manager.getBhp().getCc_type(),cc_type);
		
		String cc_exp_month = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCc_exp_month();
		select_By_Value(manager.getBhp().getCc_exp_month(),cc_exp_month);
		
		String cc_exp_year = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCc_exp_year();
		select_By_Value(manager.getBhp().getCc_exp_year(),cc_exp_year);
		
		String cc_cvv = SDP_Read_Data.getInstanceSDP_RD().getInstanceRD().getCc_cvv();
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
