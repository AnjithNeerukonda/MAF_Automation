package MAF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class graph extends Maf_Base {

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void testParameterWithXML() throws InterruptedException {
		Registration_Page robj = new Registration_Page();
		driver.get("http://localhost:4200/home");
		robj.joinus.click();
		robj.sponserId.click();
		robj.sponserId.sendKeys("12222");
		robj.firstName.sendKeys("Agent1");
		robj.lastName.sendKeys("MAf");
		robj.ssnNumber_name.sendKeys("1010");
		Select sec = new Select(robj.genderSelection);
		sec.selectByIndex(1);
		robj.PhoneNumber.sendKeys("8123839200");
		robj.emailId.sendKeys("anjith.jjbytes@gmail.com");
		// js.executeScript("scrollBy(0,100)");
		robj.residentSuitApartment.sendKeys("lakeview");
		Thread.sleep(3000);
		Select sec1 = new Select(robj.state);
		sec1.selectByIndex(2);
		Thread.sleep(2000);
		Select sec2 = new Select(robj.residentCity);
		sec2.selectByIndex(3);
		// js.executeScript("scrollBy(0,100)");
		robj.residentZipcode.sendKeys("560036");
		robj.residentAddress.sendKeys("Bengalore");
		// js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		robj.checkboxOne.click();
		Thread.sleep(3000);
		robj.CheckTwo.click();
		Thread.sleep(3000);
		robj.CheckThree.click();
		Thread.sleep(3000);
		// robj.Submitbtn.click();

	}

}