package guru;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import resources.base;

public class SignInBasePage extends base {
public WebDriver geturl() throws IOException {
initializedriver();
	FileInputStream fio=new FileInputStream("D:\\Siva\\Eclipse-WorkSpace\\Guru99\\src\\main\\java\\utilities\\file.properties");
	Properties pro=new Properties();
	pro.load(fio);
	String burl=pro.getProperty("url");
	driver.get(burl);
	return driver;
}
}
