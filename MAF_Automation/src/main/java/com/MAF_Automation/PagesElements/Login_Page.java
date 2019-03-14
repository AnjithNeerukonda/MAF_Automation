package com.MAF_Automation.PagesElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MAF_Automation.Base_Class;

public class Login_Page {
	
	
 
	
	
	
	@FindBy(xpath="//*[@id=\"navbar-collapse-1\"]/ul/li[5]/a")
	public WebElement Loginbutton;
	
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-login/div/div/div/div/form/button")
	public WebElement Login;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-login/div/div/div[2]/div/div")
   public WebElement ajaxmessage;

	

}
