package A1_Keyword;

import org.testng.annotations.Test;

public class A4_Priority2 {
	
	// "STATIC" should not use. if we use also it is not cause any problem. but, not advisable.	
	// In testNG "MAIN METHOD" not required.
	
	@Test(priority = -1)
	public void checkNetwork()
	{
		System.out.println("Check Network");
	}
	
	@Test(priority = 0)
	public void browser()
	{
		System.out.println("Browser");
	}
	
	@Test(priority = 1)
	public void b_add()
	{
		System.out.println("add");
	}
	
	@Test(priority = 1)
	public void a_sub1()
	{
		System.out.println("sub1");
	}
	
	@Test(priority = 2)
	public void sub()
	{
		System.out.println("sub");
	}
	
	@Test(priority = 3)
	public void mul()
	{
		System.out.println("mul");
	}
	
	@Test(priority = 4)
	public void div()
	{
		System.out.println("div");
	}

}
