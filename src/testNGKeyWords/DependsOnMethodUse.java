package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
  @Test
  public void d() 
  {
      
	  Reporter.log("d is running",true);
  }

@Test(dependsOnMethods= {"d"})    //this method is depends on method a
public void a()     
{
	Reporter.log("a is running",true);
}

@Test
public void v()
{
	Reporter.log("v is running",true);
}

  
}
