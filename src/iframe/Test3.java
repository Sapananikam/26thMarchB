package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(5000);
    
	String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	
	System.out.println(text);
	Thread.sleep(1000);
	
	driver.switchTo().frame("frame2");  //switch from main page to iframe2 by id
	
	WebElement listbox = driver.findElement(By.id("animals")); //locator of iframe2
	Select s=new Select(listbox);
	s.selectByValue("babycat");
	
	driver.switchTo().defaultContent();   //from iframe to main page
	Thread.sleep(1000);
	
	driver.switchTo().frame("frame1");  //change focus from main page to iframe1(parent frame)
	WebElement search = driver.findElement(By.tagName("input")); //locator of parent frame by tagname
	search.click();
	search.sendKeys("Hello");
	
	driver.switchTo().defaultContent();  //switch focus from frame to main page
	
	//to switch focus from main frame to child frame, first we need to switch focus childsparent
	
	driver.switchTo().frame("frame1");//chane focus from main page to parent frame by id
	driver.switchTo().frame("frame3");//change focus from parent frame to child frame by id
	driver.findElement(By.id("a")).click(); //locator of child frame
	
	//change the focus from childframe to its immdiate parent frame
	driver.switchTo().parentFrame();
	search.click();
	search.sendKeys("practise");
	
	
	}

}
