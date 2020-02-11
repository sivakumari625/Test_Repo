package ToTest;

import org.testng.annotations.Test;

import pageobjects.LeadsPage;
import resources.base;

public class ImportLead extends base {
	@Test()
	public void importxsl()
	{
	LeadsPage lp=new LeadsPage(driver);
	lp.ImportLEAD().click();
	
}
}