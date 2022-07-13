package misceleneousEg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImagesOnWebpage {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	
		Thread.sleep(2000);
		
		List<WebElement> webelement = driver.findElements(By.tagName("img"));

		
		System.out.println(webelement.size());
		
		//list by using iterator
		
		Iterator<WebElement> images = webelement.iterator();
		
		while(images.hasNext())
		{
			System.out.println(images.next().getText());
			
			
			
		}
			
			
			
			
			
			
			
			
			
			
		
		
		
		
	}

}
