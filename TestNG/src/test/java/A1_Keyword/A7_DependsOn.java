package A1_Keyword;

import org.testng.annotations.Test;

public class A7_DependsOn {


	@Test
	public void login()
	{
		
		System.out.println("login");					// Test Passed
	}
	
	@Test(dependsOnMethods ="login")		// Here search method depends on login method
	public void search()
	{
		int i=1/0;										// 	exception. so, got failure
		System.out.println("search");
	}
	
	@Test(dependsOnMethods ="search")		// Here book method depends on search method
	public void book()
	{
		System.out.println("book");						// Test Skipped (Bcoz, this one depends on the previous one. so chain breaked)
	}
	
	@Test(dependsOnMethods ="book")			// Here cancel method depends on the book method
	public void cancel()
	{
		System.out.println("cancel");					// Test Skipped (Bcoz, this one depends on the previous one. so chain breaked)
	}
	
}
