package MAF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class SSL {

	@Test
	public void crf() {

		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver = new FirefoxDriver();
		FirefoxOptions fo = new FirefoxOptions();
		// accept the certificate
		fo.setAcceptInsecureCerts(true);
		// open the browser
		fo.setHeadless(true);
		fo.getProfile();
		driver.get("http://maflife.com");
		String str = driver.getTitle();
		System.out.println("Title=" + str);
		System.out.println("");

	}

}
