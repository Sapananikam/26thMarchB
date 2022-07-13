package misceleneousEg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
	
		Thread.sleep(2000);
		
		
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);
		
		driver.findElement(By.linkText("Try it Yourself")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Try it Yourself")).click();
		
		
		//to get all page ids
		
		Set<String> allpageid = driver.getWindowHandles();
		
		//set by for each loop
		
		for(    String result : allpageid)
		{
			System.out.println(result);
			if(result.equals(mainpageid))
			{
				driver.switchTo().window(result);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
			}
		
		
		}
		
		
		
		
		
		
		

	}

}
