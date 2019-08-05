package MAF;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class SSL {

	WebDriver driver;
	
	String browser="chrome";
	
	public void crf() {
        
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver = new FirefoxDriver();
		FirefoxOptions fo = new FirefoxOptions();
		// accept the certificate
		fo.setAcceptInsecureCerts(true);
		// open the browser
		fo.setHeadless(true);
		fo.getProfile();
		fo.getBinaryOrNull();
		driver.get("http://maflife.com");
		String str = driver.getTitle();
		System.out.println("Title=" + str);
		System.out.println("ssl verification");
		fo.setAcceptInsecureCerts(true);
		}
	@Test
	public void table() 
	{       
		     
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    System.setProperty("webdriver.Firefox.driver","C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		    driver= new FirefoxDriver();
		    driver.getTitle();
		    driver.navigate().forward();
		    driver.navigate().back();
		  if(browser.equalsIgnoreCase("firefox"))
		  {   
			  driver=new FirefoxDriver();
			  System.setProperty("webdriver,gecko.driver", "path");  
		  }
		  if(browser.equalsIgnoreCase("chrome"))
		  {   
			  driver=new ChromeDriver();
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
			  driver.getCurrentUrl();
			  driver.getWindowHandle();
			  driver.getTitle();
			  driver.switchTo();
			  System.out.println("MAF_Admin");
			  System.out.println("Main Page"); 
			  System.out.println("Policy");
			  driver.getTitle();
			  driver.getPageSource();
			  driver.manage().getCookieNamed(null);
			  driver.manage().equals(getClass());
			  
		   }
		  
//	    	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
//	     	driver = new FirefoxDriver();
		//  driver.get("file://Downloads/Max Agent Financial.html");
		 //   System.out.println(driver.getTitle());
		    driver.manage().notifyAll();
		    driver.manage().getCookies();   
		    List<WebElement>mylist=driver.findElements(By.xpath("//body//tbody//tr[1]"));
			
			List<String>wishlist=new ArrayList();
			System.out.println(mylist);
			for(int i=0; i<=10; i++) 
			{
				System.out.println("List Started");
				System.out.println(mylist.get(i).getText());
				wishlist.add(mylist.get(i).getText());
				System.out.println(mylist.get(i).getText());
				System.out.println("New List");
			}
		    
	}
	
	
	public void arry() {
		
		List<WebElement>mylist=driver.findElements(By.xpath(""));
		
		List<String>wishlist=new ArrayList();
		
		for(int i=0; i<=mylist.size(); i++)
		{
		
			wishlist.add(mylist.get(i).getText());
			System.out.println(mylist.get(i).getText());
		}
		}
		
	}

