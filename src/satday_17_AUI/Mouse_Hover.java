package satday_17_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.hdfcbank.com/");
		d.manage().window().maximize();
		
		// APPLY NOW
		WebElement src=d.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span"));

		//PRODUCTS
		WebElement src12=d.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a"));
		
		Actions obj=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		obj.moveToElement(src).perform();
		Sleeper.sleepTightInSeconds(2);
		
		obj.moveToElement(src12).perform();
		
	
		
		
	}

}
