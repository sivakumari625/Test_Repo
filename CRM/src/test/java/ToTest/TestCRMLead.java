package ToTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.LeadsPage;
import pageobjects.AddLeadPage;
import pageobjects.SignUp;
import pageobjects.UserHomeObjects;
import resources.base;

public class TestCRMLead extends base {
	@BeforeClass()
	public void getDriver() throws IOException {
		driver = initializedriver();
	}

	@BeforeMethod()
	public void UserLogin() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivakumari625@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
	}

	@Test()
	public void ClickOnLeadsTab() {
		UserHomeObjects uh = new UserHomeObjects(driver);
		String wnote = uh.UserWelcomeNote().getText();
		System.out.println("The WelCome note is : " + wnote);
		Assert.assertEquals("Welcome siva", wnote);
		uh.ClickOnLeadTab().click();
	}

	@Test()
	public void ClickOnAddNewLead() {
		System.out.println("On new lead page");
		LeadsPage leadp = new LeadsPage(driver);
		leadp.AddNewLead().click();
	}

	@Test()
	public void ADDLEAD() {
		AddLeadPage leadp = new AddLeadPage(driver);
		leadp.LeadCompany().sendKeys("Padington");
		leadp.LastName().sendKeys("ConsumerServices");
		leadp.ClickOnSave().click();
	}
}
