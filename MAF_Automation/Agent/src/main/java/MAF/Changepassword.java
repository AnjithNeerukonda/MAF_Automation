package MAF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Changepassword {

	@FindBy(css = "//*[@id=\"collapseExample\"]/ul[2]/li[1]/a/p")
	WebElement changepassword;

	@FindBy(xpath = "//*[@id=\"OldPassword\"]")
	WebElement oldpassword;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement newpassword;

	@FindBy(xpath = "//*[@id=\"confirmPassword\"]")
	WebElement confirmpassword;

	@FindBy(xpath = "/html/body/app-root/app-root/app-adminlayout/div/div/app-changepassword/div[2]/div/div/div[2]/form/div[4]/div/div/button")
	WebElement submit;

	@FindBy(xpath = "/html/body/div/div/div[3]/button[1]")
	WebElement ok;

	public void changepswd() throws InterruptedException {

		// Admin_Login aobj=new Admin_Login();

		try {

//		aobj.admin_button.click();
//		aobj.admin_username.sendKeys("jitesh@jjbytes.com");
//		aobj.admin_Pswd.sendKeys("jjbytes@123");
//		Thread.sleep(3000);
//		aobj.admin_submit.click();
			
			Thread.sleep(3000);
			Thread.sleep(3000);
			changepassword.click();
			Thread.sleep(3000);
			oldpassword.sendKeys("Anjith2@@8");
			Thread.sleep(3000);
			newpassword.sendKeys("Anjith2@@8");
			Thread.sleep(3000);
			confirmpassword.sendKeys("Anjith2@08");
			Thread.sleep(3000);
			submit.click();
			
			if (ok.isDisplayed()) 
			{
				ok.click();
				oldpassword.clear();
				newpassword.clear();
				confirmpassword.clear();
				confirmpassword.notifyAll();
				
				
				
			}
		} 
		
		catch (Exception NoSuchElementException)
		{

			Maf_Base.getDriver().close();
		}

	}
}
