package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;

	public static WebDriver initializedriver() throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fio = new FileInputStream(
				"D:\\selenium-java\\CRM\\src\\main\\java\\utilities\\file.properties");
		Properties prop = new Properties();
		prop.load(fio);
		String br = prop.getProperty("browser");
		System.out.println("Browser" + br);
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\ExeandJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		System.out.println("Driver Initialized");
		String wurl = prop.getProperty("url");
		System.out.println("url  :  " + wurl);
		driver.get(wurl);
		return driver;
	}

}
