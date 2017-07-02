package Sunday18_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable_Testing {
  @Test
  public void f() 
  {
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		WebElement table=d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		//identify Rows
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		//loop for Rows
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			//loop for columns
			for (int j = 0; j < cols.size(); j++) 
			{
				System.out.print(cols.get(j).getText()+"    ");
			}
			System.out.println();
		}
		
		
  }
}
