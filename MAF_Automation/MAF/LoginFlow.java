package MAF;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFlow {
	
	WebDriverWait wait;
	public LoginFlow()
		 {
		   PageFactory.initElements(Maf_Base.getDriver(), this); 
		 }
	
	@FindBy(xpath="//*[@id=\"collapseExample\"]/ul/li[6]/a")
	public WebElement Loginbutton;
	
	@FindBy(xpath="//*[@id=\"agentId\"]")
    public WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-auth-layout/div/div/app-agentlogin/div/div/div/form/div/div[3]/button")
	public WebElement Login;
	
	@FindBy(xpath="//*[@id=\"collapseExample\"]/ul/li/a/p")
	public WebElement logout;
	
	
	@FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-login/div/div/div[2]/div/div")
    public WebElement ajaxmessage;
	
	
	@FindBy(xpath="//*[@id=\"signUpModalID\"]/div/div/div/form/div[1]/div/div")
	public WebElement usernameajax;
	
	@FindBy(xpath="//*[@id=\"signUpModalID\"]/div/div/div/form/div[2]/div[2]/div")
	public WebElement Passwordajax;
	
	@FindBy(xpath="/html/body/div/div/div[3]/button[1]")
	public WebElement ok;
	
	
	@FindBy(css=".design_app")
	public WebElement profilebutton;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-agentlayout/div/div/app-agentprofile/div[2]/div[1]/div[2]/div/div[2]/div[1]/span/img")
	public WebElement image;
	
	@FindBy(css="button.btn-file")
	public WebElement uploadimage;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-agentlayout/div/div/app-agentprofile/div[2]/div[2]/div/button/a")
	public WebElement download;
	
	@FindBy(css=".objects_diamond")
	public WebElement ED;
	
	
	
	
	
	public void loginscreen() throws InterruptedException, IOException {
		
		try {
		
		Loginbutton.click();
		Thread.sleep(3000);
		username.sendKeys("Anjith");
		Thread.sleep(3000);
		Password.sendKeys("password");
		Thread.sleep(3000);
		Login.click();
		Thread.sleep(3000);
		//ok.click();
		//Maf_Base.getDriver().switchTo().alert().accept();
		}
		catch(Exception e)
   	 {
   	  //Takes the screenshot  when test fails
   	     File scrFile = ((TakesScreenshot)Maf_Base.getDriver()).getScreenshotAs(OutputType.FILE);
   	     FileUtils.copyFile(scrFile, new File("D:\\screenshots\\failure.png"));
   	   
   	  }
		if(ok.isDisplayed())
		{
			ok.click();
			username.clear();
			Thread.sleep(2000);
			Password.clear();
			username.sendKeys("AAA14");
			Thread.sleep(2000);
			Password.sendKeys("XPRgw5c6u");
			Thread.sleep(2000);
			Login.click();
			
			
			
		}	
		
		
	
	}




	public void profile() throws InterruptedException, AWTException {
		 JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
		Thread.sleep(3000);
		profilebutton.click();
		Thread.sleep(4000);
		uploadimage.click();
		Thread.sleep(2000);
		//uploadimage.sendKeys("D:\\\\Pictures\\\\Acc bugs.PNG");
		//image.sendKeys("D:\\Pictures\\Acc bugs.PNG");
		//Thread.sleep(4000);
//Maf_Base.getDriver().quit();	
		
		//driver.findElementByXPath("locate the file upload button']").click();
	    Thread.sleep(10000);
	    StringSelection stringSelection = new StringSelection("D:\\Pictures\\Acc bugs.PNG");
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	   Robot robot = new Robot();
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_V);
	   robot.keyRelease(KeyEvent.VK_V);
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   Thread.sleep(5000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(3000);
	   ok.click();
	   
	   Thread.sleep(3000);
	   
	   js.executeScript("scrollBy(0,500)");
	   download.click();
	   
	   
		
		
		
	}
	public void EandO() throws InterruptedException {
		
		Thread.sleep(3000);
		ED.click();
		Thread.sleep(3000);
		
	}
	
	public void loginsurence() throws InterruptedException {
		
		Insurence re=new Insurence();
		re.addinsu();
		
	}
	
	



}
