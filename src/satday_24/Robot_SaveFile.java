package satday_24;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Robot_SaveFile {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("3.4.0")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Robot obj=new Robot();
		
		obj.keyPress(KeyEvent.VK_TAB);
		obj.keyRelease(KeyEvent.VK_TAB);
		
		obj.delay(2000);
		
		obj.keyPress(KeyEvent.VK_ENTER);
		obj.keyRelease(KeyEvent.VK_ENTER);
		
		
		
  }
}









