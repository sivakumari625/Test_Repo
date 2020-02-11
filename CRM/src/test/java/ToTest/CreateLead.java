package ToTest;

import org.testng.annotations.Test;
import pageobjects.AddLeadPage;
import resources.base;

public class CreateLead extends base {
	@Test
	public void newLead() {
		AddLeadPage leadp = new AddLeadPage(driver);
		leadp.LeadCompany().sendKeys("TCS");
		leadp.LastName().sendKeys("Servies");
		leadp.ClickOnSave().click();
	}
}