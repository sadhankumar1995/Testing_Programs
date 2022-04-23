package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)		// 1 file in this package			   2 files in this package		

@CucumberOptions(features = {"src\\test\\resources\\features"}, glue = {"stepDefinition"}, tags = "@validLogin",
plugin = {
		"html:reports/report.html",
		"json:reports/report.json",
		"junit:reports/report.junit"})

public class RunnerFile {
		

}
