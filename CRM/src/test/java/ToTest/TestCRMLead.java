package ToTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.LeadsPage;
import pageobjects.AddLeadPage;
import pageobjects.SignUp;
import pageobjects.UserHomeObjects;
import resources.base;

public class TestCRMLead extends base {
	@BeforeTest()
	public void getDriver() throws IOException {
		driver = initializedriver();
	//}

	//@BeforeMethod()
	//public void UserLogin() throws IOException {
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivatgtest1@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
	}

	@Test(priority=0)
	public void ClickOnLeadsTab() {
		UserHomeObjects uh = new UserHomeObjects(driver);
		String wnote = uh.UserWelcomeNote().getText();
		System.out.println("The WelCome note is : " + wnote);
		Assert.assertEquals("Welcome sivatgtest1", wnote);
		uh.ClickOnLeadTab().click();
	}

	@Test(priority=1)
	public void ClickOnAddNewLead() throws InterruptedException {
		System.out.println("On new lead page");
		Thread.sleep(4000);
		LeadsPage leadp = new LeadsPage(driver);
		leadp.AddNewLead().click();
	}

	@Test(priority=2)
	public void ADDLEAD() throws InterruptedException {
		AddLeadPage leadp = new AddLeadPage(driver);
		Thread.sleep(1000);
		leadp.LeadCompany().sendKeys("TATA");
		leadp.LastName().sendKeys("Birla");
		leadp.ClickOnSave().click();
	}
}
