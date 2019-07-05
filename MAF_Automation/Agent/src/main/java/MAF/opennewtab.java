package MAF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class opennewtab {
	
//	@FindBy(xpath="//p[contains(text(),'Submit A Case')]")
//	public WebElement submitacase;
	
	@FindBy(xpath="")
	WebElement viewinsc;
	
	@FindBy(xpath="")
	WebElement reports;
	
	@FindBy(xpath="")
	WebElement levels;
	
	@FindBy(xpath="")
	WebElement Agentprom;
	
	@FindBy(xpath="")
	WebElement Agentcomm;
	
	@FindBy(xpath="")
	WebElement logout;
	
	WebDriver driver;
	@BeforeTest
	public void base() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();
		WebElement agentbutton=driver.findElement(By.xpath("//a[contains(text(),'Agent Login')]"));
		agentbutton.click();
		Thread.sleep(3000);
		WebElement agentusr=driver.findElement(By.xpath("//input[@id='agentId']"));
		agentusr.sendKeys("AAA14");
		
		WebElement agentpswd=driver.findElement(By.xpath("//input[@id='password']"));
		agentpswd.sendKeys("Jjbytes@123");
		Thread.sleep(2000);
		WebElement subbtn=driver.findElement(By.xpath("//button[@class='btn btn-info fw btn-round btn-lg btn-block mb-3']"));
		subbtn.click();
		
	}
	@Test
	public void submitcase() throws InterruptedException {
		Thread.sleep(6000);
		WebElement submitacase=driver.findElement(By.xpath("//p[contains(text(),'Submit A Case')]"));
		submitacase.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
         WebDriverWait wait = new WebDriverWait(driver, 5);
         wait.until(ExpectedConditions.presenceOfElementLocated((By) submitacase)); 
         action.contextClick(submitacase).build().perform();
		
		
	}
    public void viewins() {
	 
 }
 
    public void levels() {
	 
 }
   public void agentprom() {
 	 
 }
 
   public void agentcommission() {
	 
	 
 }
}
