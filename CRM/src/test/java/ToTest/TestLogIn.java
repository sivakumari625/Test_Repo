package ToTest;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.SignUp;
import resources.base;
@Test
public class TestLogIn extends base {
	public WebDriver driver;

	public void UserLogin() throws IOException {
		driver = initializedriver();
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivakumari625@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
	}
}
