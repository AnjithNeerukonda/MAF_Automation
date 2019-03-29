package MAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import MAF.Agent_Login;
//import net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForParameterizedType.Nested;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Agent_Login_Multipleusers
{
     File scr;
     XSSFWorkbook wb;
     Sheet sheet1;
     FileInputStream fis;

    public  Logger Log = Logger.getLogger( Agent_Login_Multipleusers.class.getName());
    @Test
    public void AgentLogin() throws IOException, InterruptedException {
    	 Agent_Login agobj=new Agent_Login();
    	 agobj.Loginbutton.click();
    	
        scr = new File("D:\\MAF_Project\\MAF.xlsx");
        fis = new FileInputStream(scr);
        wb = new XSSFWorkbook(fis);
        String data0;

        try {
            sheet1= wb.getSheetAt(0);
            int rowCount = sheet1.getLastRowNum();

            Log.info( "=================================================================================" );
            Log.info( "Test Title: Login Screen Validation With Multiple Data Passing from XlSheet      " );
            Log.info( "=================================================================================" );
            Log.info( "                                Start                                            " );
            Log.info( "=================================================================================" );


            Log.info( "Total Number Of Test Data :"+rowCount );


            for (int row=0; row<=rowCount; row++)
            {
 
               // Agent_Login agobj=new Agent_Login();
                String user = sheet1.getRow(row).getCell(0).getStringCellValue();
				agobj.username.sendKeys(user);
                Log.info( "  Phone or Email  Details Send." );
                Thread.sleep(1000);
                
             
                String pwd = sheet1.getRow(row).getCell(1).getStringCellValue();
                agobj.Password.sendKeys(pwd);
                Log.info( "  Password  Details  Send." );
                Thread.sleep(1000);
                
                 agobj.Login.click();
                 
                 Thread.sleep(3000);
                 
                 if(agobj.ok.isDisplayed()) {
                	 
                	 agobj.ok.click();
                 }
                 else {
                	 Thread.sleep(30000);
                	 agobj.logout.click();
                 }
                 
                 
                 
                 
                // WebDriverWait wait = new WebDriverWait(Maf_Base.getDriver(), 05);

//                 try {
//                     wait.until(ExpectedConditions.alertIsPresent());
//                     Alert alert = Maf_Base.getDriver().switchTo().alert();
//                     alert.accept();
//                     System.out.println("alert was present and accepted");
//                 }
//                 catch(Exception e) {
//                     System.out.println("alert was not present");
//                     System.out.print(e);
//                     agobj.logout.click();
//                 }
                 
               
//                 WebDriverWait wait = new WebDriverWait(Maf_Base.getDriver(), 10 /*timeout in seconds*/);
//                 if(wait.until(ExpectedConditions.alertIsPresent())==null)
//                	 //if(wait.until(ExpectedConditions.alertIsPresent()) != null)
//                 
//                 {	 
//                		 
//                     System.out.println("alert was not present");
//                     agobj.logout.click();
//                 }
//                     else {
//               
//                Alert alert = Maf_Base.getDriver().switchTo().alert();
//               alert.accept();
//               System.out.println("alert was present and accepted");
//                     
//                     }
               
//               if( ) 
//               {
//            	   Thread.sleep(2000);
//                 Maf_Base.getDriver().switchTo().alert().accept();
//                
               
               
                if(agobj.Login.isDisplayed())
                {
                	 //Maf_Base.getDriver().switchTo().alert().accept();
                    Log.info( "  Invalid user not registered. " );
                    Log.info( "  Invalid user name: "+agobj.username +" And Password: "+agobj.Password );
                   agobj.username.clear();
                    agobj.Password.clear();
//                    agobj.Login.click();
                   
                    Log.info( " User Details cleared. " );
                }
               
                else
                {
                	//Thread.sleep(3000);
                	
//                	 System.out.println("alert was not present");
//                   
                    Log.info( "  Valid User Name: "+agobj.username + "And password: "+agobj.Password);
                    //agobj.logout.click();
                    Log.info("================================================");
                    Log.info("             User Logout                        ");
                    Log.info("================================================");
                }
            } // for loop end
            Log.info( "=================================================================================" );
            Log.info( "                                Execution End                                    " );
            Log.info( "=================================================================================" );

        } // method end
        catch(Exception e){

            e.printStackTrace();
        }
    }
    }

