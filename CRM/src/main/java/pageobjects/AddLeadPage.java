package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class AddLeadPage extends base {
	public WebDriver driver;

	public AddLeadPage(WebDriver driver) {
		this.driver = driver;
	}

	By LeadComp = By.xpath("//input[@id='Crm_Leads_COMPANY']");
	By LName = By.xpath("//input[@id='Crm_Leads_LASTNAME']");
	By save = By.xpath("//input[@id='saveLeadsBtn']");

	public WebElement LeadCompany() {
		return driver.findElement(LeadComp);
	}

	public WebElement LastName() {
		return driver.findElement(LName);
	}

	public WebElement ClickOnSave() {
		return driver.findElement(save);
	}
}
