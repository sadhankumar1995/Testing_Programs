package validateLogin;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@validLogin", monochrome = true, dryRun = false)

public class RunnerFile {
	
	
	//dryRun no need to add compulsory.
	
	//dryRun = true -->	(((( It will Run before executing a program. It will compare Only the steps NOT A PROGRAM ))))
	
	//				    First it will compare and check with Both feature file & class file. 
	//					whether all the steps from feature file is present in the class file or not?
	// 					If steps not present in the class file. It will immediately throw an error.
	
	
	// dryRun ADVANTAGE : IT WILL REDUCE THE TIME OF EXECURING A WORNG PROGRAM.
	
	
	// --------------------------------------------------------------------------------------------------------------------------------------------
	
	// dryRun = false --> consider error in 99th line. It will execute all 98lines and It will thrown an error.
	
	// --------------------------------------------------------------------------------------------------------------------------------------------
	
	// monochrome = true --> It will remove unwanted lines in console.
	
	// --------------------------------------------------------------------------------------------------------------------------------------------
	
	// monochrome = false --> It will show unwanted lines in console.
	
	

}
