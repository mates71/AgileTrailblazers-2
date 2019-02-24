package agileTrailBlazers.stepdefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import agileTrailBlazers.homePage.PhpTravelHomeP;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhpTravelStepDefn {

	static WebDriver driver;
	PhpTravelHomeP phpTravelHomeP;
	
	@Given("^Goto http://www\\.phptravels\\.net/ \\(Links to an external site\\.\\)Links to an external site\\.$")
	public void goto_http_www_phptravels_net_Links_to_an_external_site_Links_to_an_external_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/");
		phpTravelHomeP=new PhpTravelHomeP(driver);
		
	}

	@When("^Click on My Account then click on Login$")
	public void click_on_My_Account_then_click_on_Login() throws Throwable {
		
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),' My Account')])[1]")).click();
		
		//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		
		//phpTravelHomeP.location.sendKeys("Tysons");
		//phpTravelHomeP.myAccountn.click();
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

	@When("^Click on Login without entering username and password$")
	public void click_on_Login_without_entering_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Verify that Invalid Email or Password  is displayed$")
	public void verify_that_Invalid_Email_or_Password_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Enter below credentials then click on Login \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_below_credentials_then_click_on_Login_and(String arg1, String arg2, DataTable arg3)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^Verify that Hi, John Smith message is displayed$")
	public void verify_that_Hi_John_Smith_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Click On John on top right corner of the page$")
	public void click_On_John_on_top_right_corner_of_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Click on Logout then close the browser$")
	public void click_on_Logout_then_close_the_browser() throws Throwable {
		
		
		driver.close();
	}

}
