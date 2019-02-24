package agileTrailBlazers.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelHomeP {

	WebDriver driver;

	public PhpTravelHomeP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//li[@id='li_myaccount'])[3]")
	public WebElement myAccountn;
	
	@FindBy(xpath = "(//input[@type='text'])[26]")
	public WebElement location;
	

}
