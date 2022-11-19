package com.demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Demo {
	@Parameters({"user","pass"})
	@Test
	private void userCredentials(String username,String password) {
		
		System.out.println("username ="+username);
		System.out.println("password ="+password);
	
	}
	
	@Parameters({"idd","age","add"})
	@Test
	private void userDetails(@Optional("Customized") String name,int age, String address) {
		
		System.out.println("name ="+name);
		System.out.println("age ="+age);
		System.out.println("address ="+address);
	
	}

	
}
