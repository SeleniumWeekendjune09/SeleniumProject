package satday_17;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_HRM_SCreens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		 String expres = "OrangeHRM123";
		 
		String actres = d.getTitle();
		System.out.println(actres);
		
		if (expres.equals(actres)) 
		{
			System.out.println("Launch TC PASS");
			
		}
		else
		{
			File	src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("E:\\WorkSapce_WE_09\\weekend.png"));
			
			
			System.out.println("Launch TC FAIL");
		}

	}

}
