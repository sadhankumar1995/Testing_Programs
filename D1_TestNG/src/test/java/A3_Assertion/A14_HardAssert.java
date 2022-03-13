package A3_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A14_HardAssert {
	
	@Test(priority = 1)
	public void Title()
	{
		System.out.println("validating the Title");
		
		String actual = "gogle";								// Assert is also called as Hard Assert.
		String expected = "Google";
	
		Assert.assertEquals(actual, expected);					// Assert is mainly used for to check the correct spelling. Based on the requirements.
																// Bcoz Spelling is so "PRESTIGIOUS" to clients.
		System.out.println("validation completed");											
	}															// Hard Assert Fails the test case. Not Executing further lines in the same test case.
	
	@Test(priority = 2)
	public void Login()
	{
		System.out.println("LoginPage");
	}

}
