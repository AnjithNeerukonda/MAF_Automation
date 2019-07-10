package MAF;

import java.io.BufferedWriter;		
import java.io.File;		
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;		

public class Api{	
    
@Test
   public void cookie() {
       				
        // Input Email id and Password If you are already Register	
	
	
	Maf_Base.getDriver().findElement(By.name("username")).sendKeys("abc123");							
	Maf_Base.getDriver().findElement(By.name("password")).sendKeys("123xyz");							
	Maf_Base.getDriver().findElement(By.name("submit")).click();
//        Maf_Base.getDriver().findElement(By.id("email")).sendKeys("abc123");							
//        Maf_Base.getDriver().findElement(By.id("pass")).sendKeys("123xyz");							
//        Maf_Base.getDriver().findElement(By.id("u_0_2")).click();					
        		
        // create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		           	
            // loop for getting the cookie information 		
            for(Cookie ck : Maf_Base.getDriver().manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();
                
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }


}

	


	