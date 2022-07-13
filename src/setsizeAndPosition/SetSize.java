package setsizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
// to set browser size we need to create object of Dimension class n pass Width n Height
		
		Dimension d=new Dimension(1111,100);
		
//using setSize method we can set size
		
		driver.manage().window().setSize(d);

	}

}
