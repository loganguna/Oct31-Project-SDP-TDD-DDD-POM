package com.retry.analyse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Runner {
	
	@Test
	private void username() {
		
		String actual = "guna";
		String expected = "guna";
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 1)
	private void password() {
		
		String actual = "guna@123";
		String expected = "guna@1234";
		
		Assert.assertEquals(actual, expected);
	}

}
