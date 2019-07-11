package MAF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestJen {

	@Test
	public void demo() throws InterruptedException {

//	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// JavascriptExecutor js = (JavascriptExecutor);
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();

//	        Thread.sleep(2000);
//	        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//	        driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);

		// driver.get("http://localhost:4200/maf-admin/admin-login");

//	        driver.findElement(By.xpath("//a[contains(text(),'Agent Login')]")).sendKeys(Keys.CONTROL +"t");
//	        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	        driver.switchTo().window(tabs.get(0));

//	        driver.manage().window().maximize();
//	        JavascriptExecutor jse = (JavascriptExecutor)driver;
//	        jse.executeScript("window.open()");
//	        driver.get("http://localhost:4200/maf-admin/admin-login");
//	        Thread.sleep(5000);
//	        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
//	        jse1.executeScript("window.open()");
//	        
//	        driver.get("http://localhost:4200/maf-agent/agent-login");
		// driver.switchTo().window(Parentwindow)

		// String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		// driver.findElement(By.linkText("/maf-agent")).sendKeys(selectLinkOpeninNewTab);

		// WebDriver driver = new ChromeDriver();
//	        driver.get("http://yahoo.com");  
//	        ((JavascriptExecutor)driver).executeScript("window.open()");
//	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	        driver.switchTo().window(tabs.get(1));
//	        driver.get("http://google.com");

		// baseUrl = "http://www.google.co.uk/";
		// driver.get(baseUrl);
		// driver.findElement(By.cssSelector("body.sidebar-mini:nth-child(2)
		// nav.navbar.navbar-expand-lg.bg-white div.container-fluid
		// div.collapse.navbar-collapse.offset-4 ul.navbar-nav li.nav-item:nth-child(6)
		// > a.nav-link")).sendKeys(Keys.CONTROL +"t");

//	        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	        driver.switchTo().window(tabs.get(1)); //switches to new tab
//	        driver.get("http://localhost:4200/maf-admin/admin-login");
//
//	        driver.switchTo().window(tabs.get(0)); // switch back to main screen        
//	        driver.get("https://www.news.google.com");

		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Admin Login')]"));
		action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build()
				.perform();
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> iter = winid.iterator();
		iter.next();
		String tab = iter.next();
		driver.switchTo().window(tab);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
