package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"},
		glue = {"stepDefs"},
		plugin = {"pretty", "html:target/cucumber"},
		monochrome = true
		)

public class mainRunner {

}
