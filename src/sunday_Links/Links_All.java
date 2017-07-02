package sunday_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_All {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.icicibank.com/");
		d.manage().window().maximize();
		
		// identify links
		List<WebElement> links =d.findElements(By.tagName("a"));
		 int a=links.size();
		 
		 System.out.println(a);
		 
		 for (int i = 0; i < a ; i++) 
		 {
			String name=links.get(i).getText();
			System.out.println(name);
			
		}
		 

	}

}
