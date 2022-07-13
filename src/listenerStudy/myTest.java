package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerStudy.Listener.class)
public class myTest {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running ",true);
  }
  
  @Test
  public void TC2() 
  {
	  Reporter.log("TC2 is running ",true);
  }

  
  @Test
  public void TC3() 
  {
	  Assert.fail();
	  Reporter.log("TC3 is running ",true);
  }
  
  @Test(dependsOnMethods= {"TC3"})
  public void TC4() 
  {
	  Reporter.log("TC4 is running ",true);
  }


}
