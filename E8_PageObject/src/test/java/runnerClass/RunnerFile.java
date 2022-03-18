package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\features"}, glue = {"stepDefinition"}, tags = "@validLogin",
plugin = {"pretty",
	"html:reports/report.html",
	"json:reports/report.json",
	"junit:reports/report.junit"})


public class RunnerFile {

}
