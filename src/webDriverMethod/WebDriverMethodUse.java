package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodUse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//1.get-->to enter url in browser or to open an application
	
		driver.get("https://www.google.co.in/");
		
		//2.close--> to close the current tab of browser opened by selenium tool
		
		//driver.close();
		
		//3.quit-->to close all tab in browser opened by Selenium tool
		
		//driver.quti();
		
		//4.maximize/minimize()-->used to maximize n minimize the browser
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
         
		
		
		
		
	}

}
