package agileTrailBlazers.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSiteHomeP {

	WebDriver driver;

	public DemoSiteHomeP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='addauser.php']")
	public WebElement addUser;
	
	@FindBy(name="username")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="FormsButton2")
	public WebElement save;
	
	@FindBy(xpath="(//a[@href='login.php'])[1]")
	public WebElement login;
	
	@FindBy(xpath="//td[@class='auto-style1']//blockquote//b")
	public WebElement verifySuccess;
	
	
	

}
