package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(1000);
	//click on creat new account button
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click(); //locator of create new account button
				
				Thread.sleep(2000);
				
				//FirstName,LastName,MobileNumber,password
				
				driver.findElement(By.name("firstname")).sendKeys("Sapana");//locator of firstname box 
				driver.findElement(By.name("lastname")).sendKeys("Nikam"); //locator of lastname box
				driver.findElement(By.name("reg_email__")).sendKeys("8888888888"); //locator of mobilenum field 
				driver.findElement(By.id("password_step_input")).sendKeys("9876543"); //locator of password box
				
				//insert Date Of Birth
				Thread.sleep(1000);
				WebElement day = driver.findElement(By.name("birthday_day"));  //locator of day listbox
				
				Select s=new Select(day);
				s.selectByValue("4");
				
				//insert month
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select s1=new Select(month);
			s1.selectByVisibleText("Aug");
			 
			//insert year
			WebElement year = driver.findElement(By.name("birthday_year"));
			
			Select s2=new Select(year);
			s2.selectByValue("1990");
			
			//insert gender
			driver.findElement(By.xpath("//label[text()='Female']")).click();  //locator of female gender element
	}

}
