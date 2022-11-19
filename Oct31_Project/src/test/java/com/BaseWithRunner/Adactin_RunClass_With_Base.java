package com.BaseWithRunner;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Base.Utility_Files;

public class Adactin_RunClass_With_Base extends Utility_Files {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browser_Launch("chrome");

		get_Url("https://adactinhotelapp.com/index.php");

		window_Commands("maximize");

		implicitwait(10);

		WebElement username = driver.findElement(By.xpath("//table[@class='login']//descendant::input[@id='username']"));
		sendkeys(username, "maari1995");

		WebElement pass = driver.findElement(By.xpath("//td//child::input[@name='password']"));
		sendkeys(pass, "Guna@2221");

		WebElement login_btn = driver.findElement(By.xpath("//tr//descendant::input[@name='login']"));
		click_On_Element(login_btn);

		sleep(5000);

		WebElement location = driver.findElement(By.xpath("//tbody//descendant::select[@id='location']"));
		select_By_Value(location, "Melbourne");

		WebElement hotel = driver.findElement(By.xpath("//td//child::select[@name='hotels']"));
		select_By_VisibleText(hotel, "Hotel Sunshine");

		WebElement room = driver.findElement(By.xpath("//td//child::select[@id='room_type']"));
		select_By_Value(room, "Deluxe");

		WebElement room_nos = driver.findElement(By.xpath("//tr//descendant::select[@id='room_nos']"));
		select_By_Value(room_nos, "1");

		WebElement check_in = driver.findElement(By.xpath("//tr//descendant::input[@id='datepick_in']"));
		clear(check_in);
		sendkeys(check_in, "24/11/2022");

		WebElement check_out = driver.findElement(By.xpath("//td//child::input[@id='datepick_out']"));
		clear(check_out);
		sendkeys(check_out, "25/11/2022");

		WebElement adult = driver.findElement(By.xpath("//td//child::select[@id='adult_room']"));
		select_By_Value(adult, "2");

		WebElement child = driver.findElement(By.xpath("//td//child::select[@name='child_room']"));
		select_By_VisibleText(child, "2 - Two");

		WebElement search_btn = driver.findElement(By.xpath("//tr//descendant::input[@name='Submit']"));
		click_On_Element(search_btn);

		sleep(5000);

		WebElement radio_btn = driver.findElement(By.xpath("//tbody//descendant::input[@type='radio']"));
		click_On_Element(radio_btn);

		WebElement continue_btn = driver.findElement(By.xpath("//td//child::input[@type='submit']"));
		click_On_Element(continue_btn);

		sleep(5000);

		WebElement first_name = driver.findElement(By.xpath("//td//child::input[@name='first_name']"));
		sendkeys(first_name, "logan");

		WebElement last_name = driver.findElement(By.xpath("//tr//descendant::input[@id='last_name']"));
		sendkeys(last_name, "x");

		WebElement address = driver.findElement(By.xpath("//tr//descendant::textarea[@id='address']"));
		sendkeys(address, "no 5 ,vivekanandar street ,dubai main road ,dubai");

		WebElement cc_num = driver.findElement(By.xpath("//tr//descendant::input[@name='cc_num']"));
		sendkeys(cc_num, "1234567891011121");

		WebElement cc_type = driver.findElement(By.xpath("//td//child::select[@name='cc_type']"));
		select_By_VisibleText(cc_type, "American Express");

		WebElement cc_exp_month = driver.findElement(By.xpath("//td//child::select[@name='cc_exp_month']"));
		select_By_Value(cc_exp_month, "12");

		WebElement cc_exp_year = driver.findElement(By.xpath("//td//child::select[@name='cc_exp_year']"));
		select_By_Value(cc_exp_year, "2022");

		WebElement cc_cvv = driver.findElement(By.xpath("//td//child::input[@name='cc_cvv']"));
		sendkeys(cc_cvv, "123");

		WebElement booknow_btn = driver.findElement(By.xpath("//td//child::input[@name='book_now']"));
		click_On_Element(booknow_btn);

		sleep(5000);

		WebElement my_itinerary = driver.findElement(By.xpath("//td//child::input[@name='my_itinerary']"));
		click_On_Element(my_itinerary);

		sleep(5000);

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='order_id_749998']//preceding::input[@name='ids[]']"));
		click_On_Element(checkbox);

		Takes_Screenshot("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\ScreenShots\\Adatin.png");

		sleep(5000);

		WebElement cancel_btn = driver.findElement(By.xpath("//td//child::input[@name='cancelall']"));
		click_On_Element(cancel_btn);

		Alert a = driver.switchTo().alert();
		a.dismiss();

		sleep(5000);

		WebElement logout = driver.findElement(By.xpath("//td[@align='center']//child::input[@name='logout']"));
		click_On_Element(logout);
	}

}
