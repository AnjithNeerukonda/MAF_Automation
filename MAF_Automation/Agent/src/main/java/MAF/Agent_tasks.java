package MAF;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Agent_tasks {
	
	public Agent_tasks() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	
	@FindBy(xpath="//a[contains(text(),'Agent Login')]")
	public WebElement agentlogin;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-agentlayout/div/app-sidebar/div/div[2]/ul/li[6]")
	public WebElement AgentTasks;
	
	@FindBy(css="#ngb-tab-1")
    public WebElement Agentpromations;	
	
	@FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(7)")
	public WebElement status;
	
	@FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(11)")
	public WebElement processd;
	
	@FindBy(css=".navbar-nav > li:nth-child(2) > a:nth-child(1)")
	public WebElement logout;
	
	@FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(10)")
	public WebElement proceed;
	
	@FindBy(xpath="//*[@id=\"disclosureAccepted\"]")
	public WebElement checkbox;
	
	@FindBy(css=".continue-button-wrapper")
	public WebElement conti;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/section[3]/div/div[2]/div[4]/div/section/div/div[1]/div[4]/div/button/div/div/svg")
	public WebElement signin;
	
	@FindBy(xpath="//*[@id=\"action-bar-btn-finish\"]")
	public WebElement fnsh;
	
	Agent_Login li=new Agent_Login();
	@Test
	public void promations() throws InterruptedException {
	
		//List<WebElement> allElements=Maf_Base.getDriver().findElements(By.xpath("//body//app-sidebar//li"));
		//System.out.println("Size of List: "+allElements.size());
		//System.out.println("Element name"+allElements.indexOf(AgentTasks));
		
		
		
//		agentlogin.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//		Thread.sleep(3000);
//		agentlogin.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		Thread.sleep(3000);
		agentlogin.click();
		Thread.sleep(4000);
		li.username.sendKeys("AAA12");
		li.Password.sendKeys("Cric$2009");
		li.Login.click();
		Thread.sleep(7000);
		AgentTasks.click();
		Thread.sleep(3000);		
		Agentpromations.click();
	    Thread.sleep(3000);
		status.getText();
		
		if(processd.isEnabled()) {
			
			
			List<WebElement> dropdown_items = new ArrayList();
			dropdown_items = Maf_Base.getDriver().findElements(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(10)"));
			dropdown_items.get(0).click();
			dropdown_items.get(1).click();
			dropdown_items.get(2).click();
			
			processd.click();
			System.out.println("Proceed button is Enable");
			Thread.sleep(10000);
			conti.click();
			Thread.sleep(3000);
			signin.click();
			Thread.holdsLock(3000);
			fnsh.click();
			
			
			//logout.click();
			//Maf_Base.getDriver().close();
		}
		else {
			
			Thread.sleep(4000);
			
			logout.click();
			System.out.println("Proceed button is NotEnable");
			
		}
		
	}

	public void mypromations() throws InterruptedException {
		
		agentlogin.click();
		Thread.sleep(7000);
		AgentTasks.click();
		Thread.sleep(3000);
		proceed.click();
		li.username.sendKeys("AAA14");
		li.Password.sendKeys("Jjbytes@123");
		li.Login.click();
		Thread.sleep(7000);
		AgentTasks.click();
		Thread.sleep(3000);
		proceed.click();
		
	}
}
