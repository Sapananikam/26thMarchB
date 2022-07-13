package kitePOM_usingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {        //pom always without main method//3 pages then 3 classes
	                     
	
//1. data members
	
 @FindBy(id="userid")  private  WebElement  userName;
@FindBy(id="password") private WebElement   password;
@FindBy(xpath = "//button[@type='submit']")	private WebElement loginButton;
	
	
//2. constructor         //constructor name should be same as class name	

public KiteLoginPage(WebDriver driver)
{

	PageFactory.initElements(driver,this);
}


//3.methods


public void sendUserName( String UserName)  //pass the parameters with datatype
{
	userName.sendKeys( UserName);
}

public void sendPassword( String Password)
{
	password.sendKeys(Password);
}

public void clickOnLoginButton()
{
	loginButton.click();
}


















}
