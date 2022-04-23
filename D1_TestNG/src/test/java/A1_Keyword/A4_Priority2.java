package A1_Keyword;

import org.testng.annotations.Test;

public class A4_Priority2 {
	
	// "STATIC" should not use. if we use also it is not cause any problem. but, not advisable.	
	// In testNG "MAIN METHOD" not required.
	
	@Test(priority = -1)
	public void checkNetwork()
	{
		System.out.println("1");
	}
	
	@Test(priority = 0)
	public void browser()
	{
		System.out.println("2");
	}
	
	@Test(priority = 1)
	public void b_add()
	{
		System.out.println("3");
	}
	
	@Test(priority = 1)
	public void a_sub()
	{
		System.out.println("4");
	}
	
	@Test(priority = 3)
	public void sub()
	{
		System.out.println("5");
	}
	
	@Test(priority = -5)
	public void mul()
	{
		System.out.println("6");
	}
	
	@Test(priority = 4)
	public void div()
	{
		System.out.println("7");
	}

}
