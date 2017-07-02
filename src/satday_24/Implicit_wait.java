package satday_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Implicit_wait {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://www.hdfcbank.com/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.findElement(By.className("searchbox")).sendKeys("loan");
		
		
  }
}
