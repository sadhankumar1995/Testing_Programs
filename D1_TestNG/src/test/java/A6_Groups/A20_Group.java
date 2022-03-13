package A6_Groups;

import org.testng.annotations.Test;

public class A20_Group {
																	// Note(Manual Testing Terms : Regression Testing |	means 	End to End
																	//		  					   Smoke Testing 		means 	specific test case
	@Test(priority = 1, groups = {"login", "book", "logout"})
	public void login()
	{
		System.out.println("login Executed");
	}
	
	@Test(priority = 2, groups = {"login", "book"})
	public void search()
	{
		System.out.println("search the ticket");
	}
	
	@Test(priority = 3, groups = {"login", "book"})
	public void booking()
	{
		System.out.println("booking is completed");
	}
	
	@Test(priority = 4, groups = {"login"})
	public void cancel()
	{
		System.out.println("ticket cancelled");
	}
	
	@Test(priority = 5, groups = {"login", "logout"})
	public void logout()
	{
		System.out.println("logout successful");
	}
	
														// Here we r grouping each and every methods.
}
