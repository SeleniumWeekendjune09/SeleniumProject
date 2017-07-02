package satday_17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
	  FirefoxProfile	fp =pr.getProfile("Selenium_WE");
	
	WebDriver d=new FirefoxDriver(fp);
	d.get("http://fb.com");
	
	}

}
