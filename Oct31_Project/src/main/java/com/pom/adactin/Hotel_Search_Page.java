package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search_Page {

	public WebDriver driver;

	@FindBy(xpath = "//tbody//descendant::select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//td//child::select[@name='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//td//child::select[@id='room_type']")
	private WebElement room;

	@FindBy(xpath = "//tr//descendant::select[@id='room_nos']")
	private WebElement room_nos;

	@FindBy(xpath = "//tr//descendant::input[@id='datepick_in']")
	private WebElement check_in;

	@FindBy(xpath = "//td//child::input[@id='datepick_out']")
	private WebElement check_out;

	@FindBy(xpath = "//td//child::select[@id='adult_room']")
	private WebElement adult;

	@FindBy(xpath = "//td//child::select[@name='child_room']")
	private WebElement child;

	@FindBy(xpath = "//tr//descendant::input[@name='Submit']")
	private WebElement search_Btn;

	public Hotel_Search_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Hotel Search Page");
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}
}