package agileTrailBlazers.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import agileTrailBlazers.homePage.PricelineHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Priceline {
	
	WebDriver driver;
	PricelineHomePage php;

	@Given("^User Priceline home page$")
	public void user_Priceline_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("https://www.priceline.com");
		php=new PricelineHomePage(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@When("^user click to FLIGHT button$")
	public void user_click_to_FLIGHT_button() throws Throwable {
		php.flights.click();
		
		
	}

	@When("^user able to see flight details$")
	public void user_able_to_see_flight_details() throws Throwable {
		
		
	}

	@When("^user should be fill out whole options$")
	public void user_should_be_fill_out_whole_options() throws Throwable {
		php.deperture.sendKeys("Milwaukee,WI");
		php.arrivel.sendKeys("Columbus,OH");
		php.flightDate.sendKeys("11/21/2018");
		
		
	}

	@When("^user click find your flight button$")
	public void user_click_find_your_flight_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user should able to see flight results$")
	public void user_should_able_to_see_flight_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
