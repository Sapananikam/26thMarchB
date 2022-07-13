package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUse {
  
	  @Test(timeOut=1000)        //test case failed cz time not matching
		 public void d() throws InterruptedException 
		  {
		      Thread.sleep(2000);
			  Reporter.log("d is running",true);
		  }

		@Test
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

