package MAF;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Agent_Login {
	
	WebDriverWait wait;
	public Agent_Login() 
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
		
//		if(ok.isDisplayed())
//		{
//			ok.click();
//			username.clear();
//			Thread.sleep(2000);
//			Password.clear();
//			username.sendKeys("AAA13");
//			Thread.sleep(2000);
//			Password.sendKeys("@njith2008");
//			Thread.sleep(2000);
//			Login.click();
//			
//			
//			
//		}	
	
	}

	
	}

	
