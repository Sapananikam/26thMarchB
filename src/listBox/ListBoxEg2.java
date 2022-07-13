package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg2 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com/");
					
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
					Thread.sleep(5000);
	     //select day
					WebElement day = driver.findElement(By.id("day")); //locator of day listbox
					Select s1=new Select(day);
					//s1.selectByIndex(3);
					//s1.selectByValue("4");
					s1.selectByVisibleText("4");
					
		//select month
					WebElement month = driver.findElement(By.id("month")); //locator of month listbox
					Select s2=new Select(month);
					s2.selectByIndex(7);
					s2.selectByValue("8");
					s2.selectByVisibleText("Aug");
     //select year
					WebElement year = driver.findElement(By.id("year"));  //locator of year listbox
					Select s3=new Select(year);
					s3.selectByValue("1990");
					s3.selectByVisibleText("1990");
	}

}
