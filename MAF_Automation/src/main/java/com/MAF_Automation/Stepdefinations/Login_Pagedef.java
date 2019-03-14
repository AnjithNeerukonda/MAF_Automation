package com.MAF_Automation.Stepdefinations;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import com.MAF_Automation.PagesElements.*;

import com.MAF_Automation.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Pagedef 
{
	
	
	//WebDriverWait wait;
	     public Login_Pagedef() 
		 {
		   PageFactory.initElements(Base_Class.getDriver(), this); 
		 }
	     
	    
	
	@FindBy(xpath="//*[@id=\"navbar-collapse-1\"]/ul/li[5]/a")
	public WebElement Loginbutton;
	
	@FindBy(xpath="//*[@id=\"agentId\"]")
    public WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath="//*[@id=\"signUpModalID\"]/div/div/div/form/button")
	public WebElement Login;
	
	
	
	
//	@FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-login/div/div/div[2]/div/div")
//   public WebElement ajaxmessage;
	
	
	
	
	@BeforeMethod
	@Given("^: I am on maf.com$")
	public void i_am_on_maf_com() throws InterruptedException  {
		
		Loginbutton.click();
		Thread.sleep(3000);
	   
	}

	@When("^: I click on Home page$")
	public void i_click_on_Home_page() throws InterruptedException  {
		
		
		username.sendKeys(" AAA13");
		Thread.sleep(3000);
	   
	}

	@Then("^: I should see Joinus button$")
	public void i_should_see_Joinus_button() throws Throwable {
		
	Password.sendKeys("d4R5qhaag");;
		Thread.sleep(3000);
	    
	}

	@Then("^: Click joinus button$")
	public void click_joinus_button() throws Throwable {
		Login.click();
		Thread.sleep(3000);
		
//		Base_Class.getDriver().switchTo().alert().accept();
		
	   
	}

	@Then("^: Fill that form with valid details$")
	public boolean fill_that_form_with_valid_details() throws Throwable {
		try 
	    { 
	    	Base_Class.getDriver().switchTo().alert().accept();
	    	username.clear();
			Thread.sleep(2000);
			Password.clear();
			username.sendKeys("Ravi Kumar");
			Thread.sleep(2000);
			Password.sendKeys("Anjith@123");
			Thread.sleep(2000);
			Login.click();
			Thread.sleep(3000);
			Base_Class.getDriver().quit();
	        return true; 
	        
	    }   
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   
		
		
		
		
		
		
		
//		if(ajaxmessage.isDisplayed())
//		{
//			
//			username.clear();
//			Thread.sleep(2000);
//			Password.clear();
//			username.sendKeys("Ravi Kumar");
//			Thread.sleep(2000);
//			Password.sendKeys("Anjith@123");
//			Thread.sleep(2000);
//			Login.click();
//			WebDriver driver = null;
//			driver.switchTo().alert().accept();
//			
//		}
//		else
//		{
//
//			System.out.println("test passed");
//		}
		
	    
	}

	

}
