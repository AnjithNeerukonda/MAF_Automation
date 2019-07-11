package MAF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class MultipleTest {

	public WebDriver driver;

	@BeforeTest
	@Parameters("myBrowser")
	public void getBrowser(String myBrowser) throws InterruptedException {

		if (System.getProperty("os.name").contains("Window")) {
			if (myBrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://localhost:4200/home");
				WebElement adminbutton = driver.findElement(By.xpath("//a[contains(text(),'Admin Login')]"));
				adminbutton.click();
				Thread.sleep(3000);
				WebElement username = driver.findElement(By.xpath("//input[@id='emailId']"));
				username.sendKeys("jitesh@jjbytes.com");
				Thread.sleep(1000);
				WebElement Pswd = driver.findElement(By.xpath("//input[@id='password']"));
				Pswd.sendKeys("jjbytes@123");
				Thread.sleep(2000);
				WebElement admin_submit = driver
						.findElement(By.xpath("//button[@class='fw btn btn-info btn-round btn-lg btn-block mb-3']"));
				admin_submit.click();
				Thread.sleep(4000);
				driver.navigate().back();
				Thread.sleep(4000);
				driver.navigate().forward();

			} else if (myBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				// Thread.sleep(3000);
				driver.get("http://localhost:4200/home");
				WebElement adminbutton = driver.findElement(By.xpath("//a[contains(text(),'Agent Login')]"));
				adminbutton.click();
				Thread.sleep(3000);
				WebElement agentusr = driver.findElement(By.xpath("//input[@id='agentId']"));
				agentusr.sendKeys("AAA14");

				WebElement agentpswd = driver.findElement(By.xpath("//input[@id='password']"));
				agentpswd.sendKeys("Jjbytes@123");
				Thread.sleep(2000);
				WebElement subbtn = driver
						.findElement(By.xpath("//button[@class='btn btn-info fw btn-round btn-lg btn-block mb-3']"));
				subbtn.click();
				Thread.sleep(4000);
				driver.navigate().back();
				Thread.sleep(4000);
				driver.navigate().forward();
				Thread.sleep(5000);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("-incognito");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				WebDriver chromedriver = new ChromeDriver(capabilities);
				chromedriver.manage().window().maximize();
				chromedriver.get("http://localhost:4200/maf-agent/agent-profile");
				Thread.sleep(3000);
				// driver.findElement(By.id("lst-ib")).sendKeys("Selenium");

			}
		}
	}
}