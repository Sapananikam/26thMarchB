package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				Thread.sleep(1000);
			WebElement textbox = driver.findElement(By.id("autocomplete")); //locator of textbox
			
		//	textbox.sendKeys(Hello);  using webelement method
			
//How to send keys using Actions classs
//create object of Action class n pass driver object
			
			Actions act=new Actions(driver);
//using sendkey method of Actions class perform sendkeys task
			
			act.sendKeys(textbox, "Hello").perform();
			
//How to handle drop down using Actions class
			
			WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
			
//using Actions class method handle dropdown
			
act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
			.build().perform();
			
			
			
			
	}

}
 