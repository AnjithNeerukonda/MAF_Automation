package MAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Agent_Promations_list {

	WebDriver driver;

	File scr;
	XSSFWorkbook wb;
	Sheet sheet1;
	FileInputStream fis;

	@Test
	public void Agenttask() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();
		WebElement Loginbutton = driver.findElement(By.xpath("//a[contains(text(),'Agent Login')]"));
		Loginbutton.click();
		Thread.sleep(3000);
		scr = new File("D:\\MAF_Project\\commission.xlsx");
		fis = new FileInputStream(scr);
		wb = new XSSFWorkbook(fis);
		String data0;

		try {
			sheet1 = wb.getSheetAt(0);
			int rowCount = sheet1.getLastRowNum();
			for (int row = 0; row <= rowCount; row++) {

				WebElement username = driver.findElement(By.xpath("//input[@id='agentId']"));
				String user = sheet1.getRow(row).getCell(0).getStringCellValue();
				username.sendKeys(user);
				Thread.sleep(1000);

				WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
				String pwd = sheet1.getRow(row).getCell(1).getStringCellValue();
				Password.sendKeys(pwd);
				Thread.sleep(3000);
				WebElement Login = driver
						.findElement(By.xpath("//button[@class='btn btn-info fw btn-round btn-lg btn-block mb-3']"));
				Login.click();
				System.out.println("***Agent Login****");
				Thread.sleep(3000);
				Thread.sleep(10000);
				WebElement Agentpromation = driver.findElement(By.xpath("//p[contains(text(),'Agent Promotions')]"));
				Agentpromation.click();

				System.out.println("******Agent Promations******************");
				System.out.println("                                            ");
				Thread.sleep(5000);
				List<WebElement> agentlist = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
				// System.out.println("My promations: ");
				System.out.println("My Promations : " + agentlist.size());
				System.out.println("                                            ");
				for (WebElement tab1 : agentlist) {
					WebElement agentid = driver.findElement(By.xpath("//thead[contains(@class,'text-info')]//tr"));
					agentid.getText();
					// System.out.println(tab1.getText());
					Thread.sleep(4000);
					System.out.println("                                            ");
					System.out.println("My promations : " + tab1.getText());
					System.out.println("                                            ");
					System.out.println("**********Next Agent promations****");
					Thread.sleep(7000);
					WebElement Agentpromat = driver.findElement(By.xpath(
							"/html[1]/body[1]/app-root[1]/app-root[1]/app-agentlayout[1]/div[1]/div[1]/app-agenttasks[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ngb-tabset[1]/ul[1]/li[2]/a[1]"));
					Agentpromat.click();
					Thread.sleep(5000);

					List<WebElement> agentlist2 = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
					// System.out.println("Agent promations: ");
					System.out.println("                                            ");
					System.out.println("Agent promations list: " + agentlist2.size());
					for (WebElement tab2 : agentlist2) {

						Thread.sleep(3000);
						// System.out.println(tab2.getText());
						System.out.println("                                            ");
						System.out.println("Agent promations : " + tab2.getText());
					}
					WebElement Agentpromat2 = driver.findElement(By.xpath(
							"/html[1]/body[1]/app-root[1]/app-root[1]/app-agentlayout[1]/div[1]/div[1]/app-agenttasks[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ngb-tabset[1]/ul[1]/li[3]/a[1]"));
					Agentpromat2.click();
					Thread.sleep(5000);
					List<WebElement> agentlist3 = driver.findElements(By.xpath("//table[@class='table']//tbody"));
					System.out.println("                                            ");
					System.out.println("******Agent promated**** ");

					System.out.println("\n\n");
					System.out.println("Agent promated list: " + agentlist3.size());
					for (WebElement tab3 : agentlist3) {

						// System.out.println("\n\n");
						Thread.sleep(3000);

						System.out.println("Agent promated:" + tab3.getText());
					}

				}
				WebElement logout = driver.findElement(By.xpath("//div[@class='main-panel']//li[2]//a[1]"));
				logout.click();
				System.out.println("***Agent Logout****");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
//    WebElement home=driver.findElement(By.xpath("//img[@class='maf-logo']"));
//    home.click();
		Thread.sleep(5000);
		driver.navigate().back();

	}

	@AfterTest
	public void admin() throws InterruptedException {

//    	WebElement adminbutton=driver.findElement(By.xpath("//a[contains(text(),'Admin Login')]"));
//    	adminbutton.click();
		System.out.println("****Admin Login****");
		driver.navigate().to("http://localhost:4200/maf-admin/admin-login");
		Thread.sleep(3000);
		WebElement adminusername = driver.findElement(By.xpath("//input[@id='emailId']"));
		adminusername.sendKeys("jitesh@jjbytes.com");

		WebElement adminpassword = driver.findElement(By.xpath("//input[@id='password']"));
		adminpassword.sendKeys("jjbytes@123");
		Thread.sleep(3000);
		WebElement adminlogin = driver
				.findElement(By.xpath("//button[@class='fw btn btn-info btn-round btn-lg btn-block mb-3']"));
		adminlogin.click();
		Thread.sleep(3000);
//    	JavascriptExecutor jse = (JavascriptExecutor)driver;
//    	jse.executeScript("document.body.style.zoom = '80%';");
		Thread.sleep(8000);
		WebElement AgentPromata = driver.findElement(By.xpath("//p[contains(text(),'Agent Promotions')]"));
		AgentPromata.click();

		Thread.sleep(7000);

		List<WebElement> agentlist5 = driver.findElements(By.xpath("//table[@class='table']//tbody"));
		// System.out.println("Agent promations: ");
		System.out.println("                                            ");
		System.out.println("***Completed agent promotions****");
		System.out.println(agentlist5.size());
		for (WebElement tab5 : agentlist5) {

			Thread.sleep(3000);
			// System.out.println(tab2.getText());
			System.out.println("                                            ");
			System.out.println("Agent promations : " + tab5.getText());
		}
		Thread.sleep(5000);
		WebElement adminlogout = driver.findElement(By.xpath("//p[contains(text(),'Logout')]"));
		adminlogout.click();
		System.out.println("***Admin Logout****");

	}

}
