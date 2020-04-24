package com.TestNg_Practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC09_ParallelTesting {
	
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
  	   
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com");
			//Date d = new Date();
			System.out.println(driver.getTitle());
		
			driver.close();
			
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
  	   
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.guru99.com/selenium-tutorial.html");
			//Date da = new Date();
			System.out.println(driver.getTitle());
			
			driver.close();
			
	}

}
