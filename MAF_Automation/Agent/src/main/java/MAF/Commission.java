package MAF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Commission {
	
	
	WebDriver driver;

	
	@BeforeTest
	public void main() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("http://localhost:4200/home");
    	driver.manage().window().maximize();
    	
    	WebElement Loginbutton=driver.findElement(By.xpath("//a[contains(text(),'Agent Login')]"));
    	Loginbutton.click();
    	Thread.sleep(3000);
    	WebElement username=driver.findElement(By.xpath("//input[@id='agentId']"));
    	username.sendKeys("AAA14");
    	Thread.sleep(3000);
    	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
    	Password.sendKeys("Jjbytes@123");
    	Thread.sleep(3000);
    	WebElement Login=driver.findElement(By.xpath("//button[@class='btn btn-info fw btn-round btn-lg btn-block mb-3']"));
    	Login.click();
    	Thread.sleep(7000);
    	WebElement lev=driver.findElement(By.xpath("//p[contains(text(),'Levels Hierarchy')]"));
		lev.click();
		Thread.sleep(7000);
		//WebElement tab=driver.findElement(By.xpath("//div[@class='main-content']//div[2]//div[1]//div[2]//ul[2]"));
		List<WebElement> Commissiontable= driver.findElements(By.xpath("//div[@class='main-content']//div[2]//div[1]//div[2]"));
		System.out.println("Headers in table are below:");
		System.out.println("Total headers found: "+Commissiontable.size());
		for(WebElement tab1:Commissiontable)
		{
			System.out.println(tab1.getText());
		}
		Thread.sleep(5000);
		driver.close();
		
		
		
//		tab.getText();
//		Thread.sleep(5000);
    	
	}
	
	

}
