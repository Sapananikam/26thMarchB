package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
// Data Member
	
	
	@FindBy(xpath="//span[@class='user-id']" ) private   WebElement  userName;
	@FindBy(xpath = "//a[@target='_self']")   private WebElement  logoutButton;
	
//constructor
	
	
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


//methods

public void validateUserName( String expectedUserID)
{
	String expectedUserName=expectedUserID;
	String actualUserName=userName.getText();
	
	if(expectedUserName.equals(actualUserName))
	{
		System.out.println("Actual n expected User Id are matching, test Case is passed");
	}
	
	else
	{
		System.out.println("Actual n expected User Id are not matching, test Case is failed");
	}
}

// to get actualuserName

public String getActualUserName()
{
	String actualUserName=userName.getText();
	return actualUserName;
}


public void logOut() throws InterruptedException
{
	userName.click();
    Thread.sleep(1000);
logoutButton.click();


}






}
