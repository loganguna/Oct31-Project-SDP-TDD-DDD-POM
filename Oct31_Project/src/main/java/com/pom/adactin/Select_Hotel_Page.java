package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {

	public WebDriver driver;

	@FindBy(xpath = "//tbody//descendant::input[@type='radio']")
	private WebElement radio_Btn;

	@FindBy(xpath = "//td//child::input[@type='submit']")
	private WebElement continue_Btn;

	public Select_Hotel_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Select Hotel Page");

	}

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

}
