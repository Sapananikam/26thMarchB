package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
 
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
@BeforeClass
public void launchBrowser() throws EncryptedDocumentException, IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver_win32\\chromedriver.exe");
	
	
	ChromeOptions opt=new ChromeOptions();
//	opt.addArguments("headless");
//	opt.addArguments("disable-notifications");
	opt.addArguments("incognito");
	
	
	 driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
Reporter.log("Launching Browser",true);

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

File myfile=new File("C:\\Users\\Admin\\eclipse-workspace\\poi-bin-5.2.2-20220312\\myexcel.xlsx");

 mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");	

	login=new KiteLoginPage(driver);
	pin=new KitePinPage(driver);
	home=new KiteHomePage(driver);
	
}
@BeforeMethod()
public void loginToKiteApp() {
	
	
	String UN = mySheet.getRow(5).getCell(0).getStringCellValue();  //username in excel sheet
	
	String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();       //password in excel sheet
		
	String PIN = mySheet.getRow(5).getCell(2).getStringCellValue(); //to chnge integer value of pin in string--> give '982278 n enter key press  

login.sendUserName(UN);
Reporter.log("sending username",true);

login.sendPassword(PWD);
Reporter.log("sending password",true);

login.clickOnLoginButton();
Reporter.log("clicking on login button",true);
	
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	

pin.sendpin(PIN);
Reporter.log("sending pin",true);
pin.clickContinuebutton();
Reporter.log("clicking on continue button",true);

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
}

@Test
public void validateUserName() 
{
	String expectedUN=mySheet.getRow(5).getCell(0).getStringCellValue();
	String actualUN=home.getActualUserName();
	Reporter.log("Validating username",true);
	
	
	Assert.assertEquals(actualUN,expectedUN,"Actual and Expected UN are not matching TC failed");
	
	Reporter.log("Actual n Expected UN are matching Tc passed",true);
}	

@AfterMethod
public void logoutFromKiteApp() throws InterruptedException
{
	home.logOut();
	Reporter.log("logging out",true);
}

@AfterClass
public void closeBrowser() throws InterruptedException
{
	Thread.sleep(2000);
	Reporter.log("Closing Browser",true);
	driver.close();
}

	
	
	
	
	
	
	
	
	
		
}
