package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver=new ChromeDriver();
         
         driver.get("https://demoqa.com/select-menu");
         Thread.sleep(1000);
         
       WebElement multiSelectElement = driver.findElement(By.id("oldSelectMenu"));
         
         Select s=new Select(multiSelectElement);
         
         System.out.println("Multi Select Status is "+s.isMultiple());
	}

}



