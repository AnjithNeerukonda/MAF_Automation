package com.MAF_Automation;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class Base_Class {
	
 public static WebDriver driver;
	@Before("@web")
    @Test
	public void setupWeb() throws InterruptedException, IOException
	{
	   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
	   	driver = new ChromeDriver();
	   	//driver.manage().deleteAllCookies();
	   	
	   	Set<Cookie> allCookies = driver.manage().getCookies();
	   	for (Cookie cookie : allCookies) 
	   	{
	   		System.out.println("cookie :"+cookie);
	   	
	   	    driver.manage().deleteCookieNamed(cookie.getName());
	   	}
	   	
	   	driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home");
	   	driver.manage().window().maximize();
	   	driver.getTitle();
	   	Thread.sleep(5000);
	   	driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS); 
	   	
//	   	Thread.sleep(3000);
       
}

	
	public static WebDriver getDriver() 
	{
		// TODO Auto-generated method stub
		return driver;
	}

	

	
}
