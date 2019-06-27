package MAF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Content_testing {
	
	@Test
	public void content() throws InterruptedException {
		
		
		String arry[]= {"Our mission is to provide all our agents with a quality work environment, as it allows everyone to make a more positive impact on the financial future of their clients. To ensure this, we have created a comprehensive support system for agents and their associates."};
		WebElement text=Maf_Base.getDriver().findElement(By.xpath("/html/body/app-root/app-root/app-layout/section/app-home/div[2]/div/h3"));
		System.out.println(text.getText());	
		Assert.assertEquals(arry,text.getText());
		System.out.println("Text is verified");
		Thread.sleep(3000);
		Maf_Base.getDriver().close();
		
	}
	
	@Test
	public void compare() {

		WebElement strvalue = Maf_Base.getDriver().findElement(By.xpath("/html/body/app-root/app-root/app-layout/section/app-home/div[2]/div/h3"));
		//WebElement strvalue1=Maf_Base.getDriver().findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-root[1]/app-layout[1]/section[1]/app-home[1]/div[3]/div[1]/div[3]/div[2]"));
        String expected = "Our mission is to provide all our agents with a quality work environment, as it allows everyone to make a more positive impact on the financial future of their clients. To ensure this, we have created a comprehensive support system for agents and their associates.";
          String expected1="Max Agent Financial is here to provide full capabilities for"
          		+ " agents who are willing and able to offer financial services nationwide,"
          		+ " such as living benefits, insurance plans for business owners, "
          		+ "long-term financial plans for families, and more!";
		String actual = strvalue.getText();
        System.out.println(actual);
  try {
	  
    if(expected.equals(actual)){
    	
        System.out.println("Pass");
    }
       
    else {
        System.out.println("Fail");
        System.out.println(expected);
        
    }
    }
    catch(Exception e) {
    	//System.out.println(expected1 + "fail");
    }
    
//  if(expected==null) {
//	  //return actual;
//	  System.out.println(actual);
//  }
//  if (actual==null) {
//	  System.out.println(expected);
//	  
//  }
//    int cmp= indexofDifference(expected, actual);
//    if(cmp==-1) {
//    	
//    	
//    }
//    return actual.substring(cmp);
    Maf_Base.getDriver().close();
	}
	
	private int indexofDifference(String expected, String actual) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
	public void pagesource() {
		Maf_Base.getDriver().getPageSource();
		//System.out.println(pagesource());
		
	}
 
}
