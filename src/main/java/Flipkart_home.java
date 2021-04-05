import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_home
{
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement loginpopup;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img")
	private WebElement mobile;
	
	
	public Flipkart_home(WebDriver driver) throws IOException
	{
		
		PageFactory.initElements(driver, this);
	}
	
    public void close_loginpopup()
    {
    	loginpopup.click();
    }
    public void click_mobiles()
    {
    	mobile.click();
    }
      
}
