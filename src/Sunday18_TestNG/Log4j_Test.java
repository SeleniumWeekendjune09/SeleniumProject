package Sunday18_TestNG;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j_Test {

	public static void main(String[] args) {
		
        Logger	log=	Logger.getLogger(Log4j_Test.class);

        DOMConfigurator.configure("log4jjj.xml");
        
        
        WebDriver d=new FirefoxDriver();
        log.info("Br Opened");
        
		d.get("http://newtours.demoaut.com/");
		log.info("URL entered");
		
		d.manage().window().maximize();
		log.info("BE maximized");
		
		
        
	}

}





