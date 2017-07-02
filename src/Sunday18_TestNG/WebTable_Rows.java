package Sunday18_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable_Rows {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		
		
		for (int i = 1; i <= 36; i++) 
		{
			String path="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr["+i+"]/td[5]";
			
			String name=d.findElement(By.xpath(path)).getText();
			System.out.println(name);
		}
		
		
		
  }
}
