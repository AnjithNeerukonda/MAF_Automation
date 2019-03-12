package MAF;



import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import COM.MAF.TESTCASES.Agent_Registration_Form_TestCase;
import cucumber.api.java.Before;

public class Maf_Base
{	
	public static WebDriver driver;
	
    @Test
	public static void setupWeb() throws InterruptedException, IOException
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
	   	
	   	driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/aboutus");
	   	driver.manage().window().maximize();
	   	driver.getTitle();
	   	Thread.sleep(5000);
	   	driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS); 
	   
//	   	Agent_Registration_Form_TestCase obj2 = new Agent_Registration_Form_TestCase();
//        obj2.ClickHomeButton();
//		obj2.ClicJoin();
		
		Agent_Login Agobj=new Agent_Login();
		Agobj.loginscreen();
	   	
	   	Agent_Login_Multipleusers almobj= new Agent_Login_Multipleusers();
	   	almobj.AgentLogin();
		
		
		
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,500)", "");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,750)", "");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,1250)", "");
//		Thread.sleep(3000);
		driver.quit();
	}
    
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	
	
}

