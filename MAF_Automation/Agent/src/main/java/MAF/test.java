package MAF;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://localhost:4200/register");
		driver.manage().window().maximize();

		Thread.sleep(10000);
		driver.get("http://localhost:4200/register");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='f_name']")).sendKeys("!34345$656");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg submit-btn']")).click();
		Thread.sleep(5000);
		WebElement alert = driver.findElement(By.cssSelector(
				"body.sidebar-mini:nth-child(2) div.container.p-b-100.p-0-125:nth-child(3) div.col-md-12 div.row.padding-normal:nth-child(3) form.ng-invalid.ng-dirty.ng-touched div.row:nth-child(6) div.col-md-6:nth-child(1) div.form-group div.invalid-feedback:nth-child(4) > div:nth-child(1)"));
		String str = alert.getText();
		System.out.println(alert);
		if (str.equals("Only alphabets")) {
			System.out.println("Error displayed: First name Should not contain Special Characters");
			// driver.switchTo().alert().dismiss();
		} else {
			System.out.println("NotAccepted");
		}

//        driver.findElement(By.xpath("//input[@id='f_name']")).sendKeys("Anjith");
//        driver.findElement(By.id("//button[@class='btn btn-default btn-lg submit-btn']")).click();
//         if (alert.equals("First name Should not contain Special Characters")){
//                System.out.println("Error displayed: First name Should not contain Special Characters");
//               // driver.switchTo().alert().dismiss();
//            } else{
//                System.out.println("Accepted");
//            }
		driver.quit();
	}

}
