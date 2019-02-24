package agileTrailBlazers.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import agileTrailBlazers.homePage.TwitterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterStepDefn {
	WebDriver driver;
	TwitterPage twitterPage;
	
	
	@Given("^User on the twitter home page$")
	public void user_on_the_twitter_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://twitter.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		twitterPage = new TwitterPage(driver);

	}

	@When("^user enter valid credentianal$")
	public void user_enter_valid_credentianal() throws Throwable {
		twitterPage.userName.sendKeys("571 292 3245");
		twitterPage.psw.sendKeys("12345");

	}

	@And("^press the login button$")
	public void press_the_login_button() throws Throwable {

		twitterPage.loginBtn.click();

	}

	@Then("^user should able to see \"([^\"]*)\" messages$")
	public void user_should_able_to_see_messages(String message) throws Throwable {
		

		//String failerMsg = driver.findElement(By.xpath("//span[@class='message-text']")).getText();

	//	System.out.println(failerMsg);
		//Assert.assertEquals(message, failerMsg);

	}

}
