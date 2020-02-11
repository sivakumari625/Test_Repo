package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeadsPage {
	public WebDriver driver;

	public LeadsPage(WebDriver driver) {
		this.driver = driver;
	}

	By AddLead = By.cssSelector(".newwhitebtn.customPlusBtn");
	By importLead=By.xpath("//input[@id='importButton']");

	public WebElement AddNewLead() {
		return driver.findElement(AddLead);
	}
	public WebElement ImportLEAD() {
		return driver.findElement(importLead);
	}
}
