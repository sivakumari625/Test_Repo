package ToTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.LandingPage;
import pageobjects.SignUp;
import pageobjects.UserHomeObjects;
import resources.base;

public class FiltersOfLeads extends base{
public static WebDriver driver;
 
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		driver = initializedriver();
		LandingPage lp = new LandingPage(driver);
		lp.ClickOnLoginTab().click();
		SignUp su = new SignUp(driver);
		su.Username().sendKeys("sivatgtest2@gmail.com");
		su.Cnext().click();
		su.Pword().sendKeys("Kurnool423!");
		su.SignIn().click();
		UserHomeObjects uh = new UserHomeObjects(driver);
	
		uh.ClickOnLeadTab().click();
		System.out.println("Clicked on Leads Tab");
		List<WebElement> allfilters = driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
		Iterator<WebElement> itr = allfilters.iterator();
		int i=0;
		ArrayList<String> filters=new ArrayList<String>(); 
		while (itr.hasNext()) {
			Thread.sleep(1000);
			WebElement w = itr.next();
			String text = w.getText();
			
			if (text.isEmpty()) {
				System.out.println("Empty Value IIII : "+i);
				i++;
			} else {
				filters.add(text);
			System.out.println(text);
			}
		}

		
		WebElement phone=driver.findElement(By.xpath("//span[@title='Email']"));
		
//WebElement Checkbox= WebDriver(driver, 10).until(ExpectedConditions.elementToBeClickable(ctime));
				
				
	System.out.println("The elemnts test is : "+ phone.getText());
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", phone);
	System.out.println("The elemnts test is : "+ phone.getText());
	List<WebElement> allfilters1 = driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
	Iterator<WebElement> itr1 = allfilters1.iterator();
	int j=0;
	ArrayList<String> filters1=new ArrayList<String>(); 
	while (itr1.hasNext()) {
		Thread.sleep(1000);
		WebElement w1 = itr1.next();
		String text1 = w1.getText();
		
		if (text1.isEmpty()) {
			System.out.println("Empty Value JJJJ : "+j);
			j++;
		} else {
		System.out.println(text1);
		filters1.add(text1);
		}
	}
	WebElement emailoptout=driver.findElement(By.xpath("//span[@title='Last Activity Date']"));
	
	//WebElement Checkbox= WebDriver(driver, 10).until(ExpectedConditions.elementToBeClickable(ctime));
					
					
		System.out.println("The elemnts test is : "+ emailoptout.getText());
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", emailoptout);
		System.out.println("The elemnts test is : "+ emailoptout.getText());
		List<WebElement> allfilters2 = driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
		Iterator<WebElement> itr2 = allfilters2.iterator();
		int j2=0;
		ArrayList<String> filters2=new ArrayList<String>(); 
		while (itr2.hasNext()) {
			Thread.sleep(1000);
			WebElement w2 = itr2.next();
			String text2= w2.getText();
			
			if (text2.isEmpty()) {
				System.out.println("Empty Value JJJJ : "+j2);
				j2++;
			} else {
			System.out.println(text2);
			filters2.add(text2);
			}
		}
		WebElement postalcode=driver.findElement(By.xpath("//span[@title='Skype ID']"));
		
		//WebElement Checkbox= WebDriver(driver, 10).until(ExpectedConditions.elementToBeClickable(ctime));
						
						
			System.out.println("The elemnts test is : "+ postalcode.getText());
			JavascriptExecutor js2= (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].scrollIntoView();", postalcode);
			System.out.println("The elemnts test is : "+ postalcode.getText());
			List<WebElement> allfilters3 = driver.findElements(By.xpath("//span[@class='mL2 vam cP filterLabel']"));
			Iterator<WebElement> itr3 = allfilters3.iterator();
			int j3=0;
			ArrayList<String> filters3=new ArrayList<String>();
			while (itr3.hasNext()) {
				Thread.sleep(1000);
				WebElement w3 = itr3.next();
				String text3= w3.getText();
				
				if (text3.isEmpty()) {
					System.out.println("Empty Value JJJJ : "+j3);
					j3++;
				} else {
				System.out.println("Third loop  " + text3);
				 filters3.add(text3);
				}
			}
			ArrayList<String> Allfilters=new ArrayList<String>(); 
			Allfilters.addAll(filters);
			Allfilters.addAll(filters1);
			Allfilters.addAll(filters2);
			Allfilters.addAll(filters3);
		
			//Set<> set = new LinkedHashSet<>(); 
			HashSet set = new HashSet(Allfilters);
			
			System.out.println("All Filters  " + Allfilters);


			 ArrayList<String> FiltersRD = new ArrayList<String>(Arrays.asList( "Touched Records", "Untouched Records", "Record Action", 
					 "Related Records Action", "Email Status", "Activities", "Notes", "Campaigns", "Lead Name", "Lead Owner", "Created Time",
					 "Phone", "Email", "Mobile", "Company", "Title", "Annual Revenue", "City", "Country","Created By", "Email Opt Out", "Fax",
					 "First Name", "Industry", "Last Activity Date", "Last Name", "Lead Source", "Lead Status", "Modified By", "Modified Time",
					 "No of Employees", "Postal Code", "Province", "Rating", "Salutation", "Secondary Email",  "Skype ID", "Street","Tag", "Twitter", "Website"));
			HashSet s1=new HashSet(FiltersRD);
			boolean b = set.equals(s1);
						System.out.println("The two Arralists are equal::" + b);
	}

}
