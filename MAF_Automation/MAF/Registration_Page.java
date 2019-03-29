package MAF;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
         
//   		 @FindBy(linkText="Home")
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
   	
         @FindBy(xpath="//*[@id=\"dLabelpersnl\"]")
         WebElement genderSelection;
         
//         @FindBy(xpath="//select[@id='dLabelpersnl']/option[2]")
//         WebElement  optionMale;
   	     
         @FindBy(xpath="//input[@id='phoneNo']")
         WebElement PhoneNumber;
         
         @FindBy(xpath="//input[@id='emailId']")
         WebElement emailId;
         
         

   	     @FindBy(xpath="//*[@id=\"residentSuitApartment\"]")
   	     WebElement residentSuitApartment;

//         @FindBy(className="residentCountry")
//   		 WebElement country;
         
//         @FindBy(xpath="//*[@id=\"dLabelpersnl\"]/option[3]")
//        public  WebElement state;

//   	     @FindBy(xpath="//input[@id='residentCity']")
//   	     WebElement residentCity;
//   	     
//   	     @FindBy(xpath="//input[@id='residentCountry']")
//   	     WebElement residentCountry;
//   	     
//   	     @FindBy(xpath="//input[@id='residentState']")
//   	     WebElement residentState;
//
//         @FindBy(xpath="//input[@id='residentZipcode']")
//         WebElement residentZipcode;
//         
//         @FindBy(xpath="//textarea[@formcontrolname='residentAddress']")
//         WebElement residentAddress;
//         
//         
//
//         @FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-register/div[3]/div/div[3]/form/div[15]/label/span")
//         WebElement checkboxOne;
//   
//         @FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-register/div[3]/div/div[3]/form/div[16]/label/span")
//         WebElement CheckTwo;
// 
//         @FindBy(xpath="/html/body/app-root/app-root/app-layout/section/app-register/div[3]/div/div[3]/form/div[17]/label/span")
//         WebElement CheckThree;
//
//   	     @FindBy(xpath="//button[@class='btn btn-default btn-lg submit-btn']")
//   	     WebElement Submitbtn;  
   	        	     
//   		 @FindBy(xpath="//h3[text()='Register Successfully !']")
//   		 WebElement RegistrationsuccessMsg;
//   		 
//   		 @FindBy(xpath="//a[@class='proceedlink' and text()='Proceed']")
//   		 WebElement ProceedBtn;
//   		 
//   		 @FindBy(xpath="//td[text()='Nagaraj']")
//   		 WebElement defaultUserName;
   		 
//   		 @FindBy(xpath="//*[@id=\"paypal-animation-content\"]/div[1]/div[1]")
//   		 WebElement paypal;
   		 
//   		 @FindBy(id="action-bar-btn-continue")
//   		 WebElement cont;
//   		 
//   		 @FindBy(id="comments-tooltip-btn-ok")
//   		 WebElement ok;
//   		 
//   		@FindBy(className="tab-content-wrapper")
//  		 WebElement signin;
//   		 
//   		 @FindBy(xpath="//*[@id=\"action-bar-btn-finish\"]")
//         WebElement finish;
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
   		 
//   		 public void ClickSubmitbtn() throws InterruptedException
//   		 {
//   			Thread.sleep(300);
//   			Submitbtn.click(); 
//   		 }
   			
   		 
   		 public void registrationAgent()
   		 {
   			 try
   			 {
   			   JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
   			   js.executeScript("scrollBy(0,500)");
   			   
   			    sponserId.click();	
   			    sponserId.sendKeys("122");
   				firstName.sendKeys("Nagaraj");
   	   			lastName.sendKeys("Lakshatti");
   	   			ssnNumber_name.sendKeys("1010");
   	   			
//   	   			Select se0=new Select(genderSelection);
//   	   			se0.selectByVisibleText("Male");
//   	   			genderSelection.click();
//   	   		    optionMale.click();
   	   			PhoneNumber.sendKeys("8123839200");
   	   		    emailId.sendKeys("nagaraj.lakshatti11@gmail.com");
   	   			residentSuitApartment.sendKeys("lakeview");
   	   			Thread.sleep(3000);
//   	   			country.click();
   	   			Select se = new Select(Maf_Base.getDriver().findElement(By.cssSelector("div.row:nth-child(12) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1)")));
   	   			
   	   			//se.deselectByVisibleText("California");
   	   			//state.click();
   	   			//country.click();
   	   			//se.selectByIndex(4);
//   	   		Thread.sleep(3000);
//   	   	   Select se1 = new Select(city);
//  			se1.selectByIndex(3);
   	   		
   	   			
   	   			
   	   			
//   	   			residentCity.sendKeys("Bengalore");
//   	   			residentCountry.sendKeys("India");
//   	   		    residentState.sendKeys("Karnataka");
//   	   			residentZipcode.sendKeys("560036");
//   	   			residentAddress.sendKeys("Bengalore");
   	   		
			    js.executeScript("scrollBy(0,100)");
			    Thread.sleep(3000);
			    
//   	   			checkboxOne.click();
//   	   			CheckTwo.click();
//   	   		    CheckThree.click();
   	   			
   	   		    Thread.sleep(3000);
//   	   			Submitbtn.click();
   	   			
//   	   			Assert.assertEquals("Register Successfully !", "Register Successfully !");
//   	   		    ProceedBtn.click();
   	   		   
   	   		    
//   	   	        Thread.sleep(3000);
//   	   	        cont.click();
//   	   	  Thread.sleep(2000);
//   	   	        ok.click();
//   	   	  Thread.sleep(4000);
//   	   	  signin.click();
//   	   Thread.sleep(2000);
//   	   finish.click();
//   	Thread.sleep(2000);
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


