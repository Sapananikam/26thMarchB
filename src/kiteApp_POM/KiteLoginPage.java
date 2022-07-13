package kiteApp_POM;

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


public void sendUserName()
{
	userName.sendKeys("ELR321");
}

public void sendPassword()
{
	password.sendKeys("Dhana1111");
}

public void clickOnLoginButton()
{
	loginButton.click();
}


















}
