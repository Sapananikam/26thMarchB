package setsizeAndPosition;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getPosition());
		
//to set postion of browser we need to create  object of point class and pass X and Y co-ordinate
		
		 Point p=new Point(200,10);
//using SetPosition method we can set the browser position	
		 
		 driver.manage().window().setPosition(p);
		
 
		
		
		
		
		
		
		
		
		
	}

}
