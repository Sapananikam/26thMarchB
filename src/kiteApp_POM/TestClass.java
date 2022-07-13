package kiteApp_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);   //from one page to anothe page give thread
//step1
		
//to call non static method from KiteLoginPage class, we need to create object of that class	
		
	KiteLoginPage login=new KiteLoginPage(driver);

 login.sendUserName();		
 login.sendPassword();		
 login.clickOnLoginButton();
 Thread.sleep(1000);          //from one page to anothe page give thread
 
// step2
 //call non static method of KitePinPage class
 
 KitePinPage kpp=new KitePinPage(driver);
 
 kpp.sendpin();
 kpp.clickContinuebutton();
 Thread.sleep(2000);          //from one page to anothe page give thread
 
//step 3
 // to call non static method from kiteHomePage class
 
 KiteHomePage kt=new KiteHomePage(driver);
 kt.validateUserName();
 kt.logOut();
 
 driver.close();
 
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 



		
		
	}

}
