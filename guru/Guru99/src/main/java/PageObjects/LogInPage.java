package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class LogInPage extends base{
	public WebDriver driver;
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//By pop=By.xpath("//div[@id='closeBtn']");
	
	By pop= By.cssSelector("#closeBtn");
By un=By.xpath("//input[@name='uid']");
By pwd=By.xpath("//input[@name='password']");
By click=By.name("btnLogin");
public int popupsize()
{
	return driver.findElements(pop).size();
	}
public WebElement popup()
{//System.out.println("Pop clicked");
//TTTTTT
//KKKKK
	return driver.findElement(pop);
	
	}
public WebElement username()
{
	
return driver.findElement(un);
}
public WebElement password()
{
return driver.findElement(pwd);
}
public WebElement clickonLogin()
{
	return driver.findElement(click);
	}
public void closepopup()
{
	Alert al=driver.switchTo().alert();
	al.getText();
	al.dismiss();
	}


}
