package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void myMethod() {
	  
	  
	  String a="Pune";
	  String b="Pune";
	  
	  Assert.assertNotEquals(a,b,"TC failed values are equal");
	  Assert.assertNotNull(b,"TC is failed value is null");
  }
}
