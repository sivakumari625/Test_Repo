package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class UserSignInPage extends base{
public static WebDriver driver;
public UserSignInPage(WebDriver driver)
{
	this.driver=driver;
	}
By welcomenote=By.xpath("//td[contains(text(),'Manger Id : mngr241660')]");
	public  WebElement welcnote()
	{//System.out.println("User Succefully Loged in");
		return driver.findElement(welcomenote);
	}
	
	//td[contains(text(),'Manger Id : mngr241660')]
}
