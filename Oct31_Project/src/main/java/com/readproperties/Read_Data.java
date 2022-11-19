package com.readproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data {
	
	public static Properties p;
	
	public Read_Data() throws IOException {
	
		File f = new File("C:\\Users\\RAMBO\\eclipse-workspace\\Oct31_Project\\src\\main\\java\\com\\properties\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fis);
	}

	public String getUsername() {
		
		String username = p.getProperty("username"); // key in .properties file
		
		return username;
	}
	
	public String getPassword() {
		
		String password = p.getProperty("password"); // key in .properties file
		return password;
	}
	
	public String getLocation() {
		
		String location = p.getProperty("location"); // key in .properties file
		return location;
	}
	
	public String getHotel() {
		
		String hotel = p.getProperty("hotel"); // key in .properties file
		return hotel;
	}
	
	public String getRoom() {
		
		String room = p.getProperty("room"); // key in .properties file
		return room;
	}
	
	public String getRoom_nos() {
		
		String room_nos = p.getProperty("room_nos"); // key in .properties file
		return room_nos;
	}
	
	public String getCheck_in() {
		
		String check_in = p.getProperty("check_in"); // key in .properties file
		return check_in;
	}
	
	public String getCheck_out() {
		
		String check_out = p.getProperty("check_out"); // key in .properties file
		return check_out;
	}	
	
	public String getAdult() {
		
		String adult = p.getProperty("adult"); // key in .properties file
		return adult;
	}
	
	public String getChild() {
		
		String child = p.getProperty("child"); // key in .properties file
		return child;
	}
	
	public String getFirst_name() {
		
		String first_name = p.getProperty("first_name"); // key in .properties file
		return first_name;
	}
	
	public String getLast_name() {
		
		String last_name = p.getProperty("last_name"); // key in .properties file
		return last_name;
	}
	
	public String getAddress() {
		
		String address = p.getProperty("address"); // key in .properties file
		return address;
	}
	
	public String getCc_num() {
		
		String cc_num = p.getProperty("cc_num"); // key in .properties file
		return cc_num;
	}
	
	public String getCc_type() {
		
		String cc_type = p.getProperty("cc_type"); // key in .properties file
		return cc_type;
	}
	
	public String getCc_exp_month() {
		
		String cc_exp_month = p.getProperty("cc_exp_month"); // key in .properties file
		return cc_exp_month;
	}
	
	public String getCc_exp_year() {
		
		String cc_exp_year = p.getProperty("cc_exp_year"); // key in .properties file
		return cc_exp_year;
	}
	public String getCc_cvv() {
		
		String cc_cvv = p.getProperty("cc_cvv"); // key in .properties file
		return cc_cvv;
	}
}
