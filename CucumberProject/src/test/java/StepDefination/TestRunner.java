package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile", 
glue= {"StepDefination"},
plugin= {"pretty", "html:target/HTML/reports.html",
        "json:target/JSONReports/reports.json",
        "junit:target/JUnitReports/reports.xml"},
tags="@Smoketest or @Regressiontest"
)
public class TestRunner {
	
}
