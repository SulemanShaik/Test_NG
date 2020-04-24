package com.TestNg_InterviewQuestions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TC01_TestNG_Hierarachy {
	
	/*	@BeforeSuite
		@BeforeTest
		@BeforeClass
		@BeforeMethod
		@Test
		@AfterMethod
		@AfterClass
		@AfterTest
		@AfterSuite */
	
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Before Suite Execute");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Before Test Execute");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before Class Execute");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before Method Execute");
	}
	
	@org.testng.annotations.Test
	public void Test() 
	{
		System.out.println("This is Main Test Method");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("After Suite Execute");
	}
	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After Test Execute");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("After Class Execute");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After Method Execute");
	}
	
	
	
	


}
