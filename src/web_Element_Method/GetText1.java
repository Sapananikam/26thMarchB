package web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
	
	}

}
