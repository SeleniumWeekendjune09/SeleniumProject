package satday_17_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Drag_Drop {

	@Test
	public void aaa()
	{
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
	//	identify Source Element
		WebElement src=d.findElement(By.id("draggable"));
		
//		identify target Element
		WebElement targ=d.findElement(By.id("droppable"));
		
		Actions dd=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		dd.dragAndDrop(src, targ).build().perform();

	}

}
