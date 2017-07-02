package satday_17;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Html_UNit_Driver {

	public static void main(String[] args) {
		
		
	HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		

	}

}
