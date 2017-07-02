package satday_17_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		  FirefoxProfile	fp =pr.getProfile("Selenium_WE");
		
		WebDriver d=new FirefoxDriver(fp);
		d.get("http://primusbank.qedgetech.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		// Click Login Link
		d.findElement(By.id("login")).click();
		
		String str= d.switchTo().alert().getText();
		System.out.println(str);
		
		Sleeper.sleepTightInSeconds(3);
		d.switchTo().alert().accept();

	}

}
