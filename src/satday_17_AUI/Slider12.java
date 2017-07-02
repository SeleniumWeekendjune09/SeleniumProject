package satday_17_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Slider12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		//identify Slider Element
		WebElement src=d.findElement(By.xpath(".//*[@id='slider']/span"));

		Actions sldr=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		sldr.dragAndDropBy(src, 200, 0).build().perform();
		
	}

}
