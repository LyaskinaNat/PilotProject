package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"src/test/java/stepDefs"},
		plugin = {"pretty"}
		)

public class mainRunner {

}
