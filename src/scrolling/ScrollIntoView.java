package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
				
//Implict wait
				
 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));  //500
				
	JavascriptExecutor je=(JavascriptExecutor)driver;  //type cast driver into JavascriptExecutor			
	
//	je.executeScript("window.scrollBy(90,800)");   //scrolling over the page
				
				
//findout element				
				
	WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	
//scroll to element
	
	je.executeScript("arguments[0].scrollIntoView(true)",radio1);
	
	Thread.sleep(200);
	
	radio1.click();
	
	Thread.sleep(200);
	
	WebElement box = driver.findElement(By.id("autocomplete"));   //locator of suggestion box
	
	je.executeScript("arguments[0].scrollIntoView(true)",box);
	
	box.sendKeys("velocity");
	
//scroll Down
	
	je.executeScript("window.scrollBy(90,3000)");
	
	Thread.sleep(200);
	
//scroll Up	
	
	je.executeScript("window.scrollBy(3000,90)");

	
	}

}
