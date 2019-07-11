package MAF;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class failed_testcase_screenshot {

	WebDriver driver;

	// String URL =
	// "https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home";

	@FindBy(xpath = "//*[@id=\"agentId\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"passwor\"]")
	public WebElement Password;

	@FindBy(xpath = "//*[@id=\"signUpModalID\"]/div/div/div/form/button")
	public WebElement Login;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void Test() throws IOException {
		try {
			driver.get("https://l411w60rx3.execute-api.eu-central-1.amazonaws.com/production/home");

			driver.findElement(By.xpath("//*[@id=\\\"navbar-collapse-1\\\"]/ul/li[5]/a")).click();
			username.sendKeys("Anjith");
			Password.sendKeys("anjith@123");
			Login.click();

		} catch (Exception e) {
			// Takes the screenshot when test fails
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:\\screenshots\\failure.png"));

		}
	}
}
