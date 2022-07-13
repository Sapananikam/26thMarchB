package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://vctcpune.com/selenium/practice.html");
					
				//	Thread.sleep(100000);    //100-->1900
					
					//implict wait
					
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000)); //500		
			
			driver.close();

	}

}
