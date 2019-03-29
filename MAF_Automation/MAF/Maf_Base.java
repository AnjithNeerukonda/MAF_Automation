package MAF;



import java.awt.AWTException;
import java.awt.List;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import COM.MAF.TESTCASES.Agent_Registration_Form_TestCase;
import cucumber.api.java.Before;

public class Maf_Base
{	
	public static WebDriver driver;

	@Test
	public static void setupWeb() throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hotstar.com/");
		// driver.get("http://flipkart.com/");
		// driver.get("https://www.facebook.com/");
//	   	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
//	   	driver = new FirefoxDriver();

//	   	driver.get("https://1ivi50of6a.execute-api.eu-central-1.amazonaws.com/production");
		driver.manage().window().maximize();
		driver.getTitle();
		// driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		star stobj=new star();
//		String name1="";
		stobj.Base();
//		stobj.deleteCookieNamedd(name1);
		
		
//	   	Api aobj=new Api();
//	   	aobj.cookie();

		Addcokkie adcobj = new Addcokkie();
		//adcobj.adcokkie();
//		adcobj.test();
//		String name1 = "T" ;
//		String name2 = "SN" ;
//	    adcobj.deleteCookieNamed(name1);
//	    adcobj.deleteCookieNamedd(name2);

//	   	LoginFlow Lfobj=new LoginFlow();
//	   	Lfobj.loginscreen();
//	   	Lfobj.profile();
//	   	Lfobj.EandO();
//	   	Lfobj.loginsurence();

//	   	Agent_Login Agobj=new Agent_Login();
//		Agobj.loginscreen();

//	   	Admin_Login adobj=new Admin_Login();
//     	adobj.Longin();
//     	adobj.viewlist();

//	   	Admin_Base aobj=new Admin_Base();
//	   	aobj.adminlogin();
//	   	
//	   	Create_Insurence_company ciobj=new Create_Insurence_company();
//	   	ciobj.createcompany();

//	   	Insurence inobj=new Insurence();
//	   	inobj.addinsu();

//	   	Test_Run runobj=new Test_Run();
//	   	runobj.dashboard();

//	   	Registration_Page rgobj=new Registration_Page();
//	   	rgobj.join();
//	   	rgobj.registrationAgent();

//	   	Registration_Multipleusers rgmobj=new Registration_Multipleusers();
//	   	rgmobj.Agentreg();

//	   	Agent_Registration_Form_TestCase obj2 = new Agent_Registration_Form_TestCase();
//      obj2.ClickHomeButton();
//		obj2.ClicJoin();
//		
//		

//	   	
//	   	
//	   	Admin_Login_Multipleusers almobj=new Admin_Login_Multipleusers();
//	   	almobj.AdminLogin();
//	   	
//	   	Thread.sleep(4000);
//	   	driver.quit();

//	   	Agent_Login_Multipleusers almobj= new Agent_Login_Multipleusers();
//	   	almobj.AgentLogin();
//		
//	   	All_Page_Links linkobj=new All_Page_Links();
//	   	linkobj.lin();

//	   	Broken_Links bkobj=new Broken_Links();
//	    bkobj.Brok(); 
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,500)", "");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,750)", "");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,1250)", "");
//		Thread.sleep(3000);
//		driver.quit();
	}
    
	public static WebDriver getDriver()
	{
		return driver;
	}
    
	public static java.util.List<WebElement> findElements(By tagName) {
		// TODO Auto-generated method stub
		return (java.util.List<WebElement>) driver;
	}
	
	
	
	
}

