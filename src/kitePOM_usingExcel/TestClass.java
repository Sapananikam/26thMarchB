package kitePOM_usingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		File myfile=new File("C:\\Users\\Admin\\eclipse-workspace\\poi-bin-5.2.2-20220312\\myexcel.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");	
			
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();  //username in excel sheet
			
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();       //password in excel sheet
			
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue(); //to chnge integer value of pin in string--> give '982278 n enter key press  

		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);   //from one page to anothe page give thread
//step1
		
//to call non static method from KiteLoginPage class, we need to create object of that class	
		
	KiteLoginPage login=new KiteLoginPage(driver);

 login.sendUserName(UN);		
 login.sendPassword(PWD);		
 login.clickOnLoginButton();
 Thread.sleep(1000);          //from one page to anothe page give thread
 
// step2
 //call non static method of KitePinPage class
 
 KitePinPage kpp=new KitePinPage(driver);
 
 kpp.sendpin(PIN);
 kpp.clickContinuebutton();
 Thread.sleep(2000);          //from one page to anothe page give thread
 
//step 3
 // to call non static method from kiteHomePage class
 
 KiteHomePage kt=new KiteHomePage(driver);
 kt.validateUserName(UN);
 kt.logOut();
 
 driver.close();
 
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 



		
		
	}

}
