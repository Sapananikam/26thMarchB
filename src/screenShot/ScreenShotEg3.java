package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
    Thread.sleep(1000);
    String s=RandomString.make(4);  //to take multiple screenshot
        
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\SAPANA\\Selenium\\selenium-java-4.1.4\\TakeScreenShot\\myscreenshot2"+s+".png");
   
		
		FileHandler.copy(source, destination);
	}

}
