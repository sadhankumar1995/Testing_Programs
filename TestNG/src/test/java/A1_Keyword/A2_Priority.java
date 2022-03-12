package A1_Keyword;

import org.testng.annotations.Test;

public class A2_Priority {
	
	// "STATIC" should not use. if we use also it is not cause any problem. but, not advisable.	
	// In testNG "MAIN METHOD" not required.	

	@Test(priority=1)
	public void add()									// Normally, Runs in Alphabetic Order. So, We r using Priority.
	{
		System.out.println("add");
	}
	
	@Test(priority=2)
	public void sub()
	{
		System.out.println("sub");
	}
	
	@Test(priority=3)
	public void mul()
	{
		System.out.println("mul");
	}
	
	@Test(priority=4)
	public void div()
	{
		System.out.println("div");
	}
	
}
