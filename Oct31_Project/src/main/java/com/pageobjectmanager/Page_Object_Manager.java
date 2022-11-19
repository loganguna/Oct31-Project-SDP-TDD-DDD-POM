package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Book_Hotel_Page;
import com.pom.adactin.Confirmation_Page;
import com.pom.adactin.Home_Page;
import com.pom.adactin.Hotel_Search_Page;
import com.pom.adactin.Itinerary_Page;
import com.pom.adactin.Select_Hotel_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Home_Page hp;
	
	private Hotel_Search_Page hsp;
	
	private Select_Hotel_Page shp;
	
	private Book_Hotel_Page bhp;
	
	private Confirmation_Page cp;
	
	private Itinerary_Page ip;

	public Page_Object_Manager(WebDriver driver) {
			
		this.driver = driver;
	}

	public Home_Page getHp() {
		
		if (hp==null) {
			
			hp = new Home_Page(driver);
			
		}
		return hp;
	}

	public Hotel_Search_Page getHsp() {
		
		if (hsp==null) {
			
			hsp = new Hotel_Search_Page(driver);
			
		}
		
		return hsp;
	}

	public Select_Hotel_Page getShp() {
		
		if (shp==null) {
			
			shp = new Select_Hotel_Page(driver);
			
		}
		return shp;
	}

	public Book_Hotel_Page getBhp() {
		
		if (bhp==null) {
			
			bhp = new Book_Hotel_Page(driver);
			
		}
		return bhp;
	}

	public Confirmation_Page getCp() {
		
		if (cp==null) {
			
			cp = new Confirmation_Page(driver);
			
		}
		return cp;
	}

	public Itinerary_Page getIp() {
		
		if (ip==null) {
			
			ip = new Itinerary_Page(driver);
			
		}
		return ip;
	}
	
}
