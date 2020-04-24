package com.TestNg_Practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TC11_TestNgListener implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcases are failed and Testcases details are"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Testcases are skipped and Testcases details are"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Testcases are started and Testcases details are"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcases are Success and Testcases details are"+result.getName());
	}

}
