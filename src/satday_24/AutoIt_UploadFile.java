package satday_24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIt_UploadFile {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		d.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Runtime.getRuntime().exec("E:\\WorkSapce_WE_09\\AutoIT\\Upload.exe");
  }
}
