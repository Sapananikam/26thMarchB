package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    Thread.sleep(7000);
    driver.switchTo().frame("frm1");
      WebElement listbox = driver.findElement(By.id("selectnav2"));
        
        Select s=new Select(listbox);
        s.selectByVisibleText("Home");
        Thread.sleep(2000);
        driver.switchTo().defaultContent(); //change selinium focus from iframe to main page
        Thread.sleep(2000);
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("Sonal");
        driver.findElement(By.name("lName")).sendKeys("Nikam");
        driver.findElement(By.id("femalerb")).click();
        driver.findElement(By.id("englishchbx")).click();
	
	
	
	}

}
