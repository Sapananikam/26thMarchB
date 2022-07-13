package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
	
	
	}

}
