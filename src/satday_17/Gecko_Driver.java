package satday_17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://fb.com");

	}

}
