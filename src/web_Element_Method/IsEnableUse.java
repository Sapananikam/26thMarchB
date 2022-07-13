package web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableUse {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.discoveryplus.in/");
					
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Get OTP']"));
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	System.out.println(getOTPButton.isEnabled());
	
	driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
	
	Thread.sleep(1000);
	System.out.println(getOTPButton.isEnabled());
	
	getOTPButton.click();
		
		
		}

}

