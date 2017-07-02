package Sunday18_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable3 {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		String path1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String path2="]/td[";
		String path3="]";
		
		for (int i = 1; i <= 10 ; i++) 
		{
			for (int j = 1; j <= 4 ; j++) 
			{
				
				String names=d.findElement(By.xpath(path1+i+path2+j+path3)).getText();
			    System.out.print(names+"   ");
			}
			System.out.println();
		}
  }
}
