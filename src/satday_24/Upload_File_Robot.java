package satday_24;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Upload_File_Robot {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		// Copy File Path
		StringSelection src=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().
		                setContents(src, null);
		
		// Click Browse Button
		driver.findElement(By.id("photo")).click();
		Sleeper.sleepTightInSeconds(2);		
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		// press ENTER key
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
				
			
  }
}
