package testNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnoTationStudyTestTest1 {
  @Test
  public void rechargePhone() 
  {
	  Reporter.log("recharge done",true);
  }
  @BeforeMethod
  public void loginToRechargePortal() 
  {
	  Reporter.log("Login success",true);
  }

  @AfterMethod
  public void logoutFromRechargePortal() 
  {
	  Reporter.log("logout done",true);
  }

  @BeforeClass
  public void lauchBrowser()
  {
	  Reporter.log("browser launched",true);
  }

  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("browser closed",true);
  }

}
