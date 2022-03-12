package A3_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A15_SoftAssert {

	@Test(priority = 1)
	public void Title()
	{
		
		System.out.println("validating the Title");
		
		String actual = "gogle";
		String expected = "Google";
	
		//Assert.assertEquals(actual, expected);					// Assert is mainly used for to check the correct spelling. Based on the requirements.
		
		SoftAssert s = new SoftAssert();							// ((((((((NOTE: For soft assert is a class. so, we need to create an Object))))))))
		s.assertEquals(actual, expected);							// General rule : if we want use one class in other class file means. we need to create an object. 
		
		System.out.println("validation completed");					// actually test case is fail. but execution completed.
		
		s.assertAll();												// (((		.assertAll()		))) it will "not show error". if u forget to use this line.																 
	}
	
	@Test(priority = 2)
	public void Login()
	{
		System.out.println("LoginPage");
	}
	
}
