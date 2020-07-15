package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(


		features="src/test/java/Features",
		glue= {"StepDefinition"},
		
		dryRun=false,
		monochrome=true,
		plugin={"pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"}





		)






public class Runner {




}
