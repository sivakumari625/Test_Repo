package guru;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToTest {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Siva/exe_and_jars/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 //System.out.println("In base page");
		//driver.get("http://demo.guru99.com/V4/manager/Managerhomepage.php");
	driver.get("http://demo.guru99.com/V4/");
	String t1=driver.getTitle();
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr241660");
	// mngr241660
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hesypam");
	//  hesypam
	driver.findElement(By.name("btnLogin")).click();
	String t2=driver.getTitle();
	if(t1.equalsIgnoreCase(t2))
	{System.out.println("Valid credentials");}
	else
	{	System.out.println("Invalid crialedent");}
		System.out.println(driver.getTitle());
		//WebElement t=driver.findElement(By.xpath("//marquee[@class='heading3']"));
	WebElement t=driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr241660')]"));
		//   
		Boolean b=t.isDisplayed();
		if(b)
		{System.out.println("Valid credentials");}
		else
		{	System.out.println("Invalid crialedent");}
		System.out.println(t.getText());
	}

}
