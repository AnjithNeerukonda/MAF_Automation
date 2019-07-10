package MAF;


import MAF.Agent_Registration_Form;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Agent_Registration_Form 
{ 
       
        	public Agent_Registration_Form() 
   		 {
   		   PageFactory.initElements(Maf_Base.getDriver(), this); 
   		 }
   		 
   		 @FindBy(xpath="//div[@class='col-md-6 showdesktop']//button[@class='btn btn-default btn-lg submit-btn m-t-60'][contains(text(),'Get Started')]")
   		public  WebElement getstarted;
   		 
   		 @FindBy(xpath="//input[@id='sponserId']")
   		public WebElement sponserId;
   		 
   		@FindBy(xpath="//div[@class='col-md-6']//input[@id='f_name']")
 		public  WebElement fname;
   		
   		@FindBy(xpath="//input[@id='l_name']")
 		public  WebElement lastname;
   		
   		@FindBy(xpath="//div[@class='col-md-6']//select[@class='form-control forDropSelect ng-untouched ng-pristine")
 		public   WebElement gender;
   		
//   		@FindBy(xpath="//input[@id='dateofbirth_name']")
// 		 public WebElement dob;
//   		
//   		@FindBy(xpath="//input[@id='dateofbirth_name']")
//		 public WebElement dob;
//   		
//   		@FindBy(xpath="//input[@id='dateofbirth_name']")
//		 public WebElement dob;
   		
   		
//   		@FindBy(xpath="//input[@id='dateofbirth_name']")
//		 public WebElement dob;
//   		 
   		
//   		 public void HomeButtonClicked()
//   		 {
//   			 System.out.println("Wellcome ClickHome POM");
//   			 HomeButton.click();
//   			 HomeButton.click();
//   		 } 
//   		 
//   		 public void join() throws InterruptedException
//   		 {
//   			 System.out.println("Wellcome ClickHome POM");
//   			 joinus.click();
//   			 Thread.sleep(3000);
//   			 
//   		 } 
//   		 
   		
}

