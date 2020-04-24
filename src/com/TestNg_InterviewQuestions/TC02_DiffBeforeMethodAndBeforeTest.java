package com.TestNg_InterviewQuestions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC02_DiffBeforeMethodAndBeforeTest {
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before Method Execute");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Before Test Execute");
	}
	
	@Test
	public void test()
	{
		System.out.println(" Test Execute");
	}

}
