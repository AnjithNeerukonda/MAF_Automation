package MAF;

import java.io.BufferedReader;		
import java.io.File;		
import java.io.FileReader;		
import java.util.Date;
import java.util.Set;
import java.util.StringTokenizer;		
import org.openqa.selenium.Cookie;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcokkie		
{		
  
	String name= "T";
	public Addcokkie() 
	 {
	   PageFactory.initElements(Maf_Base.getDriver(), this); 
	 }
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement email;
//	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public WebElement password;
//	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	public WebElement login;
//	
//	@FindBy(xpath="")
//	public WebElement email;
	
	
	public void adcokkie()		{		
    try{			
     
        File file = new File("Cookies.data");							
        FileReader fileReader = new FileReader(file);							
        BufferedReader Buffreader = new BufferedReader(fileReader);							
        String strline;			
        while((strline=Buffreader.readLine())!=null){									
        StringTokenizer token = new StringTokenizer(strline,";");									
        while(token.hasMoreTokens()){					
        String name = token.nextToken();					
        String value = token.nextToken();					
        String domain = token.nextToken();					
        String path = token.nextToken();					
        Date expiry = null;					
        		
        String val;			
        if(!(val=token.nextToken()).equals("null"))
		{		
        	expiry = new Date(val);					
        }		
        Boolean isSecure = new Boolean(token.nextToken()).								
        booleanValue();		
        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
        System.out.println(ck);
        Thread.sleep(3000);
        Maf_Base.getDriver().manage().addCookie(ck); // This will add the stored cookie to your current session					
        }		
        }		
        }catch(Exception ex){					
        ex.printStackTrace();			
        }		
    Maf_Base.getDriver().get("http://demo.guru99.com/test/cookie/selenium_aut.php");					
}	
	
	
	
	


	public void test() throws InterruptedException {
		
		email.sendKeys("anjithchowdary9@gmail.com");
		password.sendKeys("anjith2@@8");
		login.click();
		Thread.sleep(4000);
		
		
		Cookie name = new Cookie("T", "2GHCYCGVJVVUVUV");
		Cookie name1 = new Cookie("S", "CKGCUVKUIVI");
		
		Maf_Base.getDriver().manage().addCookie(name);
		Maf_Base.getDriver().manage().addCookie(name1);
		
                // After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList =  Maf_Base.getDriver().manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		    
Thread.sleep(3000);
              // Maf_Base.getDriver().manage().deleteCookieNamed(name);
		// TODO Auto-generated method stub
	
	}
		
	}
	public void deleteCookieNamed(String name1){

        Maf_Base.getDriver().manage().deleteCookieNamed(name1);
       // Maf_Base.getDriver().navigate().refresh();
        }
	
	public void deleteCookieNamedd(String name2) throws InterruptedException{

        Maf_Base.getDriver().manage().deleteCookieNamed(name2);
        Thread.sleep(2000);
        Maf_Base.getDriver().navigate().refresh();
        }
}
