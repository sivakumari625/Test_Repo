package guru;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guruscript {
    public static XSSFWorkbook workbook;
       public static XSSFSheet worksheet;
	public static WebDriver driver;
	static String SheetName= "Sheet1";
    public  String Res;
    //Write obj1=new Write();
    public int DataSet=-1;
	public static void main(String[] args) throws IOException {
	

FileInputStream fis=new FileInputStream("D:\\Siva\\Eclipse-WorkSpace\\Guru99\\src\\main\\java\\TestData\\gurulogindata.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook (fis); //get my workbook 
worksheet=workbook.getSheet(SheetName);// get my sheet from workbook
XSSFRow Row=worksheet.getRow(0);     //get my Row which start from 0   

int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
int ColNum= Row.getLastCellNum(); // get last ColNum 
 
Object Data[][]= new Object[RowNum-1][ColNum]; // pass
String username, password;
String actualTitle;
String actualBoxtitle;
	for (int i = 0; i < Data.length; i++) {
	    username = (String) Data[i][0]; // get username
	    password = (String) Data[i][1]; // get password
	    System.setProperty("webdriver.gecko.driver", "D:/Siva/exe_and_jars/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 //System.out.println("In base page");
		//driver.get("http://demo.guru99.com/V4/manager/Managerhomepage.php");
	driver.get("http://demo.guru99.com/V4/");
	    //Setup Firefox driver
	String t1=driver.getTitle();
	    // Enter username
	    driver.findElement(By.name("uid")).clear();
	    driver.findElement(By.name("uid")).sendKeys(username);

	    // Enter Password
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);

	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
       
        /* Determine Pass Fail Status of the Script
         * If login credentials are correct,  Alert(Pop up) is NOT present. An Exception is thrown and code in catch block is executed	
         * If login credentials are invalid, Alert is present. Code in try block is executed 	    
         */
	    try{ 
	    
	       	Alert alt = driver.switchTo().alert();
			actualBoxtitle = alt.getText(); // get content of the Alter Message
			alt.accept();
			if (actualBoxtitle.contains("User or Password is not valid")) { // Compare Error Text with Expected Error Value
			    System.out.println("Test case SS[" + i + "]: Passed"); 
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
		}    
	    catch (NoAlertPresentException Ex){ 
	    	actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			if (actualTitle.contains("Guru99 Bank Manager HomePage")) {
			    System.out.println("Test case SS[" + i + "]: Passed");
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
			
        } 
	    driver.close();
	    } 
}
}
