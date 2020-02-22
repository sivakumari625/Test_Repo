package FirstTryHere;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageobjects.LandingPage;
import pageobjects.SignUp;
import pageobjects.UserHomeObjects;
import resources.base;

public class FirstTryElementFind extends base {
	public static WebDriver driver;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// TODO Auto-generated method stub
		driver = initializedriver();
		ArrayList fname = new ArrayList();
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivatgtest1@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
		UserHomeObjects uh = new UserHomeObjects(driver);
		Thread.sleep(2000);
		uh.ClickOnLeadTab().click();
		System.out.println("Clicked on Leads Tab");
		WebElement fax=driver.findElement(By.xpath("//span[@title='Fax']"));
		System.out.println(fax.getText());
		List<WebElement> allfilters = driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
		Iterator<WebElement> itr = allfilters.iterator();
		while (itr.hasNext()) {
			Thread.sleep(1000);
			WebElement w = itr.next();
			String text = w.getText();
			
			if (text.isEmpty()) {
				
				System.out.println("Scrolld tocreated ");
				System.out.println(fax.getText());
				Thread.sleep(2000);
				//js.executeScript("arguments[0].scrollIntoView();", fax);
				System.out.println(fax.getText());
				/*
				List<WebElement> allfilters1 = driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
				Iterator<WebElement> itr1 = allfilters1.iterator();
				while (itr1.hasNext()) {
					Thread.sleep(1000);
					WebElement w1 = itr1.next();
					String text1 = w1.getText();
					System.out.println(text1);
					
				}*/
			}
			System.out.println(text);
	

		}

		// js.executeScript("arguments[0].scrollIntoView();", itr.next());

//WebElement element = driver.findElement(By.xpath("//div[@id='lv_filter_scroll']//div[@class='ps-scrollbar-y']"));

		// //y axis value is set to'400', which can be altered

	}
}
