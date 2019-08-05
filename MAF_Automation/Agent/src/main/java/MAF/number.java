package MAF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class number {

	public number() {
		PageFactory.initElements(Maf_Base.getDriver(), this);
	}
	
	@FindBy(xpath = "/html/body/app-root/app-root/app-agentlayout/div/app-sidebar/div/div[2]/ul/li[5]/a/i")
	public WebElement viewinsurence;

	@FindBy(css = ".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(8)")
	public WebElement amount;

//	@FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)")
//	public  total;

	public void num() throws InterruptedException {
		Thread.sleep(3000);
		// viewinsurence.click();
		amount.getAttribute("ngcontent-c5");
		Thread.sleep(3000);
		Thread.sleep(3000);
		amount.getClass();
		amount.click();
		amount.clear();
		amount.getClass();
		amount.notifyAll();
		amount.isSelected();
		amount.isDisplayed();
		amount.hashCode();
		
	}
}
