package A2_Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A11_BeforeMethod {

	@BeforeMethod													// Execute Before "EACH_METHOD"
	public void browser()
	{
		System.out.println("browser opened");		// This will not consider as a test case.
	}
	
	@AfterMethod													// Execute After "EACH_METHOD"
	public void closeBrwoser()
	{
		System.out.println("browser closed");		// This will not consider as a test case.
	}
	
	@Test
	public void login()												// Note: Here we r using only 4 Test Cases. So, Total tests run: 4
	{
		
		System.out.println("login");
	}
	
	@Test(dependsOnMethods ="login")
	public void search()
	{
		System.out.println("search");
	}
	
	@Test(dependsOnMethods ="search")
	public void book()
	{
		System.out.println("book");
	}
	
	@Test(dependsOnMethods ="book")
	public void cancel()
	{
		System.out.println("cancel");
	}
	
}
