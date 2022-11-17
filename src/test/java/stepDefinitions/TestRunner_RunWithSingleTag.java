package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/FeaturesWithTags",
        glue= {"stepDefinitions"},
        monochrome = true,
        plugin ={"json:target/cucumber-report.json", "html:target/cucumber-reports.html"},
        tags = "@smoke" )
public class TestRunner_RunWithSingleTag {

}

