package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(7000);
        
        driver.switchTo().frame(0);  //switch from main page to frame1 page
        
        driver.findElement(By.tagName("input")).sendKeys("Hello");
        
        driver.switchTo().frame("frame3");  //switch from frame1 to frame2 page(inner frame)
        
        driver.findElement(By.id("a")).click();
        
        

	
	
	
	
	
	}

}
