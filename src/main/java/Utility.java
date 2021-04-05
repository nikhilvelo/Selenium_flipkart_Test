import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
static Sheet sh;
	
	public static String getTestData(int rowind, int colind) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Nikhil\\eclipse-workspace\\Selenium_flipkart_Test\\Data\\InputData.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Max");
		String value = sh.getRow(rowind).getCell(colind).getStringCellValue();
		
		return value;	
	}

	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException 
	{

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Nikhil\\eclipse-workspace\\Selenium_flipkart_Test\\Screenshots\\TCNO_" + TCID + ".jpg");
		FileHandler.copy(src, dest);
		
	}
}
