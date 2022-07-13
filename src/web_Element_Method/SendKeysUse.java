package web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Velocity");
		
		Thread.sleep(1000);   //yawar click krun throw option select karane.
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
	
	
	
	}
}
