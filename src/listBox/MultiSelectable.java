package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/select-menu");
				
				Thread.sleep(1000);
				WebElement multiSelectElement = driver.findElement(By.name("cars")); //locator of listbox
				
				//to creat select class object
				
				Select s=new Select(multiSelectElement);
				System.out.println("Multi Select Status is "+s.isMultiple());
				s.selectByVisibleText("Volvo");
				Thread.sleep(100);
				
				s.selectByIndex(1);
				Thread.sleep(100);
				
				s.selectByValue("opel");
				Thread.sleep(100);
				
				s.selectByIndex(3);
				
				//s.deselectAll();
				s.deselectByIndex(3);
				s.deselectByValue("opel");
				s.deselectByIndex(1);
				
				
				System.out.println(s.getFirstSelectedOption().getText());
				s.getAllSelectedOptions();

	}

}
