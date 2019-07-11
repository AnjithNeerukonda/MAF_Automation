package MAF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Commission_List {

	WebDriver driver;

	@BeforeTest
	public void list() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();

		WebElement Loginbutton = driver.findElement(By.xpath("//a[contains(text(),'Admin Login')]"));
		Loginbutton.click();

		Thread.sleep(3000);

		WebElement username = driver.findElement(By.xpath("//input[@id='emailId']"));
		username.sendKeys("jitesh@jjbytes.com");
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("jjbytes@123");
		Thread.sleep(3000);
		WebElement Login = driver
				.findElement(By.xpath("//button[@class='fw btn btn-info btn-round btn-lg btn-block mb-3']"));
		Login.click();
		Thread.sleep(7000);
		WebElement lev = driver.findElement(By.xpath("//p[contains(text(),'Agent Policies List')]"));
		lev.click();
		Thread.sleep(5000);
		WebElement str1 = driver.findElement(By.xpath("//td[contains(text(),'POLICY80')]"));
		str1.getText();
		Thread.sleep(5000);
		WebElement str2 = driver.findElement(By.xpath("//td[contains(text(),'POLICY79')]"));
		str2.getText();
		Thread.sleep(5000);
		if (str1 == str2) {

			System.out.println("Same");

		} else {
			List<WebElement> Commissiontable = driver.findElements(By.xpath("//tr[1]//td[14]//button[1]"));
			System.out.println("Headers in table are below:");
			System.out.println("Total headers found: " + Commissiontable.size());
			for (WebElement tab1 : Commissiontable) {
				tab1.click();
				WebElement card = driver
						.findElement(By.xpath("//div[@class='main-panel']//div[1]//div[1]//div[1]//div[2]"));
				card.getText();
				Thread.sleep(4000);
				System.out.println("**********Next Agent Responsibility****");

			}
		}

	}

}
