package cucumber.Options;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinations")
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, " +
                "html:target/cucumber-html/cucumber-report.html, " +
                "json:target/cucumber-json/cucumber-report.json, " +
                "junit:target/junit-report/cucumber-report.xml, " +
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)
public class TestRunner {
}