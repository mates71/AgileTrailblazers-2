package agileTrailBlazers.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//demo 2

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"json:target/cucumber.json",
				"html:target-cucumber/",
				"rerun:target/rerun.txt" },
		features="./src/test/resources/features",
		
				//features="./src/test/resources/features/agailetrailblazers.feature:10",//without tag we can run giving the scenario line number Ex: cucumber features/test.feature:21
		glue="agileTrailBlazers.stepdefination",
		tags="@Smoke",
		dryRun=false
		
		// added
		)

public class CukesRuners {
	

}
