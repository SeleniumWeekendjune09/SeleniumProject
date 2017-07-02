package satday_24;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Mouse_Move {
  @Test
  public void f() throws AWTException {
	  
	  Robot obj=new Robot();
	  
	 Dimension src=Toolkit.getDefaultToolkit().getScreenSize();
	 System.out.println(src);
	 
	 Sleeper.sleepTightInSeconds(3);
	 
	 obj.mouseMove(10, 760);
	 
	 obj.delay(2000);
	 
	 obj.mousePress(InputEvent.BUTTON1_MASK);
	 
	 
	 
	 
	 
  }
}
