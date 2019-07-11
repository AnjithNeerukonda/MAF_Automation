package MAF;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import io.restassured.RestAssured;
import okhttp3.Response;

public class API_Cookie {

	private static final String String1 = null;
	WebDriver driver;
	public static JavascriptExecutor js;

	@Test
	public void cokkie() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = ((JavascriptExecutor) driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();
		Thread.sleep(3000);
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
		Thread.sleep(3000);

		String sItem = getItemFromLocalStorage("Key");
		// String1 sItem1 = getItemFromLocalStorage("value");
		System.out.println(sItem);
	}

	public static String getItemFromLocalStorage(String Value) {
		return (String) js.executeScript(String.format("return window.localStorage.getItem('adminIdToken');", Value));
	}

	@Test(priority = 2)
	public void session() throws InterruptedException {

		WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);
		LocalStorage localStorage = webStorage.getLocalStorage();
		System.out.println("MAF_LocalStorage" + localStorage);
		SessionStorage sessionStorage = webStorage.getSessionStorage();
		System.out.println("MAF_LocalStorage" + sessionStorage);
		Thread.sleep(4000);
		((ChromeDriver) driver).getSessionStorage().clear();
		((ChromeDriver) driver).getLocalStorage().clear();
		Thread.sleep(4000);
		driver.navigate().refresh();
	}

}
