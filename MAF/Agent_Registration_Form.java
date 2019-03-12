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
   		 
   		 @FindBy(linkText="Home")
   		  WebElement HomeButton;
   		 
   		 @FindBy(xpath="//*[@id=\"myCarousel\"]/div/div/div/div/div/div[1]/div/button")
   		  WebElement joinus;
   		 
   		
   		 public void HomeButtonClicked()
   		 {
   			 System.out.println("Wellcome ClickHome POM");
   			 HomeButton.click();
   			 HomeButton.click();
   		 } 
   		 
   		 public void join() throws InterruptedException
   		 {
   			 System.out.println("Wellcome ClickHome POM");
   			 joinus.click();
   			 Thread.sleep(3000);
   			 
   		 } 
   		 
   		
}

