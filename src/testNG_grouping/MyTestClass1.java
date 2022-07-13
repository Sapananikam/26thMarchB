package testNG_grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 {   //we have some regression n some sanity test cases..we have to
	                                                  
  @Test                        //execute only sanity test case then we use grouping
  public void a() 
  {
	  Reporter.log("a is running",true);
  }

@Test(groups= {"regression"})            
public void b()     
{
	Reporter.log("b is running regression",true);
}

@Test(groups= {"sanity"})
public void c()
{
	Reporter.log("c is running sanity",true);
}
@Test(groups= {"regression"})
public void d()
{
	Reporter.log("d is running regression",true);
}

}
