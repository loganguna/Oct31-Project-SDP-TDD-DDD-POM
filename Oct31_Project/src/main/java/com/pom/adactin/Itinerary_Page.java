package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='order_id_749998']//preceding::input[@name='ids[]']")
	private WebElement check_box;

	@FindBy(xpath = "//td//child::input[@name='cancelall']")
	private WebElement cancel_Btn;

	@FindBy(xpath = "//td[@align='center']//child::input[@name='logout']")
	private WebElement logout;

	public Itinerary_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Itinerary Page");
	}

	public WebElement getCheck_box() {
		return check_box;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	public WebElement getLogout() {
		return logout;
	}
}
