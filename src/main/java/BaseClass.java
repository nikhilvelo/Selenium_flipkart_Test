import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
 
	WebDriver driver;
	Properties config=new Properties();
	
	
	
	public void browserOpens() throws InterruptedException, IOException 
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\eclipse-workspace\\Selenium_flipkart_Test\\Properties\\config.properties");
		config.load(fis);
		System.setProperty("webdriver.chrome.driver",config.getProperty("chromepath"));			
		driver = new ChromeDriver(options);
		
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
     }
	
}
