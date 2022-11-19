package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/HookDemo/HookDemo.feature",
        glue= {"StepDefinitionHooks"},
        monochrome = true,
        plugin ={"pretty", "json:target/cucumber-report.json",
                "html:target/cucumber-reports.html", "json:target/cucumber.json"}

)
public class TestRunnerHooks {
}
