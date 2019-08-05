package MAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Agent_Commissions_List {
	
	
	WebDriver driver;

	File scr;
	XSSFWorkbook wb;
	Sheet sheet1;
	FileInputStream fis;
	
	
	public void policies() {
		
		
	}
	
	@Test
	public void commission() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//ChromeOptions optn=new ChromeOptions();
//		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
//     	driver = new FirefoxDriver();
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
				
				Thread.sleep(3000);
				Thread.sleep(8000);
				WebElement lev = driver.findElement(By.xpath("//p[contains(text(),'Agent Commissions')]"));
				lev.click();
				Reporter.log("Current Agent is: "+ user);
				System.out.println("Current Agent is :" + user);
				Reporter.log("Total commission of: "+ user);
				System.out.println("Total commission of " + user);
				Thread.sleep(5000);
//				List<WebElement> Commissiontable = driver
//						.findElements(By.xpath("//div[@class='card-body']"));
				
				
	
				List<WebElement> Commissiontable = driver
						.findElements(By.xpath("//body//tbody//tr[1]"));
				Reporter.log("Headers in table are below:");
				System.out.println("Headers in table are below:");
				Reporter.log("Total headers found:"+ Commissiontable.size());
				System.out.println("Total headers found: " + Commissiontable.size());
				for (WebElement tab1 : Commissiontable)
				{
					System.out.println(tab1.getText());
					Thread.sleep(4000);
					
					System.out.println("Cureent agent commission list is completed");
					
				}
				WebElement logout = driver.findElement(By.xpath("//div[@class='main-panel']//li[2]//a[1]"));
				logout.click();
			}
		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}

}
