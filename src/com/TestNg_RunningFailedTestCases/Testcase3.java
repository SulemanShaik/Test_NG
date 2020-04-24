package com.TestNg_RunningFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3 {

	
	@Test
	public void wordpress() {
		
		Assert.assertTrue(false);
		//Assert.assertTrue(true);
		System.out.println("WORDPRESS WORKING AS EXPECTED");
	}

}
