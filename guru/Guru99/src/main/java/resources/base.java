package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {
	public static WebDriver driver;

	public WebDriver initializedriver() throws IOException
	{FileInputStream fio=new FileInputStream("D:\\Siva\\Eclipse-WorkSpace\\Guru99\\src\\main\\java\\utilities\\file.properties");
	Properties pro=new Properties();
	pro.load(fio);
	String b=pro.getProperty("browser");
	if(b.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "D:/Siva/ExeandJars/chromedriver.exe");
	driver=new ChromeDriver();
	//driver.get("https://www.google.com/");
	}
	else if(b.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "D:/Siva/ExeandJars/geckodriver.exe");
	driver=new FirefoxDriver();
	//driver.get("https://www.google.com/");
	}
	else if(b.equals("IE"))
	{
	}
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 System.out.println("In base page");
		return driver;
}
	public void takeScreenShot(String result) throws IOException
	{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:/Siva/Eclipse-WorkSpace/Guru99/screenshot/"+result+".png"));
			
		}
	
}