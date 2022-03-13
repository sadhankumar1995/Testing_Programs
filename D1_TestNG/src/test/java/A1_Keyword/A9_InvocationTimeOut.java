package A1_Keyword;

import org.testng.annotations.Test;

public class A9_InvocationTimeOut {

	@Test(priority=1,invocationTimeOut = 4000)					// Thread.sleep time should be always less than invocation time out
	public void add() throws InterruptedException
	{ 
		Thread.sleep(5000);								// So, This Test case got failure.
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
