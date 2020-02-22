package ToTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.LandingPage;
import pageobjects.SignUp;
import pageobjects.UserHomeObjects;
import resources.base;

public class FirstTryElementFind extends base{
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver = initializedriver();
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivakumari625@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
		UserHomeObjects uh = new UserHomeObjects(driver);
		uh.ClickOnLeadTab().click();
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
	for(int j=0; j<=list.size(); j++)
	{
		System.out.println("The List is : " +list.get(j).getText() );
	}
	//$x("//table[@class='newtable w100per'][1]//tr[2]//td[8]")
	}

}
