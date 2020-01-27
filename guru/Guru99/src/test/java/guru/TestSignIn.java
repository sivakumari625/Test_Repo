package guru;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LogInPage;
import PageObjects.UserSignInPage;
import utilities.ReadDataFromExcel;

public class TestSignIn extends SignInBasePage {

	@BeforeMethod
	public void lanuchUrl() throws IOException {
		driver = geturl();
	}

	@DataProvider
	public static Object[][] getdata() throws IOException {
		ReadDataFromExcel rd = new ReadDataFromExcel();
		Object[][] data = rd.ReadVariant();
		//System.out.println(data);
		return data;

	}

	@Test(dataProvider = "getdata")
	public void Login(String uname, String pass) {
		LogInPage l = new LogInPage(driver);
		System.out.println(driver.getTitle());
		l.username().sendKeys(uname);
		l.password().sendKeys(pass);
		l.clickonLogin().click();
		String title=driver.getTitle();
		String expected="Guru99 Bank Manager HomePage";
		Assert.assertEquals(title,expected);
		
//driver.switchTo().alert();
	       //	Alert alt = driver.switchTo().alert();
			//String actualBoxtitle = alt.getText(); // get content of the Alter Message
			//alt.accept();
			//if (actualBoxtitle.contains("User or Password is not valid")) { // Compare Error Text with Expected Error Value
			   // System.out.println("Test Data Failed"); 
			   // Assert.assertTrue(false);
			//} 

	}
		//}    
	   // catch (NoAlertPresentException Ex){ 
	    	//String actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			//if (actualTitle.contains("Guru99 Bank Manager HomePage")) {
			//    System.out.println("Test case SS: Passed");
			//} else {
			//    System.out.println("Test case SS: Failed");
		//	}}}	
	    

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
