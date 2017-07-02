package Sunday18_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Dynamic_Xpath {
  @Test
  public void f() 
  {
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.yahoo.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		// Search Box
		d.findElement(By.id("uh-search-box")).sendKeys("selenium");
		Sleeper.sleepTightInSeconds(1);
		
	List<WebElement> links=d.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_14977')]/li"));
		System.out.println(links.size());
		
		Sleeper.sleepTightInSeconds(4);
		
		for (int i = 0; i < links.size(); i++) 
		{
			if(links.get(i).getText().equals("selenium tutorial"))

			{
				links.get(i).click();
			}
		}
		
		
		
		
		
  }
}
