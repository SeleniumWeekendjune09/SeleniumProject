package satday_17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenLinks_Count {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		// Total Links
	List<WebElement>	links =d.findElements(By.tagName("a"));
	System.out.println("Total Links Are===="+links.size());
	
	int count=0;
	int hidden=0;
	
	for (int i = 0; i < links.size(); i++) 
	{
		
		// IF Link Text is not empty ( VisiBle )
		if ( ! links.get(i).getText().isEmpty()) 
		{
			count=count+1;    // count++;
			
		}
		else
		{
			hidden++;
		}
	}
	
	System.out.println("Visible Links ARE======"+count);
	System.out.println("HiddenLinks are======="+hidden);
	
	
	
	
	
	
	

	}

}
