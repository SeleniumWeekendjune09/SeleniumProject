package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver d=new FirefoxDriver();
		d.get("https://book.spicejet.com/RetrieveBooking.aspx");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		// one way
		d.findElement(By.id("Availa......_OneWay")).click();
		
		// Going From
		new Select(d.findElement(By.id("Avai...riginStation1"))).
		                       selectByVisibleText("Delhi (DEL)");
		Thread.sleep(2000);
		// Going  TO
		new Select(d.findElement(By.id("Availabi..ation1"))).
		                     selectByVisibleText("Chennai (MAA)");
		
		Thread.sleep(2000);
		// clik DATE
		d.findElement(By.className("ui-datepicker-trigger")).click();
		
	}

}
