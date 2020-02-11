package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class UserHomeObjects extends base{
	public WebDriver driver;
	//Giving the knowledge of webdriver through Constructor
		public UserHomeObjects(WebDriver driver) {
			this.driver = driver;
}
		By welcomeUser= By.xpath("//span[@id='show-uName']");
		By LeadsTab=By.xpath(("//a[contains(text(),'Leads')][0]"));
		public WebElement UserWelcomeNote()
		{
			return driver.findElement(welcomeUser);
		}
		public WebElement ClickOnLeadTab()
		{
			return driver.findElement(LeadsTab);
		}
		
}
