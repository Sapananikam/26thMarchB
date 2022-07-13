package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp {
	
	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\SAPANA\\Selenium\\selenium-java-4.1.4\\TakeScreenShot\\myscreenshot"+TCID+".png");	
		
		FileHandler.copy(src, destination);
	}
	
	
public static String getDataFromPropertyFile(String key) throws IOException	
{
	Properties prop=new Properties();   //object created
	
	FileInputStream myfile=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SapanaSelenium\\myProperties.properties");
	
	prop.load(myfile);
	
	String value=prop.getProperty(key);
	return value;
	
	
	
	
	
	
	
	
}

}
