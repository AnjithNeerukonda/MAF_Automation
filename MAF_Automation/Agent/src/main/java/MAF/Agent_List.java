package MAF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;;

public class Agent_List {
	
	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/app-sidebar/div/div[2]/ul/li[2]/a/p")
	public WebElement Agentlist;
	
//	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-agentslist/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button")
//	public WebElement view;
	
//	@FindBy(xpath="/html/body/app-root/app-root/app-adminlayout/div/div/app-agentslist/div[2]/div/div/div/div[2]/div/table/tbody")
//	public WebElement tablebody;
//	
//	public void viewlist() {
//		
//		List<WebElement> le= (List<WebElement>) tablebody.findElement(By.xpath("/html/body/app-root/app-root/app-adminlayout/div/div/app-agentslist/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/button"));
//		
//		int size = le.size();
//		System.out.println(size);
//		
//		
//	}
//	
	

}
