package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://vctcpune.com/selenium/practice.html");
					
					Thread.sleep(1000);
	//1.Identify list box to be handled and store it in reference variable
					
					WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
	//2.Create an object of Select Class which will accept WebElement as Argument
					
					Select s=new Select(listbox);
	//3.By using one of the select class methods we can select values form list box like	
					s.selectByVisibleText("Option1");
					s.selectByValue("option2");
					s.selectByIndex(3);

		
	}

}
