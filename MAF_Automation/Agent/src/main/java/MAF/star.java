package MAF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class star {
	
	public star() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	
	//public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[4]/div[2]/ul/li[3]/div/a")
	public WebElement sports;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[4]/div[2]/ul/li[3]/div/div/a[1]")
	public WebElement cricket;
	
	@FindBy(xpath="//*[@id= app]/div/div[2]/div/div[1v/div/div[2]/div/div/div/div/a/img")
	public WebElement match;
//	
//	@FindBy(xpath="")
//	public WebElement sports;
//	
	
	
	public void Base() throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.get("https://www.hotstar.com/");
		
	Thread.sleep(3000);
	Maf_Base.getDriver().manage().deleteAllCookies();
	Thread.sleep(240000);
	Actions action = new Actions(Maf_Base.getDriver());
	action.moveToElement(sports).moveToElement(cricket).click().build().perform();
	Maf_Base.getDriver().navigate().refresh();
	Thread.sleep(3000);
	Maf_Base.getDriver().manage().deleteAllCookies();
	Maf_Base.getDriver().navigate().refresh();
	Thread.sleep(240000);
	
	
	//
	//match.click();
		}
	
	
	    public void deleteCookieNamedd(String name1) throws InterruptedException{
        
        Maf_Base.getDriver().manage().deleteCookieNamed(name1);
        Thread.sleep(2000);
        Maf_Base.getDriver().navigate().refresh();
        }

}
