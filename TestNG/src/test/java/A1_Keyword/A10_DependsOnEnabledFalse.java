package A1_Keyword;

import org.testng.annotations.Test;

public class A10_DependsOnEnabledFalse {

	@Test(enabled=false) 						// Here we r disabling this method.
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(dependsOnMethods ="login")			// SO, that in output throwing an exception. Bcoz, search() depends on login()(Which is not present)
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
