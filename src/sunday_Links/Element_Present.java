package sunday_Links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.icicibank.com/");
		d.manage().window().maximize();
		
	 String	src=d.getPageSource();
	 System.out.println(src);
	 
	 if(src.contains("kaif"))
	 {
		 System.out.println("ELement is Present");
	 }
	 else
	 {
		 System.out.println("ELement is  not Present");
	 }
	 

	}

}
