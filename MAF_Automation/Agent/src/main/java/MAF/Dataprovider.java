package MAF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	 private static WebDriver driver;
	@DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	           
	        return new Object[][] { { "AAA14", "Jjbytes@123" }, { "AAA15", "Jjbytes@123" }};
        	       
	  }
	 
	  @Test(dataProvider = "Authentication")
	 
	  public void test(String sUsername, String sPassword) throws InterruptedException {
	 
		   System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	      driver = new FirefoxDriver();
	   
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.manage().window().maximize();
	      Reporter.log("Launching the website");
			driver.get("http://localhost:4200/home");
			
	        Thread.sleep(3000);
	        
	      driver.findElement(By.xpath("//a[contains(text(),'Agent Login')]")).click();
	      Thread.sleep(3000);
	      // Argument passed will be used here as String Variable
	      Reporter.log("Username passed");
	      driver.findElement(By.xpath("//input[@id='agentId']")).sendKeys(sUsername);
	      Thread.sleep(3000);
	      Reporter.log("Password passed");
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sPassword);
	      Thread.sleep(3000);
	      Reporter.log("Click the button");
	      driver.findElement(By.xpath("//button[@class='btn btn-info fw btn-round btn-lg btn-block mb-3']")).click();
	      Thread.sleep(7000);
	      
	 
	      driver.quit();
	 
	  }
	 
}

