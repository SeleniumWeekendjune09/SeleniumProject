package satday_24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Multi_Windows_PopUps {
  @Test
  public void f() 
  {
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.onlinesbi.com/");
		d.manage().window().maximize();
		
		String str=d.getWindowHandle();
		System.out.println(str);
		
		
	
		Sleeper.sleepTightInSeconds(2);
		// Click Cash@SBI
		d.findElement(By.xpath(".//*[@id='primary_navigation']/li[11]/a")).click();
		Sleeper.sleepTightInSeconds(1);
	 
	  Set<String> winds=  d.getWindowHandles();
	  System.out.println(winds);
	  
	 Object s[]= winds.toArray();
	 
	 String wname=s[1].toString();
	 
	  d.switchTo().window(wname);
	  
	  d.findElement(By.id("autocomplete")).sendKeys("loan");
	  
	  Sleeper.sleepTightInSeconds(3);
	  
	  d.close();
	  
	  Sleeper.sleepTightInSeconds(3);
	  d.switchTo().window(s[0].toString());

	  d.findElement(By.xpath(".//*[@id='primary_navigation']/li[7]/a")).click();
	  
  }
}







