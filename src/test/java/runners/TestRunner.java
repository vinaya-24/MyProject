package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",         // Path to feature files
    glue = "stepDefinitions",                         // Package with step defs
    plugin = {"pretty", "html:target/cucumber-reports"},  // Reporting
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // No need to override anything for now — this runner integrates with TestNG
}
