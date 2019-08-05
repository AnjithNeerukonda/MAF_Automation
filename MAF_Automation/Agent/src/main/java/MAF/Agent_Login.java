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

	public Agent_Login() {
		PageFactory.initElements(Maf_Base.getDriver(), this);
	}

	@FindBy(xpath = "//a[contains(text(),'Agent Login')]")
	public WebElement Loginbutton;

	@FindBy(xpath = "//input[@id='agentId']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;

	@FindBy(xpath = "//button[@class='btn btn-info fw btn-round btn-lg btn-block mb-3']")
	public WebElement Login;

	@FindBy(xpath = "//*[@id=\"collapseExample\"]/ul/li/a/p")
	public WebElement logout;

	@FindBy(xpath = "/html/body/app-root/app-root/app-layout/section/app-login/div/div/div[2]/div/div")
	public WebElement ajaxmessage;

	@FindBy(xpath = "//*[@id=\"signUpModalID\"]/div/div/div/form/div[1]/div/div")
	public WebElement usernameajax;
    
	@FindBy(xpath = "//*[@id=\"signUpModalID\"]/div/div/div/form/div[2]/div[2]/div")
	public WebElement Passwordajax;
    
	@FindBy(xpath = "/html/body/div/div/div[3]/button[1]")
	public WebElement ok;

	public void loginscreen() throws InterruptedException, IOException {

		try {

			Loginbutton.click();
			Thread.sleep(3000);
			username.sendKeys("AAA14");
			Thread.sleep(3000);
			Password.sendKeys("Jjbytes@123");
			Thread.sleep(3000);
			Login.click();
			Thread.sleep(3000);
			
			// ok.click();
			// Maf_Base.getDriver().switchTo().alert().accept();

		} 
		catch (Exception e) 
		{
			// Takes the screenshot when test fails
			File scrFile = ((TakesScreenshot) Maf_Base.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:\\screenshots\\failure.png"));
			Thread.sleep(3000);
		}
        ok.isDisplayed();
        
        
        
        
		
		
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
		//Login.click();
		//login.isdisplayed();
		//Login.isPresent();
		
//		}	

	}
}
