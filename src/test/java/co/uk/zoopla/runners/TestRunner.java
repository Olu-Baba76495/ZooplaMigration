package co.uk.zoopla.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/zoopla/features"}
        ,glue = {"co/uk/zoopla/hooks", "co/uk/zoopla/stepDefinitions"}
        ,plugin = {"pretty", "json:target/report.json",
                   "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
        ,tags = "not @ignore"
)
public class TestRunner {
}
// we can have as many test runner as possible
// e.g. TestRunnerSmoke or TestRunnerNegativeTest
// this means tags = "@smoke or @negativeTest"
// so you go to feature and put @negativeTest on top of the negative tests
// this means i will go to runners, right click on TestRunnerNegativeTest and it will only run -ve tests
