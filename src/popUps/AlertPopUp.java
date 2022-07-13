package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
					WebDriver driver=new ChromeDriver();
					driver.get("https://demoqa.com/alerts");
			    Thread.sleep(2000);
			    
   driver.findElement(By.id("alertButton")).click();  //locator of click me button1 den pop will cum
//1.to handle popup we need to swich selenum focus from main page to popup page bu using syntax
   
   Alert alt=driver.switchTo().alert();
   
//2.Alert is interface which contain abstract method like
//1.accept():use to click on ok button
//2.dismiss():use to click on cancel button
//3.getText():use to get text present in alert popup
   
   System.out.println(alt.getText());
    
   alt.accept();
   
   driver.findElement(By.id("timerAlertButton")).click();   //locator of click me button2
   
	
		
		}

}
