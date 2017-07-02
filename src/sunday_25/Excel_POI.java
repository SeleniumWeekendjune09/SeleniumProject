package sunday_25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_POI {
  @Test
  public void f() throws IOException {
	  
	  String path="E:\\WorkSapce_WE_09\\Selenium_Project_WE\\testdata\\test2.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	   XSSFSheet ws= wb.getSheetAt(0);
	   
	   WebDriver d=new FirefoxDriver();
		d.get(ws.getRow(1).getCell(2).getStringCellValue());
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
		d.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		d.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		d.findElement(By.id("btnLogin")).click();
	   
		// to write data into excel
		// ws.getRow(1).createCell(2).setCellValue("passsss");
  }
}





