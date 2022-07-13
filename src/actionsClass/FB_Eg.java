package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_Eg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Create New Account")).click();
				Thread.sleep(1000);
				WebElement day = driver.findElement(By.name("birthday_day"));
				Actions act=new Actions(driver);
	
				act.click(day).perform();
				
				for(int i=0;i<=9;i++)
				{
					act.sendKeys(Keys.ARROW_DOWN).perform();
					Thread.sleep(100);
				}
				act.sendKeys(Keys.ENTER).perform();
				
	//locator of firstname			
	WebElement firstname = driver.findElement(By.name("firstname"));	
	Thread.sleep(2000);
				
	//firstname.sendKeys("sapana");	  //using webelement method
	
	act.keyDown(firstname, Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("apana").build().perform();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
