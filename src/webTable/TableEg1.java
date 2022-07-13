package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	
		Thread.sleep(2000);
 // how to find number of rows in table
		
	List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
	                    int totalNumOfRows = rows.size();
		System.out.println("Toatal num of rows in table "+ totalNumOfRows);
		
//how to find no of column in table
		
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalNoOfColumns = columns.size();
		
		System.out.println("Toatal num of columns are "+ totalNoOfColumns);
		
		
//how to read header
//using for each loop
		
for(  WebElement header  :columns)
{
	System.out.print(header.getText()+" ");
}
		
//how to read all rows from table

          List<WebElement> allrowsData = driver.findElements(By.xpath("//table//tr"));
		
		Iterator<WebElement> it = allrowsData.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next().getText());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
