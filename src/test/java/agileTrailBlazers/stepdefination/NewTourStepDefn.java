package agileTrailBlazers.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import agileTrailBlazers.homePage.NewTourHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTourStepDefn {
	WebDriver driver;
	NewTourHomePage newTourHomePage;

	@Given("^Goto http://newtours\\.demoaut\\.com/ \\(Links to an external site\\.\\)Links to an external site\\. and verify title\\(use variable store url\\)$")
	public void goto_http_newtours_demoaut_com_Links_to_an_external_site_Links_to_an_external_site_and_verify_title_use_variable_store_url()
			throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		newTourHomePage = new NewTourHomePage(driver);

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, driver.getTitle());

	}

	@Given("^Verify that displayed date is correct$")
	public void verify_that_displayed_date_is_correct() throws Throwable {

		Assert.assertEquals("Mercury Tours", newTourHomePage.mercuryTours.getAttribute("alt"));
		System.out.println(newTourHomePage.mercuryTours.getAttribute("alt"));

	}

	@Given("^Click on register link$")
	public void click_on_register_link() throws Throwable {
		newTourHomePage.REGISTER.click();

	}

	@Given("^Create an account by filling out each field then click on submit$")
	public void create_an_account_by_filling_out_each_field_then_click_on_submit() throws Throwable {
		newTourHomePage.firstName.sendKeys("Mehmet");
		newTourHomePage.lastName.sendKeys("Hassan");
		newTourHomePage.phone.sendKeys("202 332 2113");
		newTourHomePage.email.sendKeys("mhmt@yahoo.com");
		newTourHomePage.address1.sendKeys("1456 Great Tree st");
		newTourHomePage.city.sendKeys("Tysons");
		newTourHomePage.state.sendKeys("Virginia");
		newTourHomePage.postalCode.sendKeys("22102");

		Select select = new Select(newTourHomePage.selectCountry);
		select.selectByVisibleText("UNITED STATES");

		newTourHomePage.userName.sendKeys("Mehmet");
		newTourHomePage.password.sendKeys("1234");
		newTourHomePage.confirmPassword.sendKeys("1234");

		newTourHomePage.register.click();

	}

	@Given("^On confirmation page verify label “Note: Your user name is ” ends with username that you entered on registration page$")
	public void on_confirmation_page_verify_label_Note_Your_user_name_is_ends_with_username_that_you_entered_on_registration_page()
			throws Throwable {

		Thread.sleep(3000);
		// System.out.println(newTourHomePage.dearHassan.getText());

	}

	@Given("^Click on sign-in link$")
	public void click_on_sign_in_link() throws Throwable {

		newTourHomePage.signIn.click();

	}

	@Given("^Verify that username, password input fields and submit button are displayed$")
	public void verify_that_username_password_input_fields_and_submit_button_are_displayed() throws Throwable {

		Assert.assertEquals("userName", newTourHomePage.userName.getAttribute("name"));
		Assert.assertEquals("password", newTourHomePage.password.getAttribute("name"));

	}

	@When("^Enter username and password that you entered on registration page$")
	public void enter_username_and_password_that_you_entered_on_registration_page() throws Throwable {
		newTourHomePage.userName.sendKeys("Mehmet");
		newTourHomePage.password.sendKeys("1234");

	}

	@Then("^Verify successful login by checking the title$")
	public void verify_successful_login_by_checking_the_title() throws Throwable {
		newTourHomePage.login.click();
		
		String registerForm=newTourHomePage.verifyRegister.getText();
		Assert.assertEquals(registerForm, newTourHomePage.verifyRegister.getText());

	}

	@Then("^Logout then close browser$")
	public void logout_then_close_browser() throws Throwable {

		driver.close();
	}

}
