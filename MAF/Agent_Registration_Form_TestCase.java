package MAF;



import org.openqa.selenium.WebDriver;


import MAF.Agent_Registration_Form;

public class Agent_Registration_Form_TestCase
{
	
	//private static  WebDriver driver;
	Agent_Registration_Form Agentobj = new Agent_Registration_Form();
	
//	public Agent_Registration_Form_TestCase()
//	{	
//		this.driver = MafBase.getDriver();
//	}
	
  
	  public void ClickHomeButton()
	   {
		   System.out.println("Wellcome ClickHome test case");
		   Agentobj.HomeButtonClicked();
	   }
	   
	   public void ClicJoin() throws InterruptedException
	   {
		   Agentobj.join();
	   }
  
}

