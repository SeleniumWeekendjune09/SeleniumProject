package satday_24;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_JXL {
  @Test
  public void f() throws BiffException, IOException {
	  
	  
	  FileInputStream fis=new FileInputStream("E:\\WorkSapce_WE_09\\Selenium_Project_WE\\testdata\\test.xls");
	  Workbook wb=Workbook.getWorkbook(fis);
	  
	  Sheet ws=wb.getSheet("Sheet1");
	  
	  
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
		d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
		d.findElement(By.id("btnLogin")).click();
  }
}







