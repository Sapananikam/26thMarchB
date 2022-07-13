package misceleneousEg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	
		Thread.sleep(2000);
		
		//how to find number of rows
		
		List<WebElement> noRows = driver.findElements(By.xpath("//table//tr"));
         System.out.println("number of rows "+ noRows.size());

for(     WebElement reader : noRows)
{
	System.out.println(reader.getText()+" ");
	System.out.println();
}











		
	}

}
