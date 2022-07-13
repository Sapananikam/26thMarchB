package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		    Thread.sleep(2000);
		    
		    
		  WebElement seleniumButton = driver.findElement(By.linkText("Selenium")); //locator of Selenium button
		  
		  //selenium.click();     using webelement method
		  
		  //how to click using actions class
//create object of Actions class and pass driver object
		  
		  Actions act=new Actions(driver);
		  
		act.click(seleniumButton) .perform(); 
		  
		  
//How to right click (context click) using actions class
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']")); //locator of rightclick button
		  
		  act.click(rightClickButton).perform();
		
//How to doubble click using Actions class
		  
WebElement doubbleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")); //locator of doubble click button
		  
		  
		act.click(doubbleclickbutton).perform();
		
		
		
		  
		  
		  
		  
		  
		  
		  
		    
	

		
	}

}
