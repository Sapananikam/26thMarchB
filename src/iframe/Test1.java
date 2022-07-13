package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
        Thread.sleep(7000);
        
      String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
      System.out.println(text);
      
      driver.switchTo().frame(0);  //switch selenium focus from main page to iframe page by index
                                   //iframe by index
      String text1 = driver.findElement(By.id("frametext")).getText();
      System.out.println(text1);
              
      driver.switchTo().parentFrame(); //chane selenium focus from iframe to main page
             
       String text2 = driver.findElement(By.linkText("Pavilion")).getText(); //by linked text
       System.out.println(text2); //jya text khali underline aste to linked text like pavilion
             
       driver.switchTo().frame("Frame2");    //change selenium focus from main page to iframe by id
                                              //iframe by id or name
       String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
       System.out.println(text3);
	}
	

}
