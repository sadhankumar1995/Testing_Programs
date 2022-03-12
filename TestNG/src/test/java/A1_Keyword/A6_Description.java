package A1_Keyword;

import org.testng.annotations.Test;

public class A6_Description {

	@Test(priority=1,description="adding the 2 numbers")
	public void add()
	{ 
		
		System.out.println("add");
	}
	@Test(priority=2,enabled=false)  // Here we r disabling this. SEE OUTPUT NO failure, NO skips
	public void sub()
	{ 
	
		System.out.println("sub");
	}
	@Test(priority=3,description = "multiple the numbers")
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
