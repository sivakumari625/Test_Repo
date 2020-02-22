package ToTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobjects.LeadsPage;

public class ClickonAddNewLeadSymbol {

	public WebDriver driver;

	@Test
	public void ClickOnNewLead() {
		LeadsPage leadp = new LeadsPage(driver);
		leadp.AddNewLead().click();
	}

}
