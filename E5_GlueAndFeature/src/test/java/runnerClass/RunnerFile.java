package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\features"}, glue = {"stepDefinition"}, tags = "@validLogin")

// features = {"src\\test\\resources\\features"}   -->    features is for  -->  accessing features package from different folder. so, we need to set path.

// glue = {"stepDefinition"}                       --     glue(GUM) is for  -->  accessing the stepDefinition package from same folder.

public class RunnerFile {	

}



//     Don't forget to use this symbol {" "}