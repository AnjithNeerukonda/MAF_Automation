package MAF;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agent_Policies_List {
	
	public Agent_Policies_List() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	 JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/app-sidebar/div/div[2]/ul/li[5]")
	public WebElement agentlist;
	
	@FindBy(css=".m-l")
    public WebElement search;	
	
	@FindBy(css="button.dropdown-item:nth-child(2)")
	public WebElement dropdown;
	
	@FindBy(css=".remove-filter")
	public WebElement filter;
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-agent-policies/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/input")
	public WebElement Fromdate;
	
	@FindBy(css="div.ngb-dp-week:nth-child(2) > div:nth-child(2) > div:nth-child(1)")
	public WebElement date;
	
	@FindBy(css=".arrows-1_cloud-download-93")
	public WebElement downloadcsv;
	
	
	public void search() throws InterruptedException {
		Thread.sleep(4000);
		agentlist.click();
		Thread.sleep(3000);
		search.sendKeys("AAA13");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		
	}
//	public boolean isRegistered(String patientID) {
//	    for(WebElement row : table.findElements(By.tagName("tr"))) {
//	        if(row.getText().contains(patientID)) {
//	            return true;
//	        }
//	    }
//	    return false;
//	}

	public void download() throws InterruptedException {
		
		downloadcsv.click();
		Thread.sleep(3000);
		filter.click();
		
		
		
	}

	public void date() {
		
		
	}

	public void upload() {
		
		
	}
	
	

}
