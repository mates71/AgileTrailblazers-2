package agileTrailBlazers.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import agileTrailBlazers.homePage.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {

	public WebDriver driver;
	LoginPage lp;
	String url="http://mock.agiletrailblazers.com/contact.html";

	@Given("^user on the home page$")
	public void user_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp = new LoginPage(driver);

	}

	@When("^user enter name and email$")
	public void user_enter_name_and_email() throws Throwable {

		lp.name.sendKeys("Smith");
		lp.email.sendKeys("smith@gmail.com");

	}

	@When("^user choose a subject$")
	public void user_choose_a_subject() throws Throwable {
		Select select = new Select(lp.subject);
		select.selectByValue("Agile");

	}

	@When("^user enter a message$")
	public void user_enter_a_message() throws Throwable {
		lp.message.sendKeys("Welcome to Agile");

	}

	@When("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
		Thread.sleep(2000);
		lp.submit.click();

	}

	@Then("^user should able to see \"([^\"]*)\"$")
	public void user_should_able_to_see(String successMsg) throws Throwable {
		//String successMsg = "Your message was sent successfully. Thanks.";
		System.out.println("successMsg :" + successMsg);
		Assert.assertEquals(successMsg, lp.successfully.getText());
		
	}
	
	

	@When("^user does not enter a message$")
	public void user_does_not_enter_a_message() throws Throwable {
		lp.message.sendKeys("");
	}

	@Then("^user should able to see error message \"([^\"]*)\"$")
	public void user_should_able_to_see_error_message(String errorMsg) throws Throwable {

		//String errorMsg = "Validation errors occurred. Please confirm the fields and submit it again.";

		System.out.println("errorMsg :" + errorMsg);
		Assert.assertEquals(errorMsg, lp.errrorMsg.getText());

	}
	
	@Then("^close the driver$")
	public void close_the_driver() throws Throwable {
	    
		driver.close();
		
		
	}

}
