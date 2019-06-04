package MAF;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;






public class Registration_Page
{ 
      
		public Registration_Page()
   		 {
   		   PageFactory.initElements(Maf_Base.getDriver(), this); 
   		    
   		  Maf_Base.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
   		 }
         
//   		  @FindBy(linkText="Home")
//   		  WebElement HomeButton;
   		 
   		  @FindBy(css=".btn")
   		  WebElement joinus;
   		 
   		 
   		 
   		 @FindBy(id="sponserId") 
   		 WebElement sponserId;
   		  
         @FindBy(xpath="//input[@id='f_name']")	
         WebElement firstName;

         @FindBy(xpath="//input[@id='l_name']")
         WebElement lastName;

         @FindBy(xpath="//input[@id='ssnNumber_name']")
         WebElement ssnNumber_name;
   	
         @FindBy(xpath="//*[@id=\"dLabelpersnl1\"]")
         WebElement genderSelection;
         
         @FindBy(css="option.textclr:nth-child(2)")
         WebElement  optionMale;
   	     
         @FindBy(xpath="//input[@id='phoneNo']")
         WebElement PhoneNumber;
         
         @FindBy(xpath="//input[@id='emailId']")
         WebElement emailId;
         
   	     @FindBy(xpath="//div[@class='col-md-8']//input[@id='f_name']")
   	     WebElement residentSuitApartment;
         
          @FindBy(xpath="//*[@id=\"dLabelpersnl3\"]")
          public  WebElement state;
         
  	     @FindBy(xpath="//*[@id=\"dLabelpersnl4\"]")
   	     WebElement residentCity;
  	     
         @FindBy(xpath="//input[@id='residentZipcode']")
         WebElement residentZipcode;
         
         @FindBy(xpath="//textarea[@formcontrolname='residentAddress']")
         WebElement residentAddress;
         
         @FindBy(css="div.row:nth-child(16) > label:nth-child(1) > span:nth-child(3)")
         WebElement checkboxOne;
   
         @FindBy(css="div.row:nth-child(17) > label:nth-child(1) > span:nth-child(3)")
         WebElement CheckTwo;
 
         @FindBy(css="div.row:nth-child(18) > label:nth-child(1) > span:nth-child(3)")
         WebElement CheckThree;

   	     @FindBy(xpath="//button[@class='btn btn-default btn-lg submit-btn']")
   	     WebElement Submitbtn;  
   	        	    
   		 @FindBy(id="action-bar-btn-continue")
   		 WebElement contnue;
   		 
   		 @FindBy(xpath="/html")
   		 WebElement html;
   		 
   		 @FindBy(id="comments-tooltip-btn-ok")
		 WebElement ok;
   		  
  		 @FindBy(css=".tab-content-wrapper")
   		 WebElement sign;
  		 
  		 
  		 @FindBy(xpath="//*[@id=\"action-bar-btn-finish\"]")
         WebElement finish;
  		 
  		 @FindBy(xpath="//input[@id='dateofbirth_name']")
  		 WebElement DOB;
  		 
//  		 @FindBy(xpath="/html/body/div/div[2]/div[1]/div[1]")
//           WebElement paypal;
  		 
   		 @FindBy(css="div.paypal-button:nth-child(2)")
   		 WebElement paypal; 
   		 
   		 @FindBy(xpath="//div[@class='col-md-5']//input[@id='f_name']")
   		 WebElement address;
   		 
//   		 @FindBy(id="action-bar-btn-continue")
//   		 WebElement cont;
//   		 
//   		
//   		 
//   		@FindBy(className="tab-content-wrapper")
//  		 WebElement signin;
//   		 
//   		
//   		 
//   		 @FindBy(xpath="//*[@id=\"paypal-animation-content\"]/div[1]/div[1]")
//   		 WebElement paypal;
   		     
//   		 @FindBy(xpath="//*[@id=\"dLabelpersnl\"]")
//   		 WebElement country;
   		     
//   		 public void HomeButtonClicked()
//   		 {
//   			 System.out.println("Wellcome ClickHome POM");
//   			 HomeButton.click();
//   			 HomeButton.click();
//   		 } 
   		 
   		 public void join() throws InterruptedException
   		 {
   			 System.out.println("Wellcome ClickHome POM");
   			 Thread.sleep(3000);
   			
   			 
   			 joinus.click();
   			 
   			
   			 
   		 } 
   		 
 
   		 public void registrationAgent()
   		 {
   			 try
   			 {
   				 
   			    JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
   			    js.executeScript("scrollBy(0,500)");
   			    
   			    
   			    sponserId.click();	
   			    sponserId.sendKeys("AAA15");
   			    
   			    
   				firstName.sendKeys("Agentfive");
   	   			lastName.sendKeys("testing");
   	   		    Select sec=new Select(genderSelection);
	   			sec.selectByIndex(1);
	   			DOB.sendKeys("30/05/1996");
	   			PhoneNumber.sendKeys("9541070911");
	   			ssnNumber_name.sendKeys("1010");
   	   		    emailId.sendKeys("testingone294@gmail.com");
   	   		    js.executeScript("scrollBy(0,100)");
   	   		    
   	   		    
   	   			residentSuitApartment.sendKeys("lakeview");
   	   			Thread.sleep(3000);
   	   			//address.sendKeys("usa");
   	   		    Select sec1=new Select(state);
	   			sec1.selectByIndex(4);
	   			Thread.sleep(2000);
	   			Select sec2=new Select(residentCity);
	   			sec2.selectByIndex(3);
	   			js.executeScript("scrollBy(0,100)");
	   			residentZipcode.sendKeys("560036");
	   			//residentAddress.sendKeys("Bengalore");
	   			js.executeScript("scrollBy(0,300)");
			    Thread.sleep(3000);
   	   			checkboxOne.click();
   	   		    Thread.sleep(3000);
   	   			CheckTwo.click();
   	   		    Thread.sleep(3000);
   	   		    CheckThree.click();
   	   		    Thread.sleep(3000);
  	   			Submitbtn.click();
	   			Thread.sleep(5000);
	   			contnue.click();
	   			ok.click();
	   			Thread.sleep(3000);
	   			sign.click();
	   			Thread.sleep(3000);
	   			finish.click();
	   			Thread.sleep(5000);
	   			js.executeScript("scrollBy(0,400)");
	   			Thread.sleep(3000);
	   			paypal.click();
	   			
	   			

   	   		
   	
   	   			
   	   			


   	   			
//   	   			
//   	   		    js.executeScript("scrollBy(0,5000)");
//   	   		    Assert.assertEquals(defaultUserName, defaultUserName); 
//   	   		    paypal.click();
//   	   		    Thread.sleep(5000);
   	   		    
   	   		    
   			 }
   			 catch (Exception e) 
   			 {
				e.printStackTrace();
			 }
   		 }	 
}


