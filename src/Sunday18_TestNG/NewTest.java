package Sunday18_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  
	@Test(priority=0)
  public void f() 
	{
		System.out.println("Login");
  }
	@Test(priority=2, enabled=false)
	  public void a() {
		System.out.println("C/A");
	  }
	@Test(priority=1)
	  public void z() {
		System.out.println("CHG PASD");	
	  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("LAUNCH");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("CLOSE");
  }

}
