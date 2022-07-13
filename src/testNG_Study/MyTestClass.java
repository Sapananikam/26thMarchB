package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void myMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);

	  Reporter.log("Hi method is running this is reporter output",true);
	  
	  
	  
	  
  
  }
}
