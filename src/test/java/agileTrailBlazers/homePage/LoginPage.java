package agileTrailBlazers.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id ="name")
	public WebElement name;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;

	@FindBy(id = "message")
	public WebElement message;

	@FindBy(id = "submit")
	public WebElement submit;

	@FindBy(id = "subject")
	public WebElement subject;
	
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement successfully;
   
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	public WebElement errrorMsg;
	


}
