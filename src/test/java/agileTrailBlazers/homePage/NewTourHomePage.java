package agileTrailBlazers.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTourHomePage {

	WebDriver driver;

	public NewTourHomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//img[@alt='Mercury Tours']")
	public WebElement mercuryTours;
	
	@FindBy(xpath="//a[.='REGISTER']")
	public WebElement REGISTER;
	
	@FindBy(name="firstName")
	public WebElement firstName;
	
	@FindBy(name="lastName")
	public WebElement lastName;
	
	@FindBy(name="phone")
	public WebElement phone;
	
	@FindBy(id="userName")
	public WebElement email;
	
	@FindBy(name="address1")
	public WebElement address1;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="postalCode")
	public WebElement postalCode;
	
	@FindBy(name="country")
	public WebElement selectCountry;
	
	@FindBy(name="register")
	public WebElement register;
	
	@FindBy(name="//table[@width='492']//tr[3]//p[1]//font/b")
	public WebElement dearHassan;
	
	@FindBy(xpath="//a[@href='mercurysignon.php']")
	public WebElement signIn;
	
	@FindBy(name="userName")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="confirmPassword")
	public WebElement confirmPassword;
	
	
	@FindBy(name="login")
	public WebElement login;
	
	@FindBy(xpath="(//a[@href='mercuryregister.php'])[2]")
	public WebElement verifyRegister;
	
	
	
	
	
	
	
	
	

}
