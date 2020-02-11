package ToTest;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LeadsPage;
import pageobjects.SignUp;
import pageobjects.UserHomeObjects;
import resources.base;

public class UserHome extends base {
	@BeforeTest()
	public void login() throws IOException {
		driver = initializedriver();
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivakumari625@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
	}

	@Test(priority=0)
	public void UserHomePageTest() {
		UserHomeObjects uh = new UserHomeObjects(driver);
		String wnote = uh.UserWelcomeNote().getText();
		System.out.println("The WelCome note is : " + wnote);
		Assert.assertEquals("Welcome siva", wnote);
uh.ClickOnLeadTab().click();
	}

/*	@AfterMethod()
	public void tearDown() {
		driver.close();
	}*/
}