package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\kaush\\eclipse-workspace\\CucumberBDDFrameWork\\src\\main\\java\\Feature\\login.feature",
		glue= {"stepDefinition"},
		monochrome=true,
		dryRun=false,
		format= {"pretty"}
		)
public class TestRunner {

}
