package satday_17;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		// identify links
		List<WebElement> all= d.findElements(By.tagName("a"));
		System.out.println(all.size());
		
		for (int i = 0; i < all.size(); i++) 
		{
			String Sname=all.get(i).getText();
			
		    all.get(i).click();
			
		    // Screen sHOTS
		  File src=  ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("E:\\WorkSapce_WE_09\\"+Sname+".jpg"));  
		  
			d.navigate().back();
			
			// identify links
			all= d.findElements(By.tagName("a"));
		}


	}

}
