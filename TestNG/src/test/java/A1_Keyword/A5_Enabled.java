package A1_Keyword;

import org.testng.annotations.Test;

public class A5_Enabled {

	// "STATIC" should not use. if we use also it is not cause any problem. but, not advisable.	
	// In testNG "MAIN METHOD" not required.
	@Test(priority = 1)
	public void add()
	{
		System.out.println("add");
	}
	@Test(priority = 2, enabled = false)  // Here we r disabling this. SEE OUTPUT NO failure, NO skips
	public void sub()
	{
		System.out.println("sub");
	}
	@Test(priority = 3)
	public void mul()
	{
		System.out.println("mul");
	}
	@Test(priority = 7)						// See here we r given priority level 7. But no err.
	public void div()
	{
		System.out.println("div");
	}
}
