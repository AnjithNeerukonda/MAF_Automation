package MAF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Insurence {

	public Insurence() {
		PageFactory.initElements(Maf_Base.getDriver(), this);
	}

	Agent_Login agob = new Agent_Login();

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
	@FindBy(xpath = "//p[contains(text(),'Submit A Case')]")
	public WebElement insurencebtn;

	@FindBy(xpath = "//*[@id=\"inscompanyname\"]")
	public WebElement inucompany;

	@FindBy(xpath = "//*[@id=\"inscompanyname\"]/option[4]")
	public WebElement pro;

	@FindBy(xpath = "//*[@id=\"product\"]")
	public WebElement product;

	@FindBy(xpath = "//*[@id=\"insuranceId\"]")
	public WebElement insid;

	@FindBy(xpath = "//*[@id=\"premiumfreq\"]")
	public WebElement freq;

	@FindBy(xpath = "//*[@id=\"premiumamount\"]")
	public WebElement amount;

	@FindBy(xpath = "/html/body/app-root/app-root/app-agentlayout/div/div/app-loginsurance/div[2]/div/div[1]/div/div[2]/form/div[6]/button")
	public WebElement submit;

	@FindBy(css = ".swal2-confirm")
	public WebElement ok;

	@FindBy(xpath = "//div[@class='main-panel']//li[2]//a[1]")
	public WebElement logout;

	@FindBy(css = ".btn-default")
	public WebElement log;
	
	@FindBy(xpath="//body//tbody//tr[1]")
	public WebElement policyid;

	
	@Test
	public void addinsu() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) Maf_Base.getDriver();
		Maf_Base.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//	agob.Loginbutton.click();
//	agob.username.sendKeys("AAA13");
//	agob.Password.sendKeys("DS75JB8be");
//	agob.Login.click();
		Thread.sleep(7000);
		insurencebtn.click();
		Thread.sleep(3000);
		inucompany.click();
	    inucompany.click();
//	    pro.click();
		Thread.sleep(3000);
		Select oSelect = new Select(inucompany);
		oSelect.selectByValue("Transamerica");
		Thread.sleep(3000);
		product.click();
		Select oSelect1 = new Select(product);
		oSelect1.selectByValue("ABC4");
		Thread.sleep(2000);
		insid.sendKeys("123345");
		Thread.sleep(2000);
		js.executeScript("scrollBy(0,400)");
	//	js.executeScript("scrollBy(0,500)");
		freq.click();	
		Select oSelect2 = new Select(freq);
		oSelect2.selectByValue("Monthly");
		Thread.sleep(3000);
		amount.sendKeys("100");
		submit.click();
		Thread.sleep(3000);
		ok.click();		
//		js.executeScript("scrollBy(0,-500)");
		Thread.sleep(5000);
		logout.click();
		Thread.sleep(3000);
	
		policyid.getText();
		Thread.sleep(3000);
		Maf_Base.getDriver().close();
		Thread.sleep(3000);
	    	
		// Thread.sleep(8000);
		// Maf_Base.getDriver().quit();
		// Maf_Base.getDriver().switchTo().alert().accept();
		// pro.click();
	    
	}

}
