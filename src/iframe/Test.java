package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
    Thread.sleep(7000);
    driver.switchTo().frame("iframeResult");//iframe by id //chane selenium focus from main page to iframe
    
    driver.findElement(By.xpath("//button[@type='button']")).click();
    
    Thread.sleep(2000);
    
    driver.switchTo().defaultContent();    //change selenium focus from childframe to main page
    
    driver.findElement(By.id("menuButton")).click();
    
    
    
    
  String text = driver.findElement(By.xpath("//h2[text()='My First JavaScript']")).getText();
    System.out.println(text);
    
    
    

	}

}
