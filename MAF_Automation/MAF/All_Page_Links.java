package MAF;

import java.awt.List;

import org.apache.commons.collections.list.LazyList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class All_Page_Links {
	 
	 public void lin() {
	 
	 
	 
	 
	 
	 java.util.List<WebElement> links = Maf_Base.findElements(By.tagName("a"));
	 
	 System.out.println(links.size());
	 
	 for (int i = 1; i<=links.size(); i=i+1)
	 
	 {
	 
	 System.out.println(links.get(i).getText());
	 
	 }
	 
	 }
	 
	}