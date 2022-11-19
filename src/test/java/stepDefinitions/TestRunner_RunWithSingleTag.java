package stepDefinitions;

//Referensi:: https://cucumber.io/docs/cucumber/api/?lang=java
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/FeaturesWithTags",
        glue= {"stepDefinitions"},
        monochrome = true,
        plugin ={"json:target/cucumber-report.json", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        tags = "@smoke or @regression"

)
public class TestRunner_RunWithSingleTag {

}

