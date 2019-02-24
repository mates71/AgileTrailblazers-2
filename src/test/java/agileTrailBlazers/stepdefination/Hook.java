package agileTrailBlazers.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	static WebDriver driver;

	@Before
	public void setUp(){
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	@After
	public void tearDown(Scenario scenario){
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) 
					driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		//driver.close();
	}

		
	}

