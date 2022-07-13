package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_App {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				Thread.sleep(1000);
				
	WebElement userID = driver.findElement(By.id("userid"));		
				
	WebElement passWord = driver.findElement(By.id("password"));
				
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));			
				
	userID.sendKeys("ELR321");
	passWord.sendKeys("Dhana1111");
	loginButton.click();
	
	Thread.sleep(1000);
	
	WebElement pin = driver.findElement(By.id("pin"));
				
	WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));		
				
	pin.sendKeys("982278");
	continueButton.click();
				
	Thread.sleep(1000);
				
				
	WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));		
				
	String actualUserID = userName.getText();    //for getting text of usermane		
				
	String expectedUserID="ELR321";			
				
//to compare actual user id with expected user id
	
//actual id means which is visible on scrren	
//check condition if actualuserID is maches with expectedUseId then print test case pass
//otherwise test case is fail	
	
	if(actualUserID.equals(expectedUserID))
	{
		System.out.println("user Id matching Test Case is pass");
	}
	else
	{
		System.out.println("UserId not matchinf Test Case Failed");
	}
	
	
	userName.click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[@target='_self']")).click();  //locator of logout in userName column
	
	Thread.sleep(1000);
	driver.close();
	
	

	}

}
