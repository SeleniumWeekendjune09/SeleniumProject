package satday_24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DownLoadFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("3.4.0")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Runtime.getRuntime().exec("E:\\WorkSapce_WE_09\\AutoIT\\Savefile.exe");
		
  }
}
