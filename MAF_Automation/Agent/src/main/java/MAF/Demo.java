package MAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Demo {
	
	public Demo() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	

   File scr;
   XSSFWorkbook wb;
   Sheet sheet1;
   FileInputStream fis;
	
	public void Loginsurence() throws IOException, InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)Maf_Base.getDriver();
	   	Agent_Login agob=new Agent_Login();
		
		Insurence inobj=new Insurence();
		
	    Maf_Base.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		inobj.insurencebtn.click();
		Thread.sleep(3000);
		//inobj.inucompany.click();
		
		scr = new File("D:\\testnglogs\\log.xlsx");
        fis = new FileInputStream(scr);
        wb = new XSSFWorkbook(fis);
        String data0;

       try {
           sheet1= wb.getSheetAt(0);
           int rowCount = sheet1.getLastRowNum();
           for (int row=0; row<=rowCount; row++)
           {
              
           	
           	
//           	inobj.insurencebtn.click();
             	Thread.sleep(3000);
            	inobj.inucompany.click();
//           	pro.click();
               Thread.sleep(3000);
               Select oSelect = new Select(inobj.inucompany);
               oSelect.selectByValue("Nationwide");
               
               List<WebElement> oSize = oSelect.getOptions();
               int iListSize = oSize.size();
               for(int i =0; i < iListSize ; i++){
               String sValue = oSelect.getOptions().get(i).getText();
               
               // Printing the stored value
               System.out.println(sValue);
               
               
               // Selecting all the elements one by one
               oSelect.selectByIndex(i);
               Thread.sleep(2000);
               }
               Thread.sleep(3000);
               inobj.product.click();
               inobj.notifyAll();
               inobj.agob.ajaxmessage.clear();
               inobj.agob.Login.isEnabled();
            
             
            		 
               Select oSelect1 = new Select(inobj.product);
               oSelect1.selectByValue("MaxLife Plan");
               
           	
      
               String id = sheet1.getRow(row).getCell(0).getStringCellValue();
			   inobj.insid.sendKeys(id);
               Thread.sleep(1000);
               js.executeScript("scrollBy(0,400)");
               inobj.freq.click();
               Select oSelect2 = new Select(inobj.freq);
               oSelect2.selectByValue("Monthly");
               Thread.sleep(3000);
               
               
               String amt = sheet1.getRow(row).getCell(1).getStringCellValue();
               inobj.amount.sendKeys(amt);
                
                
                inobj.submit.click();
                Thread.sleep(2000);
                inobj.ok.click();
                Thread.sleep(3000);
                js.executeScript("scrollBy(0,-400)");
                inobj.log.click();
                Thread.sleep(2000);
                
           }
       }
           catch(Exception e) {
           	
             e.printStackTrace();
           	 System.out.println("Policy is not created");
           	 
           }
                   
		
	}

}
