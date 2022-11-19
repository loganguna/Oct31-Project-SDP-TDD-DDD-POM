package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J_Unit_Demo {
	
	@Test
	public void casual_Dress() {
		System.out.println("casual dress purchase");
	}
	@Test
	public void summer_Dress() {
		System.out.println("summer dress purchase");
	}
	@Test
	public void evening_Dress() {
		System.out.println("evening dress purchase");
	}
	@Before
	public void login() {
		System.out.println("login");	
	}
	@After
	public void logout() {
		System.out.println("Logout");	
	}
	@BeforeClass
	public static void browser() {
		System.out.println("browser launch");
	}
	@AfterClass
	public static void close() {
		System.out.println("close");
	}
	
		}
	/* J-Unit Annotations:-
		
		@BeforeClass
		@Before			
		@Test 
		@After			
		@AfterClass
		
		@Test
	public void mail() {
		
		System.out.println("Enter the email");
		System.out.println("Enter the passsword");
		System.out.println("login");

	}
	@Before
	public void launchurl() {
		
		System.out.println("Launch url");
		
	}
	
	@After
	public void logout() {
		
		System.out.println("Logout");
		
	}

	
	*/

