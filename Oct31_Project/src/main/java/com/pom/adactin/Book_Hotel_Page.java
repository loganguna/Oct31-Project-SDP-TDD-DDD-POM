package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Page {

	public WebDriver driver;

	@FindBy(xpath = "//td//child::input[@name='first_name']")
	private WebElement first_name;
	
	@FindBy(xpath = "//tr//descendant::input[@id='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath = "//tr//descendant::textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//tr//descendant::input[@name='cc_num']")
	private WebElement cc_num;
	
	@FindBy(xpath = "//td//child::select[@name='cc_type']")
	private WebElement cc_type;
	
	@FindBy(xpath = "//td//child::select[@name='cc_exp_month']")
	private WebElement cc_exp_month;
	
	@FindBy(xpath = "//td//child::select[@name='cc_exp_year']")
	private WebElement cc_exp_year;
	
	@FindBy(xpath = "//td//child::input[@name='cc_cvv']")
	private WebElement cc_cvv;
	
	@FindBy(xpath = "//td//child::input[@name='book_now']")
	private WebElement booknow_Btn;

	public Book_Hotel_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Book Hotel Page");
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBooknow_Btn() {
		return booknow_Btn;
	}
}
