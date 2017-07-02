package Sunday18_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox_testing {
	
	WebDriver d;
	@Test
  public void f() 
  {
		// identify Check boxes
	 List<WebElement> checks=  d.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	  System.out.println(checks.size());
	  
	  for (int i = 0; i < checks.size(); i++) 
	  {
		if(  ! checks.get(i).isSelected())
		{
			checks.get(i).click();
		}
		else
		{
			System.out.println(checks.get(i).getAttribute("value"));
		}
	}
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  ProfilesIni pr=new ProfilesIni();
	  FirefoxProfile	fp =pr.getProfile("Selenium_WE");
	
	 d=new FirefoxDriver(fp);
	d.get("http://echoecho.com/htmlforms09.htm");
	d.manage().window().maximize();
	  
  }
  
}



