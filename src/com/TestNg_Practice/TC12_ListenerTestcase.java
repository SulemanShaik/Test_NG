package com.TestNg_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC12_ListenerTestcase 
{
         WebDriver driver;
         @Test
	public void googleTitleVerify()
	
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  	   
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.javatpoint.com/java-oops-concepts");
		
			System.out.println(driver.getTitle());
			
			driver.close();
	}
	
	
}
