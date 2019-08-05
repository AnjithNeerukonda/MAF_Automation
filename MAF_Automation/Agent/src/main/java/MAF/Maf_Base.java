package MAF;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import COM.MAF.TESTCASES.Agent_Registration_Form_TestCase;
import cucumber.api.java.Before;

public class Maf_Base {
	static WebDriver driver=null;
	
	static String browser="Chrome";
	static String url="http://localhost:4200/home";

	@Test
	public static void setupWeb() throws InterruptedException, IOException, AWTException {

			
			if(browser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
			    driver = new ChromeDriver();
			    driver.manage().window().maximize();
				driver.get(url);
				System.out.println(driver.getTitle());
				driver.manage().deleteAllCookies();
			}
			
			if(browser.equalsIgnoreCase("Firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		     	driver = new FirefoxDriver();
		     	driver.manage().window().maximize();
				driver.get(url);
				System.out.println(driver.getTitle());
				driver.manage().deleteAllCookies();
				
			}
			
	
	  	
		

		    
		// Agent_tasks agobj=new Agent_tasks();
		// agobj.mypromations();
		// agobj.promations();

		// REGISTRATION METHODS

//		    Registration_Page rgobj=new Registration_Page();
//		   	rgobj.join();
//		   	rgobj.registrationAgent();
//		    listdropdown objli=new listdropdown();
//		    objli.list3();

		// Content_testing cobj=new Content_testing();
		// cobj.content();
		// cobj.compare();
		// cobj.pagesource();

		// LOGIN METHODS

//		    LoginFlow Lfobj=new LoginFlow();
//	    	Lfobj.loginscreen();
//		    Lfobj.profile();
//			Lfobj.EandO();
//			Lfobj.loginsurence();

//		    Agent_Login Agobj=new Agent_Login();
//			Agobj.loginscreen();

//		    Agent_Login_Multipleusers almobj= new Agent_Login_Multipleusers();
//		   	almobj.AgentLogin();

//		    Insurence inobj=new Insurence();
//		   	inobj.addinsu();
//		   	
//		   	Agent_Commissions_List aclobj=new Agent_Commissions_List();
//		   	aclobj.commission();

//		    Multi_Log_insu lobj=new Multi_Log_insu();
//	    	lobj.Loginsurence();

		// ADMIN METHODS

		    Admin_Login adobj=new Admin_Login();
	     	adobj.Longin();
//	     	adobj.viewlist();

//	     	Changepassword chobj=new Changepassword();
//	     	chobj.changepswd();

//			Admin_Login_Multipleusers almobj=new Admin_Login_Multipleusers();
//		   	almobj.AdminLogin();

//			Create_Insurence_company ciobj=new Create_Insurence_company();
//		   	ciobj.createcompany();

//		    Agent_Policies_List alobj=new Agent_Policies_List();
//		   	alobj.search();
//			alobj.download();
//		    alobj.date();		   
//		   	alobj.upload();

//		    Roles robj=new Roles();
//			robj.roles();
//			robj.manageuser();

		// OTHER METHODS

//		    All_Page_Links linkobj=new All_Page_Links();
//		   	linkobj.lin();

		// Demo dobj=new Demo();

		// dobj.Test();

//    	number nuobj=new number();
//    	nuobj.num();

//		star stobj=new star();
//		String name1="";
//		stobj.Base();
//		stobj.deleteCookieNamedd(name1);

//	   	Api aobj=new Api(); 
//	   	aobj.cookie();

//		Addcokkie adcobj = new Addcokkie();
//		adcobj.adcokkie();
//		adcobj.test();
//		String name1 = "T";
//		String name2 = "SN";
//	    adcobj.deleteCookieNamed(name1);
//	    adcobj.deleteCookieNamedd(name2);

//	   	Admin_Login adobj=new Admin_Login();
//     	adobj.Longin();
//     	adobj.viewlist();

		// Agent policieslist
//		
//	     	Admin_Base aobj=new Admin_Base();
//	     	aobj.adminlogin();	

//	   	Insurence inobj=new Insurence();
//	   	inobj.addinsu();

//	   	Test_Run runobj=new Test_Run();
//	   	runobj.dashboard();

//	   	Registration_Multipleusers rgmobj=new Registration_Multipleusers();
//	   	rgmobj.Agentreg();

//	   	Agent_Registration_Form_TestCase obj2 = new Agent_Registration_Form_TestCase();
//      obj2.ClickHomeButton();
//		obj2.ClicJoin();
//		

//	   	Thread.sleep(4000);
//	   	driver.quit();

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

	public static WebDriver getDriver() {
		return driver;
	}

	public static java.util.List<WebElement> findElements(By tagName) {

		return (java.util.List<WebElement>) driver;
	}

}
