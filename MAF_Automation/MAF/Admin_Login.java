package MAF;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Admin_Login {
	
	public Admin_Login() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	
	
	@FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-home/app-header/nav/div/div[2]/ul/li[5]/a")
	public WebElement admin_button;
	
	@FindBy(id="emailId")
	public WebElement admin_username;
	
	@FindBy(css="#password")
	public WebElement admin_Pswd;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-auth-layout/div/div/app-adminlogin/div/div/div/form/div/div[3]/button")
	public WebElement admin_submit;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/app-sidebar/div/div[2]/ul/li[2]/a/p")
	public WebElement Agentlist;
	
//	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-agentslist/div[2]/div/div/div/div[2]/div/table/tbody")
//	public WebElement tablebody;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-agentslist/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button")
	public WebElement viewbutton;
	
	@FindBy(css=".table > tbody:nth-child(2)")
	public WebElement table;
	
	@FindBy(css=".btn-success")
	public WebElement approve;
	
	@FindBy(css="button.btn:nth-child(2)")
	public WebElement reject;
	
	@FindBy(css=".swal2-confirm")
	public WebElement okbttn;
	
	@FindBy(css=".col-md-12 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > button:nth-child(1)")
	public WebElement associate;
	
	@FindBy(css="textarea.form-control")
	public WebElement rejreason;
	
	@FindBy(css="div.form-group:nth-child(7) > button:nth-child(1)")
	public WebElement submit;
	
	@FindBy(css=".close")
	public WebElement clse;
	
//	@FindBy(css=".swal2-confirm")
//	public WebElement Rej;
	
	
	@Test
	public void Longin() throws InterruptedException {
		
		Maf_Base.getDriver().manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
		admin_button.click();
		//Thread.sleep(3000);
		admin_username.sendKeys("jitesh@jjbytes.com");
		
		admin_Pswd.sendKeys("jjbytes@123");
		//Thread.sleep(3000);
		admin_submit.click();
		//Maf_Base.getDriver().switchTo().alert().accept();
		Thread.sleep(3000);
		Agentlist.click();
		Thread.sleep(3000);
//		viewbutton.click();
//		js.executeScript("scrollBy(0,500)");
//		Thread.sleep(4000);
//		approve.click();
//		//reject.click();
//	
//		
//		
//		if(submit.isDisplayed()) {
//			
//			
//			rejreason.sendKeys("reason");
//			Thread.sleep(3000);
//			submit.click();
//			Thread.sleep(3000);
//			okbttn.click();
//			clse.click();
//			Maf_Base.getDriver().navigate().back();
//			
////			okbttn.click();
////			Thread.sleep(3000);
////			js.executeScript("scrollBy(0,500)");
////			associate.click();
////			Thread.sleep(3000);
////			okbttn.click();
//		}
//		else {
//			
//			okbttn.click();
//			Thread.sleep(3000);
//			js.executeScript("scrollBy(0,500)");
//			associate.click();
//			Thread.sleep(3000);
//			okbttn.click();
//			//reject.click();
////			Thread.sleep(3000);
////			rejreason.sendKeys("reason");
////			Thread.sleep(3000);
////			submit.click();
////			Thread.sleep(3000);
////			okbttn.click();
//			
//			
//		}
//		}
		
		
	}

	public void viewlist() throws InterruptedException {
			
		Thread.sleep(2000);
		Agentlist.click();
		Thread.sleep(3000);
		
//		for(int i=1; i>8;i++) {
//			WebElement str=Maf_Base.getDriver().findElement(By.name("View"));
//			Thread.sleep(3000);
//			str.click();
//			Thread.sleep(3000);
//			Maf_Base.getDriver().navigate().back();
//		
//			
//			
//		}
		
		List<WebElement> le= (List<WebElement>) table.findElements(By.className("ng-star-inserted"));
		System.out.println("table data=" +le.size());
		
		//List<WebElement> le= (List<WebElement>) table.findElements(By.cssSelector("tr.ng-star-inserted:nth-child"));
		//System.out.println("table data=" +le.size());
//		for(int i=1;i>8;i++)
//		{
//			table.findElements(By.cssSelector("tr.ng-star-inserted:nth-child("+i+")")).get(i);
//			System.out.println(i);
//			
//		}
		
		
	}

}
