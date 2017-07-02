package satday_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Xpath_Customization {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("java");
		
		

	}

}
