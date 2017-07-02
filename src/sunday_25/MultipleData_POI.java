package sunday_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleData_POI {
  @Test
  public void f() throws IOException {
	  
	  
String path="E:\\WorkSapce_WE_09\\Selenium_Project_WE\\testdata\\links.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	   XSSFSheet ws= wb.getSheetAt(0);
	   
	   WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		int rc=ws.getLastRowNum();
		
		for (int i = 1; i <= rc ; i++) 
		{
			d.findElement(By.linkText(ws.getRow(i).getCell(0).getStringCellValue())).click();
			
			String acturl=d.getCurrentUrl();
			
			ws.getRow(i).createCell(2).setCellValue(acturl);
			
			String expurl=ws.getRow(i).getCell(1).getStringCellValue();
			
			if(expurl.equalsIgnoreCase(acturl))
			{
				ws.getRow(i).createCell(3).setCellValue("PASS");
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("FAIL");
			}
			
			d.navigate().back();
			
		}
		
		
		FileOutputStream fos=new FileOutputStream("E:\\WorkSapce_WE_09\\Selenium_Project_WE\\testdata\\testOUTput.xlsx");
		wb.write(fos);
		wb.close();
		
  }
}










