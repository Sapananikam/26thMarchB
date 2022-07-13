package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demo.guru99.com/test/drag_drop.html");
		    Thread.sleep(2000);
//find source and destination
		    
		  WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']")); //locator of 5000
		    
		    
		    
	WebElement destination = driver.findElement(By.id("amt8"));   //locator of amount
		    
	//how to drag n drop using Actions class
	//create object of Actions class n pass driver object
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(source, destination).perform();
	
	
	
	
	
	
		    
		    
		    
		    
		    
		    
		    
	
	}

}
