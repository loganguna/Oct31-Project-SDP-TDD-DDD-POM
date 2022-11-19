package com.PomBaseWithRunner;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import com.Base.Utility_Files;
import com.pom.adactin.Book_Hotel_Page;
import com.pom.adactin.Confirmation_Page;
import com.pom.adactin.Home_Page;
import com.pom.adactin.Hotel_Search_Page;
import com.pom.adactin.Itinerary_Page;
import com.pom.adactin.Select_Hotel_Page;

public class Adactin_RunBase_Pom extends Utility_Files {

	public static WebDriver driver = browser_Launch("chrome");

	public static Home_Page hp = new Home_Page(driver);

	public static Hotel_Search_Page hsp = new Hotel_Search_Page(driver);

	public static Select_Hotel_Page shp = new Select_Hotel_Page(driver);

	public static Book_Hotel_Page bhp = new Book_Hotel_Page(driver);

	public static Confirmation_Page cp = new Confirmation_Page(driver);

	public static Itinerary_Page ip = new Itinerary_Page(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		get_Url("https://adactinhotelapp.com/index.php");

		window_Commands("maximize");

		implicitwait(10);

		sendkeys(hp.getUsername(), "maari1995");

		sendkeys(hp.getPassword(), "Guna@2221");

		click_On_Element(hp.getLogin_Btn());

		sleep(5000);

		select_By_Value(hsp.getLocation(), "Melbourne");

		select_By_VisibleText(hsp.getHotel(), "Hotel Sunshine");

		select_By_Value(hsp.getRoom(), "Deluxe");

		select_By_Value(hsp.getRoom_nos(), "1");

		clear(hsp.getCheck_in());
		sendkeys(hsp.getCheck_in(), "24/11/2022");
		
		clear(hsp.getCheck_out());
		sendkeys(hsp.getCheck_out(), "25/11/2022");

		select_By_Value(hsp.getAdult(), "2");

		select_By_VisibleText(hsp.getChild(), "2 - Two");

		click_On_Element(hsp.getSearch_Btn());

		sleep(5000);

		click_On_Element(shp.getRadio_Btn());

		click_On_Element(shp.getContinue_Btn());

		sleep(5000);

		sendkeys(bhp.getFirst_name(), "logan");

		sendkeys(bhp.getLast_name(), "x");

		sendkeys(bhp.getAddress(), "no 5 ,vivekanandar street ,dubai main road ,dubai");

		sendkeys(bhp.getCc_num(), "1234567891011121");

		select_By_VisibleText(bhp.getCc_type(), "American Express");

		select_By_Value(bhp.getCc_exp_month(), "12");

		select_By_Value(bhp.getCc_exp_year(), "2022");

		sendkeys(bhp.getCc_cvv(), "123");

		click_On_Element(bhp.getBooknow_Btn());

		sleep(5000);

		click_On_Element(cp.getMy_itinerary());

		sleep(5000);

		click_On_Element(ip.getCheck_box());

		Takes_Screenshot("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\ScreenShots\\Adatin.png");

		sleep(5000);

		click_On_Element(ip.getCancel_Btn());

		Alert a = driver.switchTo().alert();
		a.dismiss();

		sleep(5000);

		click_On_Element(ip.getLogout());
	}
}