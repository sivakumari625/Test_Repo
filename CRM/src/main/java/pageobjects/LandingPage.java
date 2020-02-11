package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class LandingPage extends base {
	public WebDriver driver;

//Giving the knowledge of webdriver through Constructor
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
//By COnLoginTab= By.xpath("//a[contains(text(),'LOGIN')])[0]");
	By COnLoginTab= By.linkText("LOGIN");
public WebElement ClickOnLoginTab()
{
	return driver.findElement(COnLoginTab);
	}


}
