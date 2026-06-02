package StepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "StepDefination", // <-- Fixed the typo here to match line 1
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports.html"
	    }
	)
public class TestRunner extends AbstractTestNGCucumberTests {
}
