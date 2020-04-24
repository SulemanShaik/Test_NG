package com.TestNg_Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC03_SoftAssertVSHardAssert {
	
	
	
	
	SoftAssert  softAssert= new SoftAssert();
	
	@Test
	public void test1()
	{
		System.out.println("Open Browser");
		
		//Assert.assertEquals(true, false);   //Hard Assertion 
		softAssert.assertEquals(true, false);//Soft Assertion
				
		
		System.out.println("Enter UserName");
		System.out.println("Enter Password");
		System.out.println("Click on sign in button");
		softAssert.assertEquals(true, false);//Soft Assertion
		softAssert.assertAll();
		
		//Assert.assertEquals(true, false);   //Hard Assertion
		
		System.out.println("validate Home Page");
		//Assert.assertEquals(true, false);   //Hard Assertion
		softAssert.assertEquals(true, false);//Soft Assertion
		softAssert.assertAll();
		
		System.out.println("Go to Deals page");
		System.out.println("Create a new Deal");
		System.out.println("Go to Contact page");
		System.out.println("create a new contact ");
		
		softAssert.assertAll();
	         }
		
		public void test2()
		{
		System.out.println("logout");
		softAssert.assertAll();
		}
	
	
 }
	
