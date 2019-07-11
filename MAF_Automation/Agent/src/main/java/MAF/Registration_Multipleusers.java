package MAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Registration_Multipleusers {

	File scr;
	XSSFWorkbook wb;
	Sheet sheet1;
	FileInputStream fis;

	public Logger Log = Logger.getLogger(Agent_Login_Multipleusers.class.getName());

	@Test
	public void Agentreg() throws IOException, InterruptedException {

		Registration_Page obj = new Registration_Page();

		obj.joinus.click();
		scr = new File("D:\\MAF_Project\\Agen_Reg.xlsx");
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

				String user = sheet1.getRow(row).getCell(0).getStringCellValue();
				obj.sponserId.sendKeys(user);

				String user1 = sheet1.getRow(row).getCell(1).getStringCellValue();
				obj.firstName.sendKeys(user1);

				String user2 = sheet1.getRow(row).getCell(2).getStringCellValue();
				obj.lastName.sendKeys(user2);

				// obj. optionMale.click();

				String user3 = sheet1.getRow(row).getCell(3).getStringCellValue();
				obj.ssnNumber_name.sendKeys(user3);

				String user4 = sheet1.getRow(row).getCell(4).getStringCellValue();
				obj.PhoneNumber.sendKeys(user4);

				String user5 = sheet1.getRow(row).getCell(5).getStringCellValue();
				obj.emailId.sendKeys(user5);

				String user6 = sheet1.getRow(row).getCell(6).getStringCellValue();
				obj.residentSuitApartment.sendKeys(user);

				String user7 = sheet1.getRow(row).getCell(7).getStringCellValue();
				// obj.residentCity.sendKeys(user7);

				String user8 = sheet1.getRow(row).getCell(8).getStringCellValue();
				// obj.residentCountry.sendKeys(user8);

				String user9 = sheet1.getRow(row).getCell(10).getStringCellValue();
				// obj.residentState.sendKeys(user9);

				String user10 = sheet1.getRow(row).getCell(10).getStringCellValue();
				// obj.residentZipcode.sendKeys(user10);

				String user11 = sheet1.getRow(row).getCell(11).getStringCellValue();
				// obj.residentAddress.sendKeys(user11);

				Log.info("  Password  Details  Send.");
				Thread.sleep(1000);

//	                 agobj.Login.click();

//	                 Thread.sleep(2000);

//	                if(obj.paypal.isDisplayed())
//                    {
//           
//	                    Log.info( "  Invalid user not registered. " );
////	                    Log.info( "  Invalid user name: "+obj.username +" And Password: "+agobj.Password );
//	                   obj.sponserId.clear();

//	                    agobj.Login.click();
//	                    Log.info( " User Details cleared. " );
//	                }
//	                else
//	                {
//
//	                    Log.info( "  Valid User Name: "+agobj.username + "And password: "+agobj.Password);
//
//	                    Log.info("================================================");
//	                    Log.info("             User Logout                        ");
//	                    Log.info("================================================");
//	                }
//	            } // for loop end
//	            Log.info( "=================================================================================" );
//	            Log.info( "                                Execution End                                    " );
//	            Log.info( "=================================================================================" );
//
//	        } // method end
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
