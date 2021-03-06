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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Responsibility_levels {

	WebDriver driver;

	File scr;
	XSSFWorkbook wb;
	Sheet sheet1;
	FileInputStream fis;

	@Test
	@Parameters("myBrowser")
	public void Responsibility() throws InterruptedException, IOException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\driver\\chromedriver.exe");
//		ChromeOptions optn=new ChromeOptions();
//		optn.addArguments("----headless");
//		optn.setHeadless(true);
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
     	driver = new FirefoxDriver();
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
				WebElement lev = driver.findElement(By.xpath("//p[contains(text(),'Levels Hierarchy')]"));
				lev.click();
				System.out.println(" Currrent Agent Login:  " + user);
				System.out.println("\n\n");
				System.out.println(" Agent Responsibility Hierarchy  ");
				Thread.sleep(5000);
				// WebElementg
				// tab=driver.findElement(By.xpath("//div[@class='main-content']//div[2]//div[1]//div[2]//ul[2]"));
				
				List<WebElement> Commissiontable = driver
						.findElements(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]"));
				
				System.out.println("Headers in table are below:");
				System.out.println("Total headers found: " + Commissiontable.size());
				for (WebElement tab1 : Commissiontable)
				{   
					System.out.println(tab1.getText());
		  			Thread.sleep(4000);
					System.out.println("\n\n");
					System.out.println("Commission Hierarchy for :" +user);
					List<WebElement> Commissiontable1 = driver
							.findElements(By.xpath("//div[@class='main-content']//div[2]//div[1]//div[2]"));
					for (WebElement tab2 : Commissiontable1)
					{
						System.out.println(tab2.getText());
						Thread.sleep(4000);
						System.out.println("\n\n");
						System.out.println("Completed Both Responsibility and commission of : " + user);
						System.out.println("\n\n");
						System.out.println("****Login Into the next Agent*****");
						
					     
				}
				WebElement logout = driver.findElement(By.xpath("//div[@class='main-panel']//li[2]//a[1]"));
				logout.click();
			}
		}
		}
		catch (Exception e) 
		{

			e.printStackTrace();
		}
	}
}
