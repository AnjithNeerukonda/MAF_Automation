package com.MAF_Automation.Stepdefinations;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;

import com.MAF_Automation.Base_Class;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_multipleuserdef {
	
	 File scr;
     XSSFWorkbook wb;
     Sheet sheet1;
     FileInputStream fis;

    public  Logger Log = Logger.getLogger( Login_multipleuserdef.class.getName());
	 public Login_multipleuserdef() 
	 {
	   PageFactory.initElements(Base_Class.getDriver(), this); 
	 }
	Login_Pagedef obj=new Login_Pagedef();
	
	
	@Given("^: First click Login button$")
	public void first_click_Login_button() throws Throwable {
		
		obj.Loginbutton.click();
		Thread.sleep(3000);
		
	   
	}

	@When("^: User should enter username$")
	public void user_should_enter_username() throws Throwable {
		
		
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
 
//                Agent_Login agobj=new Agent_Login();
                String user = sheet1.getRow(row).getCell(0).getStringCellValue();
				obj.username.sendKeys(user);
                Log.info( "  Phone or Email  Details Send." );
                Thread.sleep(1000);
                
             
                String pwd = sheet1.getRow(row).getCell(1).getStringCellValue();
                obj.Password.sendKeys(pwd);
                Log.info( "  Password  Details  Send." );
                Thread.sleep(1000);
                
                 obj.Login.click();
                 Thread.sleep(3000);
                 Base_Class.getDriver().switchTo().alert().accept();
                 Thread.sleep(2000);
               
               
                if(obj.Loginbutton.isDisplayed())
                {
           
                    Log.info( "  Invalid user not registered. " );
                    Log.info( "  Invalid user name: "+obj.username +" And Password: "+obj.Password );
                   obj.username.clear();
                    obj.Password.clear();
//                    obj.Login.click();
                    Log.info( " User Details cleared. " );
                }
                else
                {

                    Log.info( "  Valid User Name: "+obj.username + "And password: "+obj.Password);

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

		
		
	    
	

	@When("^: User should enter password$")
	public void user_should_enter_password() throws Throwable {
		
		System.out.println("test passed");
	   
	}

	@Then("^: Click Login button$")
	public void click_Login_button() throws Throwable {
		System.out.println("Login button clicked");
	    
	}
	
	
	

}
