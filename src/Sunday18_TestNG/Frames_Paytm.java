package Sunday18_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Frames_Paytm {
  @Test
  public void f() 
  {
	  WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		// Click login link
		d.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		
		//identify frames
		List<WebElement> frames=d.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for (int i = 0; i < frames.size(); i++) 
		{
			// switch to frames
			d.switchTo().frame(i);
			
		try 
		{
			Sleeper.sleepTightInSeconds(3);
			
			d.findElement(By.id("input_0")).sendKeys("8787878709");
			d.findElement(By.id("input_1")).sendKeys("hello123333");
		
			Sleeper.sleepTightInSeconds(2);
			d.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button[1]")).click();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		}
		// switch to main window
		d.switchTo().defaultContent();
		
		//Mobile number
		d.findElement(By.id("input_012")).sendKeys("96789678900");
		
		
		
		
  }
}
