package agileTrailBlazers.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {
	
	WebDriver driver;
	
	public TwitterPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
				this.driver=driver;
	}
	
	@FindBy(xpath="(//input[@name='session[username_or_email]'])[1]")
	public WebElement userName;
	
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	public WebElement psw;
	

	@FindBy(xpath="(//input[@type='submit'])[1]")
	public WebElement loginBtn;
	
	

}
