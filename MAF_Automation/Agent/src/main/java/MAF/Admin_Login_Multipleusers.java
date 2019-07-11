package MAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Admin_Login_Multipleusers {
	File scr;
	XSSFWorkbook wb;
	Sheet sheet1;
	FileInputStream fis;

	public Logger Log = Logger.getLogger(Agent_Login_Multipleusers.class.getName());

	@Test
	public void AdminLogin() throws IOException, InterruptedException {
		Admin_Login adobj = new Admin_Login();
		adobj.admin_button.click();

		scr = new File("D:\\MAF_Project\\MAF_admin.xlsx");
		fis = new FileInputStream(scr);
		wb = new XSSFWorkbook(fis);
		String data0;

		try {
			sheet1 = wb.getSheetAt(0);
			int rowCount = sheet1.getLastRowNum();

			Log.info("=================================================================================");
			Log.info("Test Title: Login Screen Validation With Multiple Data Passing from XlSheet      ");
			Log.info("=================================================================================");
			Log.info("                                Start                                            ");
			Log.info("=================================================================================");

			Log.info("Total Number Of Test Data :" + rowCount);

			for (int row = 0; row <= rowCount; row++) {

				// Agent_Login agobj=new Agent_Login();
				String user = sheet1.getRow(row).getCell(0).getStringCellValue();
				adobj.admin_username.sendKeys(user);
				Log.info("  Phone or Email  Details Send.");
				Thread.sleep(1000);

				String pwd = sheet1.getRow(row).getCell(1).getStringCellValue();
				adobj.admin_Pswd.sendKeys(pwd);
				Log.info("  Password  Details  Send.");
				Thread.sleep(1000);

				adobj.admin_submit.click();

				Thread.sleep(3000);

				WebDriverWait wait = new WebDriverWait(Maf_Base.getDriver(), 10 /* timeout in seconds */);
				if (wait.until(ExpectedConditions.alertIsPresent()) == null)
				// if(wait.until(ExpectedConditions.alertIsPresent()) != null)

				{

					System.out.println("alert was not present");
					// agobj.logout.click();
				} else {

					Alert alert = Maf_Base.getDriver().switchTo().alert();
					alert.accept();
					System.out.println("alert was present and accepted");

				}

//              if( ) 
//              {
//           	   Thread.sleep(2000);
//                Maf_Base.getDriver().switchTo().alert().accept();
//               

				if (adobj.admin_submit.isDisplayed()) {
					// Maf_Base.getDriver().switchTo().alert().accept();
					Log.info("  Invalid user not registered. ");
					Log.info("  Invalid user name: " + adobj.admin_username + " And Password: " + adobj.admin_Pswd);
					adobj.admin_username.clear();
					Thread.sleep(3000);
					adobj.admin_Pswd.clear();
					// adobj.Login.click();

					Log.info(" User Details cleared. ");
				}

				else {
					// Thread.sleep(3000);

//               	 System.out.println("alert was not present");
//                    agobj.logout.click();
					Log.info("  Valid User Name: " + adobj.admin_username + "And password: " + adobj.admin_Pswd);

					Log.info("================================================");
					Log.info("             User Logout                        ");
					Log.info("================================================");
				}
			} // for loop end
			Log.info("=================================================================================");
			Log.info("                                Execution End                                    ");
			Log.info("=================================================================================");

		} // method end
		catch (Exception e) {

			e.printStackTrace();
		}
	}
}
