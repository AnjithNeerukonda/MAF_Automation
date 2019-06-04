package MAF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Insurence_company {
	
	public Create_Insurence_company()
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	
	@FindBy(css=".active > a:nth-child(1) > p:nth-child(2)")
	public WebElement company;
	
	@FindBy(css="#companyName")
	public WebElement companyname;
	
	@FindBy(css=".ng2-tags-container")
	public WebElement tag;
	
	@FindBy(css="#address")
	public WebElement Address;
	
	@FindBy(css="#city")
	public WebElement city;
	
	@FindBy(css="#state")
	public WebElement state;
	
	@FindBy(css="#country")
	public WebElement country;
	
	@FindBy(css="span.btn > input:nth-child(1)")
	public WebElement file;
	
	@FindBy(css="div.card-footer:nth-child(20) > button:nth-child(1)")
    public WebElement submit;	
	
	public void createcompany() throws InterruptedException {
		
		//Maf_Base.getDriver().manage().timeouts().implicitlyWait( 4, TimeUnit.SECONDS);
		Thread.sleep(4000);
		company.click();
		Thread.sleep(4000);
	    companyname.sendKeys("LIC Insurence");
	   // tag.click();
	    tag.sendKeys("tag1");
	    tag.sendKeys(Keys.ENTER);
	    Address.sendKeys("adress1");
	    city.sendKeys("bangalore");
	    state.sendKeys("karanataka");
	    country.sendKeys("india");
	    file.sendKeys("D:\\Re_sources\\logo.jpg");
	    submit.click();
	    
	    
		
	}
	

}
