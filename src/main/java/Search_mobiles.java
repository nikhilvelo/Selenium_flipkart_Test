import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_mobiles 
{
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div[16]/div/div/div/div[1]/div/div[5]/div/a/div/img")
	private WebElement iphone;
    
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	private WebElement maxprice;
	
	public  Search_mobiles(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void click_iPhones()
	    {
	    	iphone.click();
	    }
	    public void select_maxprice(String max)     //max price=40000
	    {
	    	Select s= new Select(maxprice);
	    	s.selectByValue(max);                  // No such element exception: can not locate option with value 40000.
	    }
	
}
