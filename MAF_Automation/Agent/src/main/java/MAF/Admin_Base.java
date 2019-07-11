package MAF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Base {

	public Admin_Base() {
		PageFactory.initElements(Maf_Base.getDriver(), this);
	}

	@FindBy(xpath = "/html/body/app-root/app-root/app-layout/section/app-home/app-header/nav/div/div[2]/ul/li[5]/a")
	public WebElement admin_button;

	@FindBy(id = "emailId")
	public WebElement admin_username;

	@FindBy(css = "#password")
	public WebElement admin_Pswd;

	@FindBy(xpath = "/html/body/app-root/app-root/app-auth-layout/div/div/app-adminlogin/div/div/div/form/div/div[3]/button")
	public WebElement admin_submit;

	void adminlogin() {
		admin_button.click();
		// Thread.sleep(3000);
		admin_username.sendKeys("jitesh@jjbytes.com");

		admin_Pswd.sendKeys("jjbytes@123");
		// Thread.sleep(3000);
		admin_submit.click();
	}

}
