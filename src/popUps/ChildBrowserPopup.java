package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(2000);
    
    
   String mainPageID = driver.getWindowHandle();       //id of main page
    System.out.println(mainPageID);
 System.out.println("===============================");   
    
     
 //to open child window
    
		driver.findElement(By.name("NewWindow")).click();    //locator of new window tab
		Thread.sleep(2000);
		
//to handle multiple windows/ to get multiple ids
		
		
		 Set<String> allPageIDs = driver.getWindowHandles();
		
		Iterator<String> it = allPageIDs.iterator();      //by using iterator
		
	//	while(it.hasNext()) {
	//		System.out.println(it.next());
	//	}
		
	String mainPageId = it.next();     //it will return main page id
		              
   String childPageId = it.next();    //it will return child page id
		
		
	//to switch focus to child window
   
   driver.switchTo().window(childPageId);    //changing selenium focus from main page to child page
  
   driver.manage().window().maximize();      //maximize child window
   
   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("selenium");
   
  // driver.close();        //to close only current tab
 // driver.quit();          //to close all tabs/pages opened by selenium 
   
   
   driver.switchTo().window(mainPageId);      // change focus from child browser to main page
   
   
  WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
   
   System.out.println(myElement.getText());
   
   
   
   
   
   
   
   
		
		
		
		
		
		
		   
		
		
		
		
		
		

	}

}
