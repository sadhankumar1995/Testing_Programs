package A5_Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A19_Parameter {
																// In in parameters concept we r use (((.XML file for KEY & VALUE))) combination.
	
	@Parameters({"Browser","URL","USERNAME","PASSWORD"})		// Here we r calling Keys. for passing the values.
	@Test
	public void login(String browser,String url,String username,String password) // Here we r passing the parameters in same order as given above.
	{
		System.out.println("open browser   --"+browser);
		System.out.println("Enter url      --"+url);
		System.out.println("Enter username --"+username);
		System.out.println("Enter password --"+password);
	}
	
							// And also we need to run in the script in the .XML file level. not in the class level.
}

