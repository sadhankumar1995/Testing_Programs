package A1_Keyword;

import org.testng.annotations.Test;

public class A9_InvocationTimeOut {

	@Test(priority=1,invocationTimeOut = 4000)					// Thread.sleep time should be always less than invocation time out
	public void add() throws InterruptedException
	{ 
		Thread.sleep(3000);
		System.out.println("add");												// less than invocationTimeOut --> passed
	}
	
	@Test(priority=2,invocationTimeOut = 4000)
	public void sub() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("sub");												// equal to invocationTimeOut --> failed
	}
	
	@Test(priority=3,invocationTimeOut = 4000)
	public void mul() throws InterruptedException
	{
		Thread.sleep(5000);														// greater than invocationTimeOut --> failed
		System.out.println("mul");
	}
	
	@Test(priority=4)
	public void div()
	{
		System.out.println("div");
	}
	
}
