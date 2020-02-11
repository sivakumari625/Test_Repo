package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class SignUp extends base {
	public WebDriver driver;
		//Giving the knowledge of webdriver through Constructor
			public SignUp(WebDriver driver) {
				this.driver = driver;
	}
			By uname= By.id("login_id");
			By next=By.id("nextbtn");
			By pword=By.id("password");
			By sin=By.id("nextbtn");
			public WebElement Username()
			{
				return driver.findElement(uname);
				}
			public WebElement Cnext()
			{
				return driver.findElement(next);
				}
			public WebElement Pword()
			{
				return driver.findElement(pword);
				}
			public WebElement SignIn()
			{
				return driver.findElement(sin);
				}
}
