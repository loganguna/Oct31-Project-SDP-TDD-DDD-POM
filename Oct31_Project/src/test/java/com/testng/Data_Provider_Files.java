package com.testng;

import org.testng.annotations.DataProvider;

public class Data_Provider_Files {

	@DataProvider
	private String[][] user_credentials() {
		
		String[][] login = {
				{"maari1995","Guna@2221"}
		};
		return login;
	}
	

	@DataProvider
	private String[][] roombooking() {
		
		String[][] room = {
				{"Melbourne","Hotel Sunshine","Deluxe","1"}
		};
		return room;
	}

	@DataProvider
	private String[][] date() {
		
		String[][] check = {
				{"24/11/2022","25/11/2022"}
		};
		return check;
	}

	@DataProvider
	private String[][] person() {
		
		String[][] persons = {
				{"2","2 - Two"}
		}; 
		return persons;
	}
	
	@DataProvider
	private String[][] userdetails() {
		
		String[][] user = {
				{"logan","x","no 5 ,vivekanandar street ,dubai main road ,dubai"}
		};
		return user;
	}
	
	@DataProvider
	private String[][] ccdetails() {
		
		String[][] cc_card = {
				{"1234567891011121","American Express"}
		};
		return cc_card;
	}
	
	@DataProvider
	private String[][] ccdate() {
		
		String[][] cc_date = {
				{"12","2022","123"}
		};
		return cc_date;	
	}
	
	}
	


/*	@DataProvider
private String[][] hotelbooking() {
	
	String[][] hotel = {
			{"Melbourne","Hotel Sunshine"}
	};
	return hotel;
}*/
