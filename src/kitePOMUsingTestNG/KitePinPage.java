package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

//1.data members
	
	@FindBy(id="pin") private WebElement Pin;
	
	@FindBy(xpath="//button[@type='submit']" ) private WebElement ContinueButton;
	
	
//2.constructor	
	
	
public KitePinPage(WebDriver driver)	//constructor name same as class name
{
	PageFactory.initElements(driver, this);
}
	
	
//3.method // two actions on pin page that is 2 method..send pin n click on continue button

public void sendpin(String pin)   //pass parameters with datatype
{
	Pin.sendKeys(pin);
}


public void clickContinuebutton()
{
	ContinueButton.click();
}







	
	
}
