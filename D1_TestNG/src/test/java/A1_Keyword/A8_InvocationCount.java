package A1_Keyword;

import org.testng.annotations.Test;

public class A8_InvocationCount {


	@Test(invocationCount = 5)					//  Here login method looped(run) 5times. Bcoz of "InvocationCout = 5"
	public void login()
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
