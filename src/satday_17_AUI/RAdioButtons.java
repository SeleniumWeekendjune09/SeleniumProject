package satday_17_AUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class RAdioButtons {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		  FirefoxProfile	fp =pr.getProfile("Selenium_WE");
		
		WebDriver d=new FirefoxDriver(fp);
		d.get("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		// identify Block
		WebElement blc=d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		// identify radio buttons from Block
		List<WebElement> radio=blc.findElements(By.name("group1"));
		System.out.println(radio.size());
		
		for (int i = 0; i < radio.size(); i++) 
		{
			String Rname=radio.get(i).getAttribute("value");
			
			String Rcheck=radio.get(i).getAttribute("checked");
			
			System.out.println(Rname+"-----"+Rcheck);
			
		}
		

	}

}
