package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\admin\\eclipse-workspace\\F3_CucumberDataTable\\src\\test\\resources"}, glue = {"stepDefinition"}, tags = "@product",
plugin = {"pretty",
		"html:reports/report.html",
		"json:reports/report.json",
		"junit:reports/report.junit"})

public class Runner {

}
