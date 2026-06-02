package StepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "StepDefination", // <-- Fixed the typo here to match line 1
	    plugin = {
	        "pretty",
	        "html:target/cucumber-report.html"
	    }
	)
public class TestRunner extends AbstractTestNGCucumberTests {
}
