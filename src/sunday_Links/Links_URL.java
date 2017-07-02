package sunday_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_URL {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		// identify links
		List<WebElement> all= d.findElements(By.tagName("a"));
		System.out.println(all.size());
		
		for (int i = 0; i < all.size(); i++) 
		{
			
		    all.get(i).click();
			String url=d.getCurrentUrl();
			System.out.println(url);
			
			d.navigate().back();
			
			// identify links
			all= d.findElements(By.tagName("a"));
		}

	}

}
