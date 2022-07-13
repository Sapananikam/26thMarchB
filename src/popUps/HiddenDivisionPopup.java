package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
     
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); //locator of close button(x)on popup
	
	
	driver.findElement(By.name("q")).sendKeys("top for girls");  //locator of search box
	Thread.sleep(100);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();  //locator of search button
	}

}
