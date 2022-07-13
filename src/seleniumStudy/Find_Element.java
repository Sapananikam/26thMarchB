package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Gm");
		
		driver.findElement(By.xpath("//label[@for='Radio4']")).click();
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
	}

}
