package MAF;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class listdropdown {

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-root[1]/app-layout[1]/section[1]/app-register[1]/div[2]/div[1]/div[3]/form[1]/div[12]/div[2]/div[1]/div[1]/select[1]")
	public WebElement state;

	@FindBy(css = "body.sidebar-mini:nth-child(2) div.container.p-b-100.p-0-125:nth-child(3) div.col-md-12 div.row:n")
	public WebElement stat;

	@Test
	public void list3() throws InterruptedException {

		// Select se=new
		// Select((WebElement)Maf_Base.getDriver().findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-root[1]/app-layout[1]/section[1]/app-register[1]/div[2]/div[1]/div[3]/form[1]/div[13]/div[1]/div[1]/div[1]/select[1]")));
		Thread.sleep(3000);
		Select se = new Select((WebElement) Maf_Base.getDriver().findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-root[1]/app-layout[1]/section[1]/app-register[1]/div[2]/div[1]/div[3]/form[1]/div[12]/div[2]/div[1]/div[1]/select[1]")));
		se.selectByIndex(5);
		Thread.sleep(2000);
		// System.out.println(se.getFirstSelectedOption());
		// String arr[]= {"Conway", "Jonesboro",};
		Select se1 = new Select((WebElement) Maf_Base.getDriver().findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-root[1]/app-layout[1]/section[1]/app-register[1]/div[2]/div[1]/div[3]/form[1]/div[13]/div[1]/div[1]/div[1]/select[1]")));
		Thread.sleep(5000);
		List<WebElement> dropdown = se1.getOptions();
		System.out.println(dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText());

			// Assert.assertEquals(arr[i], dropdown.get(i).getText());
		}
		Thread.sleep(3000);
		// System.out.println("Verified");
		Maf_Base.getDriver().close();

	}

}
