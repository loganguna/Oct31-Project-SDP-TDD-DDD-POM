package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Hierarchical_Annotations {

	@BeforeMethod
	private void mail() {

		System.out.println("login");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@Test
	private void casual() {

		System.out.println("purchase casual dress");
	}

	@Test
	private void evening() {

		System.out.println("evening dress purchase");
	}

	@Test
	private void summer() {

		System.out.println("summer dress purchase");
	}

	@BeforeClass
	private void launchurl() {

		System.out.println("Launch URL");
	}
	@AfterClass
	private void homepage() {

		System.out.println("Homepage");
	}
	@BeforeTest
	private void browser() {

		System.out.println("Browser Launch");
	}
	@AfterTest
	private void deleteallcookies() {

		System.out.println("delete_all_Cookies");
	}
	@BeforeSuite
	private void setproperty() {

		System.out.println("Set-Property");
	}
	@AfterSuite
	private void close() {

		System.out.println("Close");
	}

}
