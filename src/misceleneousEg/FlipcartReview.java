package misceleneousEg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartReview {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	
		Thread.sleep(2000);
		//to handle hidden division popoup
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//locator of search box
		
		driver.findElement(By.name("q")).sendKeys("ralme9 5G");
		Thread.sleep(2000);
		
		//locator of search button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//locator of review
		
		WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		
		System.out.println(review.getText());
		
	
		
		

	}

}
