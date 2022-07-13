package screenShot;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				Thread.sleep(1000);
				
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//creat object of File class
				
			File destination=new File("C:\\SAPANA\\Selenium\\selenium-java-4.1.4\\TakeScreenShot\\myscreenshot.png");	
			
			FileHandler.copy(source, destination);
				
			
			
	}

}
