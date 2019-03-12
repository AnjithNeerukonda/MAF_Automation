package MAF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Agent_Login {
	
	public Agent_Login() 
		 {
		   PageFactory.initElements(Maf_Base.getDriver(), this); 
		 }
	
	@FindBy(xpath="//*[@id=\"navbar-collapse-1\"]/ul/li[5]/a")
	public WebElement Loginbutton;
	
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-login/div/div/div/div/form/button")
	public WebElement Login;
	
//	public void Loginbutton() {
//		
//		Loginbutton.click();
//		
//	}
//public void username() {
//		
//	username.sendKeys("Anjith");
//		
//	}
//public void password() {
//	
//	Password.sendKeys("password");
//		
//	}
//public void loginb() {
//	
//
//	Login.click();
//		
//	}
	
	public void loginscreen() throws InterruptedException {
		
		Loginbutton.click();
		Thread.sleep(3000);
//		username.sendKeys("Anjith");
//		Thread.sleep(3000);
//		Password.sendKeys("password");
//		Thread.sleep(3000);
//		Login.click();
//		Thread.sleep(3000);
		
	}
	
	
	
	
	

}
