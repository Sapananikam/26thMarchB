package misceleneousEg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	
		Thread.sleep(2000);
	    
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		                                                    //locator of all honda list name
		
		System.out.println(searchResult.size());
		
		for(    WebElement result:searchResult)
		{
			String actualText = result.getText();
			
			String expectedText="honda amaze";
			if(actualText.equals(expectedText))
			{
				result.click();
				break;
			}
			
			
		}
		
	driver.findElement(By.linkText("Images")).click();	
		
		
		
		
		

	}

}
