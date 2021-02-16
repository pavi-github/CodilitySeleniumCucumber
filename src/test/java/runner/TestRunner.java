package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/*.feature", glue= {"stepDef"},
        monochrome=true, plugin= {"pretty","json:target/JSONReports/report.json",
        "html:target/HtmlReports"}
)

public class TestRunner {


}