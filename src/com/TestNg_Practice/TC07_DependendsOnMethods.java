package com.TestNg_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_DependendsOnMethods {
	
	
	@Test
	public void startApp()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Starting App");
	}
	
	@Test(dependsOnMethods="startApp")
	public void login()
	{
		System.out.println("Login App");
	}
	
	@Test(dependsOnMethods="login")
	public void logout() 
	{
		System.out.println("Logout App");
	}

}
