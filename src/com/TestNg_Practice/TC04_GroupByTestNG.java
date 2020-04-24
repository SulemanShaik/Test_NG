package com.TestNg_Practice;

import org.testng.annotations.Test;

public class TC04_GroupByTestNG {
	
	@Test(groups= {"sanity"})
	public void test1() {
		
	}
	
	
	@Test(groups= {"sanity","regression"})
	public void test2() {
		
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		
	}

}
