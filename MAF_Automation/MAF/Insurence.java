package MAF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Insurence {
	
	
	public Insurence() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }

	Agent_Login agob=new Agent_Login();
			
	
	
	
	
//@FindBy(xpath="//*[@id=\"collapseExample\"]/ul/li[6]/a")
//public WebElement Loginbutton;
//
//@FindBy(xpath="//*[@id=\"agentId\"]")
//public WebElement username;
//
//@FindBy(xpath="//*[@id=\"password\"]")
//public WebElement Password;
//
//@FindBy(xpath="/html/body/app-root/app-root/app-auth-layout/div/div/app-agentlogin/div/div/div/form/div/div[3]/button")
//public WebElement Login;
//
@FindBy(css="ul.nav:nth-child(2) > li:nth-child(4) > a:nth-child(1) > p:nth-child(2)")
public WebElement insurencebtn;

@FindBy(xpath="//*[@id=\"inscompanyname\"]")
public WebElement inucompany;

@FindBy(xpath="//*[@id=\"inscompanyname\"]/option[4]")
public WebElement pro;

@FindBy(xpath="//*[@id=\"product\"]")
public WebElement product;

@FindBy(xpath="//*[@id=\"insuranceid\"]")
public WebElement insid;

@FindBy(xpath="//*[@id=\"premiumfreq\"]")
public WebElement freq;

@FindBy(xpath="//*[@id=\"premiumamount\"]")
public WebElement amount;

@FindBy(xpath="/html/body/app-root/app-root/app-agentlayout/div/div/app-loginsurance/div[2]/div/div[1]/div/div[2]/form/div[6]/button")
public WebElement submit;

@FindBy(css=".navbar-nav > li:nth-child(1) > a:nth-child(1) > p:nth-child(2)")
public WebElement logout;

@Test
public void addinsu() throws InterruptedException {
	
	 JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
	Maf_Base.getDriver().manage().timeouts().implicitlyWait( 3, TimeUnit.SECONDS); 
	
//	agob.Loginbutton.click();
//	agob.username.sendKeys("AAA13");
//	agob.Password.sendKeys("DS75JB8be");
//	agob.Login.click();
	//Thread.sleep(3000);
	insurencebtn.click();
	Thread.sleep(3000);
	inucompany.click();
//	pro.click();
    Thread.sleep(3000);
    Select oSelect = new Select(inucompany);
    oSelect.selectByValue("Trans America");
    Thread.sleep(3000);
    product.click();
    Select oSelect1 = new Select(product);
    oSelect1.selectByValue("Tr4");
    
    Thread.sleep(2000);
    insid.sendKeys("123345");
    Thread.sleep(2000);
    js.executeScript("scrollBy(0,400)");
    freq.click();
    Select oSelect2 = new Select(freq);
    oSelect2.selectByValue("Monthly");
    Thread.sleep(3000);
    amount.sendKeys("100"); 
    submit.click();
    Thread.sleep(3000);
    js.executeScript("scrollBy(0,-500)");
    Thread.sleep(3000);
    logout.click();
   // Thread.sleep(8000);
   // Maf_Base.getDriver().quit();
    
    
   // Maf_Base.getDriver().switchTo().alert().accept();
    
    
    
    
	//pro.click();
	
	
}



	
	

}
