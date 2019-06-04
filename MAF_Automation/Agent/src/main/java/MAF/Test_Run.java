package MAF;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Run {


    WebDriver driver;

   // String URL = "https://1ivi50of6a.execute-api.eu-central-1.amazonaws.com/production";

    
    @FindBy(xpath="//*[@id=\"collapseExample\"]/ul/li[6]/a")
	public WebElement Loginbutton;
	
	@FindBy(xpath="//*[@id=\"agentId\"]")
    public WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-auth-layout/div/div/app-agentlogin/div/div/div/form/div/div[3]/button")
	public WebElement Login;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-agentlayout/div/app-sidebar/div/div[2]/ul/li[2]/a/i")
	public WebElement insurence;
	
    @BeforeTest
   public void Setup() throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	  
       driver = new FirefoxDriver();
        driver.manage().window().maximize();
       driver.get("https://1ivi50of6a.execute-api.eu-central-1.amazonaws.com/production/home");
   
    	
     	//driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS); 
    	
     	 Loginbutton.click();
     	Thread.sleep(3000);
     	username.sendKeys("AAA13");
     	Thread.sleep(3000);
     	Password.sendKeys("DS75JB8be");
     	Thread.sleep(3000);
     	Login.click();
     	Thread.sleep(3000);
     	insurence.click();
     	 
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
//    	if(wait.until(ExpectedConditions.alertIsPresent())==null)
//    	    System.out.println("alert was not present");
//    	else
//    		 System.out.println("alert was present");
//    		username.sendKeys("anjith");
//    	    Password.sendKeys("anjith@123");
//    	    Login.click();
//    		Maf_Base.getDriver().switchTo().alert().accept();
    	   
    }

}
    	 
//    	 @Test
//    	 public void Test() throws IOException
//    	 {
//    	 try
//    	 {
//    	  driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home");
//    	  
//    	  driver.findElement(By.xpath("//*[@id=\\\"navbar-collapse-1\\\"]/ul/li[5]/a")).click();
//    	  username.sendKeys("Anjith");
//    	  Password.sendKeys("anjith@123");
//    	  Login.click();
//    	 
//    	
//    	  
//    	 }
//    	 catch(Exception e)
//    	 {
//    	  //Takes the screenshot  when test fails
//    	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    	     FileUtils.copyFile(scrFile, new File("D:\\screenshots\\failure.png"));
//    	   
//    	  }
//    	 }
//}
//    @Test
//    public void rightClickTest() throws InterruptedException {
//    	
//    	
//    	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//       	driver.findElement(By.linkText("URL")).sendKeys(selectLinkOpeninNewTab);
//         
//    	
//    }
	
    	
    	
//        driver.navigate().to(URL);
    	
    	
//    	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//    	driver.findElement(By.linkText("URL")).sendKeys(selectLinkOpeninNewTab);
    	
    	
  
//        Thread.sleep(3000);
//        By locator = By.xpath("//*[@id=\\\"navbar-collapse-1\\\"]/ul/li[5]/a");
//       // WebDriverWait wait = new WebDriverWait(driver, 5);
//       // wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
//        WebElement element=driver.findElement(locator);
//        rightClick(element);
//        Thread.sleep(3000);
//        WebElement elementEdit =driver.findElement(By.id("navbar-collapse"));
//        elementEdit.click();
//        Alert alert=driver.switchTo().alert();
//        String textEdit = alert.getText();
//        Assert.assertEquals(textEdit, "clicked: edit", "Failed to click on Edit link");
//    }
//
//    public void rightClick(WebElement element) {
//        try {
//            Actions action = new Actions(driver).contextClick(element);
//            action.build().perform();
//
//            System.out.println("Sucessfully Right clicked on the element");
//        } catch (StaleElementReferenceException e) {
//            System.out.println("Element is not attached to the page document "
//                    + e.getStackTrace());
//        } catch (NoSuchElementException e) {
//            System.out.println("Element " + element + " was not found in DOM "
//                    + e.getStackTrace());
//        } catch (Exception e) {
//            System.out.println("Element " + element + " was not clickable "
//                    + e.getStackTrace());
//        }
//    }
//
//    @AfterClass
//    public void tearDown() {
//       // driver.quit();
//    	System.out.println("Test Passed");
// }
    	
        
//	   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
//	   	driver = new ChromeDriver();
//	   	
//		driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home");
//		
//		Thread.sleep(3000);
//		WebElement elementOpen = driver.findElement(By.xpath("//*[@id=\\\"navbar-collapse-1\\\"]/ul/li[5]/a"));
//		Actions oAction = new Actions(driver);
//		oAction.moveToElement(elementOpen);
//		oAction.contextClick(elementOpen).build().perform();  /* this will perform right click */
//		 /*This will select menu after right click */
//		elementOpen.click();
	   	
	   //	WebElement productLink= driver.findElement(By.linkText("/production/home\""));
	   	//Actions action= new Actions(driver);
	   	//action.contextClick(productLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	   
//	   	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//	   	driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);

//	   	
//	   	String baseUrl = "http://www.google.co.in";
//	    driver.get(baseUrl);
//	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//
//	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	    driver.switchTo().window(tabs.get(1)); //switches to new tab
//	    driver.get("https://www.facebook.com");
//
//	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
//	    driver.get("https://www.news.google.com");
	   	
	   	
	   	
	   	
	   	
	   	//String urlLink="http://gmail.com";
//	  	driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home");
//	   	driver.get("https://mail.google.com/");
//	  	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//	  	driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
//	  	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//	  	driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[5]/a")).sendKeys(selectLinkOpeninNewTab);
	  	
//	  	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//	  	driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	  	
	  	
	   	
//	   	String parent=driver.getWindowHandle();
//	   	Set<String>s1=driver.getWindowHandles();
//	   	Iterator<String> I1= s1.iterator();
//	   	while(I1.hasNext())
//	   	{
//	   	  String child_window=I1.next();
//	   	  if(!parent.equals(child_window))
//	   	  {
//	   	    driver.switchTo().window(child_window);
//	   	    System.out.println(driver.switchTo().window(child_window).getTitle());
//	   	    driver.close();
//	   	  }
//	   	}
//	   	driver.switchTo().window(parent);
//	   	System.out.println(driver.switchTo().window(parent).getTitle());
//	   	
//	   	
//	   	driver.get("http://google.com");
//	    String windowHandle = driver.getWindowHandle();
//	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//	    ArrayList tabs = new ArrayList (driver.getWindowHandles());
//	    System.out.println(tabs.size());
//	    driver.switchTo().window((String) tabs.get(0)); 
//	    
//	    driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home");
	    
	    
	   	

