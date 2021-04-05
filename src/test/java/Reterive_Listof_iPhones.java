import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reterive_Listof_iPhones extends BaseClass
{
	
	Flipkart_home home;
	Search_mobiles search;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException, IOException  //Opens browser with Flipkart site url
	{
		browserOpens();
		home=new Flipkart_home(driver);    //Homepage
		search=new Search_mobiles(driver); //Mobilespage
		
	}
	@BeforeMethod
	public void search_iPhones() throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.close_loginpopup();                             //Closes the login popup on homepage
		home.click_mobiles();                                //Clicks on Mobiles icon
		search.click_iPhones();                              //Clicks on iPhones image 
		search.select_maxprice(Utility.getTestData(0,0));    //Select maximum price(40000) to apply filter : gives error refer Search_mobiles.java for details
	}
	@Test
	public void verifylistof_iPhones()
	{
	
		
		
	}
	@AfterMethod
	public void setlistofiPhones(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility.captureScreenshot(driver, TCID);
		}	
		
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.close();
	}
	
	
	

}
