package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\features"}, glue = {"stepDefinition"}, tags = "@validLogin",
					plugin = {"pretty",
							"html:reports/report.html",
							"junit:reports/report.junit",
							"json:reports/report.json"})

//								Folder_name/File_Name

public class RunnerFile {
	
	//					Using plugin keyword we r generating a report.
	
	// Note: pretty --> It will remove unwanted symbols in report(Present Report Neatly)
	
	//                 If we remove "pretty" keyword is optional.	

}
