package com.MAF_Automation.Stepdefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import com.MAF_Automation.Base_Class;




public class Registration_Page
{ 
      
		public Registration_Page()
   		 {
   		   PageFactory.initElements(Base_Class.getDriver(), this); 
   		   Base_Class.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES); 
   		 }
         
   		 @FindBy(linkText="Home")
   		  WebElement HomeButton;
   		 
   		 @FindBy(xpath="//*[@id=\"myCarousel\"]/div/div/div/div/div/div[1]/div/button")
   		  WebElement joinus;
   		 
   		 @FindBy(id="sponserId") 
   		 WebElement sponserId;
   		  
         @FindBy(xpath="//input[@id='f_name']")	
         WebElement firstName;

         @FindBy(xpath="//input[@id='l_name']")
         WebElement lastName;

         @FindBy(xpath="//input[@id='ssnNumber_name']")
         WebElement ssnNumber_name;
   	
         @FindBy(xpath="//select[@id='dLabelpersnl']")
         WebElement genderSelection;
         
         @FindBy(xpath="//select[@id='dLabelpersnl']/option[2]")
         WebElement  optionMale;
   	     
         @FindBy(xpath="//input[@id='phoneNo']")
         WebElement PhoneNumber;
         
         @FindBy(xpath="//input[@id='emailId']")
         WebElement emailId;
         
         @FindBy(xpath="//input[@id='password']")
         WebElement Password;

   	     @FindBy(xpath="//input[@id='confirmpassword']")
   	     WebElement confirmpassword;

   	     @FindBy(xpath="//input[@id='residentSuitApartment']")
   	     WebElement residentSuitApartment;

   	     @FindBy(xpath="//input[@id='residentCity']")
   	     WebElement residentCity;
   	     
   	     @FindBy(xpath="//input[@id='residentCountry']")
   	     WebElement residentCountry;
   	     
   	     @FindBy(xpath="//input[@id='residentState']")
   	     WebElement residentState;

         @FindBy(xpath="//input[@id='residentZipcode']")
         WebElement residentZipcode;
         
         @FindBy(xpath="//textarea[@formcontrolname='residentAddress']")
         WebElement residentAddress;

         @FindBy(xpath="//div[16][@class='row  p-l-15']/label/span")
         WebElement checkboxOne;
   	
         @FindBy(xpath="//form/div[17]/label/span")
         WebElement CheckTwo;
 

         @FindBy(xpath="//form/div[18]/label/span")
         WebElement CheckThree;

   	     @FindBy(xpath="//button[@class='btn btn-default btn-lg submit-btn']")
   	     WebElement Submitbtn;  
   	        	     
   		 @FindBy(xpath="//h3[text()='Register Successfully !']")
   		 WebElement RegistrationsuccessMsg;
   		 
   		 @FindBy(xpath="//a[@class='proceedlink' and text()='Proceed']")
   		 WebElement ProceedBtn;
   		 
   		 @FindBy(xpath="//td[text()='Jayanthi']")
   		 WebElement defaultUserName;
   		 
   		
   		 public void HomeButtonClicked()
   		 {
   			 System.out.println("Wellcome ClickHome POM");
   			 HomeButton.click();
   			 HomeButton.click();
   		 } 
   		 
   		 public void join()
   		 {
   			 System.out.println("Wellcome ClickHome POM");
   			 joinus.click();
   		 } 
   		 
   		 public void ClickSubmitbtn() throws InterruptedException
   		 {
   			Thread.sleep(300);
   			Submitbtn.click(); 
   		 }
   			
   		 
   		 public void registrationAgent()
   		 {
   			 try
   			 {
   			   JavascriptExecutor js = (JavascriptExecutor)Base_Class.getDriver();
   			   js.executeScript("scrollBy(0,500)");
   			   
   			    sponserId.click();	
   			    sponserId.sendKeys("122");
   				firstName.sendKeys("Nagaraj");
   	   			lastName.sendKeys("Lakshatti");
   	   			ssnNumber_name.sendKeys("1010");
   	   			genderSelection.click();
   	   		    optionMale.click();
   	   			PhoneNumber.sendKeys("8123839200");
   	   		    emailId.sendKeys("nagaraj.lakshatti11@gmail.com");
   	   			Password.sendKeys("Nagaraj@12");
   	   			confirmpassword.sendKeys("Nagaraj@12");
   	   			residentSuitApartment.sendKeys("No 15");
   	   			residentCity.sendKeys("Bengalore");
   	   			residentCountry.sendKeys("India");
   	   		    residentState.sendKeys("Karnataka");
   	   			residentZipcode.sendKeys("560036");
   	   			residentAddress.sendKeys("Bengalore");
   	   		
			    js.executeScript("scrollBy(0,100)");
			    Thread.sleep(300);
			    
   	   			checkboxOne.click();
   	   			CheckTwo.click();
   	   		    CheckThree.click();
   	   			
   	   		    Thread.sleep(300);
   	   			Submitbtn.click();
   	   			
   	   			Assert.assertEquals("Register Successfully !", "Register Successfully !");
   	   		    ProceedBtn.click();
   	   		   
   	   	        Thread.sleep(300);
   	   		    js.executeScript("scrollBy(0,-500)");
   	   		    Assert.assertEquals(defaultUserName, defaultUserName); 
   	   		    
   			 }
   			 catch (Exception e) 
   			 {
				e.printStackTrace();
			 }
   		 }	 
}

