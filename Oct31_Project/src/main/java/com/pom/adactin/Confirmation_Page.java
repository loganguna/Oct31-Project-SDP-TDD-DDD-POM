package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {

	public WebDriver driver;

	@FindBy(xpath = "//td//child::input[@name='my_itinerary']")
	private WebElement my_itinerary;

	public Confirmation_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Confirmation page");
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

}
