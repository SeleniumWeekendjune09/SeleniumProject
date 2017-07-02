package Sunday18_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest123 {
  @Test
  public void fg() {
	  System.out.println("CHG PSD");
  }
 
  @Test
  public void ab() {
	  System.out.println("Login");
  }
  
  @Test
  public void cd() {
	  System.out.println("LOGOUT");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("LAUNCH");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("CLOSE");
  }

}
