package tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "not @validLogin")


//@CucumberOptions(tags="@validLogin and @admin")  // will check both tags
//@CucumberOptions(tags="@validLogin or @admin")  // either one tag is present also it will run the Scenario 
//@CucumberOptions(tags=" not @validLogin")  	 // except not tag will execute rest of the tags


public class RunnerFile {

}
