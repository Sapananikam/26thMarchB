package web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayUse {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
					WebDriver driver=new ChromeDriver();
					driver.get("https://vctcpune.com/selenium/practice.html");
					
					Thread.sleep(1000);
					WebElement hide = driver.findElement(By.id("hide-textbox"));
				    WebElement show = driver.findElement(By.id("show-textbox"));
				    WebElement textbox = driver.findElement(By.name("show-hide"));
			if(textbox.isDisplayed())	
			{
				System.out.println("Thanku textbox is displayed");
			}
			else
			{
				System.out.println("cant find textbox");
			}
			hide.click();
			if(textbox.isDisplayed())	
			{
				System.out.println("Thanku textbox is displayed");
			}
			else
			{
				System.out.println("cant find textbox");
			}
		

	}

}
