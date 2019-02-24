package agileTrailBlazers.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricelineHomePage {
	
	WebDriver driver;
	
	public PricelineHomePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Flights")
	public WebElement flights;
	
	
	@FindBy(linkText="trip-type-one-way")
	public WebElement oneWay;
	
	@FindBy(linkText="flight-departure-airport0")
	public WebElement deperture;
	
	@FindBy(linkText="flight-arrival-airport0")
	public WebElement arrivel;
	
	
	@FindBy(linkText="flight-date-range0")
	public WebElement flightDate;     //  11/21/2018
	
	@FindBy(linkText="traveler-selection-readonly-input")
	public WebElement adault;
	

}
