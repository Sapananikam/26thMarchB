package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_App_Using_Excel {

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
				
				Thread.sleep(1000);
				
	WebElement userID = driver.findElement(By.id("userid"));		
				
	WebElement passWord = driver.findElement(By.id("password"));
				
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));			
				
	userID.sendKeys(UN);        //for data security
	passWord.sendKeys(PWD);
	loginButton.click();
	
	Thread.sleep(1000);
	
	WebElement pin = driver.findElement(By.id("pin"));
				
	WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));		
				
	pin.sendKeys(PIN);
	continueButton.click();
				
	Thread.sleep(1000);
				
				
	WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));		
				
	String actualUserID = userName.getText();    //for getting text of usermane		
				
	String expectedUserID=UN;			
				
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
