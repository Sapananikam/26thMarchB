package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://vctcpune.com/");
	
	//5.navigate()method-->open application,move forward,move backword,refresh
	
	//driver.navigate().to("https://www.google.com/");
	
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	
	//6.getTitle: this method is used to get title of webpage.return type is string.
	System.out.println(driver.getTitle());
	
	String title = driver.getTitle();
	System.out.println(title);
	
	//7.getCurrentURL:this method is use to get URL of webpage.return type is string.
	
	System.out.println(driver.getCurrentUrl());
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	
	
	
	
	}

}
