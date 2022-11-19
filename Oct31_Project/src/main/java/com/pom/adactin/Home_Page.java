package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	@FindBy(xpath = "//table[@class='login']//descendant::input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//td//child::input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//tr//descendant::input[@name='login']")
	private WebElement login_Btn;

	public Home_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Home Page");
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
}
