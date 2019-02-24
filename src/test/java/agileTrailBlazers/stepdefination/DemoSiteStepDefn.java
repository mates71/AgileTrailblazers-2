package agileTrailBlazers.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import agileTrailBlazers.homePage.DemoSiteHomeP;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoSiteStepDefn {

	WebDriver driver;
	DemoSiteHomeP demoSiteHomeP;
	
	@Given("^Goto http://thedemosite\\.co\\.uk/index\\.php$")
	public void goto_http_thedemosite_co_uk_index_php() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://thedemosite.co.uk/index.php");
		
		demoSiteHomeP=new DemoSiteHomeP(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("^Click on Add a User link on the top$")
	public void click_on_Add_a_User_link_on_the_top() throws Throwable {
		
		demoSiteHomeP.addUser.click();
		
		
	}

	@When("^Enter some username and password then click on save$")
	public void enter_some_username_and_password_then_click_on_save() throws Throwable {
		demoSiteHomeP.userName.sendKeys("Canan");
		demoSiteHomeP.password.sendKeys("canan123");
		
		Thread.sleep(2000);
		demoSiteHomeP.save.click();
		
		Thread.sleep(2000);
	}

	@When("^Click on Login link$")
	public void click_on_Login_link() throws Throwable {
		demoSiteHomeP.login.click();
		
		
	}

	@When("^Enter Username and password that you created on previous page then click test login$")
	public void enter_Username_and_password_that_you_created_on_previous_page_then_click_test_login() throws Throwable {
		demoSiteHomeP.userName.sendKeys("Canan");
		demoSiteHomeP.password.sendKeys("canan123");
		demoSiteHomeP.save.click();
		
		
	}

	@Then("^Verify \\*\\*Successful Login\\*\\* message is displayed$")
	public void verify_Successful_Login_message_is_displayed() throws Throwable {
		
		String success=demoSiteHomeP.verifySuccess.getText();
		System.out.println(success);
		
		Assert.assertTrue(demoSiteHomeP.verifySuccess.isDisplayed());
		
		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.close();
		
	}

}
