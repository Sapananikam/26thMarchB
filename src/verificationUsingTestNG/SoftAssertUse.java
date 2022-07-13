package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() {
	  
	  String a="abc";
	  String b="abc";
	  
//to use soft assert we need to create object of SoftAssert class
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertNotEquals(a,b,"Both are equals TC is failed");
	  soft.assertNull(b,"value is not null TC is failed");
	  
	  soft.assertAll();    //compulasary use this
  }
  
@Test
public void Testing()
{
	boolean a=true;
	boolean b=false;
	
	 SoftAssert s=new SoftAssert();

	s.assertTrue(b,"value is false TC is failed");
	
	s.assertFalse(a,"value is true TC is failed");
	
	s.assertAll();
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

