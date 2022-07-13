package misceleneousEg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfTablesOnWebpage {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	
		Thread.sleep(2000);
		
		List<WebElement> webelement = driver.findElements(By.tagName("table"));
		
		System.out.println(webelement.size());
		
		//list by itearator
		
		Iterator<WebElement> tables = webelement.iterator();
        while(tables.hasNext()) {
        	
        	System.out.println(tables.next().getText());
        }
		
		
	}

}
