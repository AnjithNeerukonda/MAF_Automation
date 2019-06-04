package MAF;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Roles {
	
	
	public   Roles()
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	 JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
	Admin_Login lgobj=new Admin_Login();
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/app-sidebar/div/div[2]/ul/li[6]")
	public WebElement roles;
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/app-sidebar/div/div[2]/ul/li[7]")
	public WebElement adminuser;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-rolieslist/div[2]/div/div/div/div[1]/div/div[2]/button")
	public WebElement createroles;
	
	@FindBy(css="#roleName")
	public WebElement rolename;
	
	@FindBy(css="#Description")
	public WebElement dis;
	
	@FindBy(css="div.row:nth-child(2) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(8) > div:nth-child(1) > input:nth-child(1)")
	public WebElement Agent;
	
	@FindBy(css="div.row:nth-child(2) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(5) > div:nth-child(1) > input:nth-child(1)")
	public WebElement rejct;
	
	@FindBy(css="div.row:nth-child(2) > div:nth-child(1) > ul:nth-child(7) > li:nth-child(3) > div:nth-child(1) > input:nth-child(1)")
	public WebElement downlaodcsv;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-createroles/div[2]/div/div/div/div[2]/form/div[3]/div/button")
	public WebElement submit;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-manageuserslist/div[2]/div/div/div/div[1]/div/div[2]/button")
	public WebElement createuser;
	
	@FindBy(css="#Name")
	public WebElement name;
	
	@FindBy(css="#RoleId")
	public WebElement role;
	
	@FindBy(css="#EmailId")
	public WebElement email;
	
	@FindBy(css="#PhoneNumber")
	public WebElement phone;
	
	@FindBy(css="/html/body/app-root/app-root/app-adminlayout/div/div/app-createusers/div[2]/div/div/div/div[2]/form/div[5]/button")
	public WebElement submit1;
	
	
	
	
	
	public void roles() throws InterruptedException {
		
		lgobj.admin_button.click();
		Thread.sleep(3000);
		lgobj.admin_username.sendKeys("jitesh@jjbytes.com");
		lgobj.admin_Pswd.sendKeys("jjbytes@123");
		lgobj.admin_submit.click();
		Thread.sleep(3000);
		roles.click();
		Thread.sleep(3000);
		createroles.click();
		Thread.sleep(3000);
		rolename.sendKeys("AF Analyst");
		dis.sendKeys("Testing");
		Thread.sleep(3000);
		 js.executeScript("scrollBy(0,400)");
		Agent.click();
		//Thread.sleep(3000);
		//rejct.click();
		Thread.sleep(3000);
		downlaodcsv.click();
		Thread.sleep(3000);
		//submit.click();
		Thread.sleep(3000);
		
	}


	public void manageuser() {
		
		adminuser.click();
		createuser.click();
		name.sendKeys("Anjith");
		Select se=new Select(role);
		se.selectByValue("ROLE3");
		email.sendKeys("anjith.jjbytes@gmail.com");
		phone.sendKeys("8765432888");
		submit.click();
		
		
		
	}
	
	
	

}
