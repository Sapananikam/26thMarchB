package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
    Thread.sleep(2000);

	driver.findElement(By.id("alertBox")).click();   //locator of click me box
	
	driver.switchTo().alert();    //change selenium focus from main page to alert poppup page
	
	Alert at=driver.switchTo().alert();
	
	System.out.println(at.getText());
	
	at.accept();               //method of Alert interface
	
	//handle pop up for 2nd click me button
	
	driver.findElement(By.id("confirmBox")).click();
	
	Alert a = driver.switchTo().alert();  //change selenium focus from main page to alert poppup page

	System.out.println(a.getText());
	
	 a.dismiss();                  // change selenium focus from main page to alert poppup page

	
	 System.out.println(driver.findElement(By.id("output")).getText());
	 
	 //3rd click me
	 
	 Thread.sleep(1000);
	 driver.findElement(By.id("promptBox")).click();
 Alert	ab=driver.switchTo().alert();  // change selenium focus from main page to alert poppup page
 
 System.out.println(ab.getText());
 ab.sendKeys("Nimbalkar");
 ab.accept();
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
