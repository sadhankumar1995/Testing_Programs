package A1_Keyword;

import org.testng.annotations.Test;

@Test
public class A3_InClassLevel {

	// "STATIC" should not use. if we use also it is not cause any problem. but, not advisable.	
	// In testNG "MAIN METHOD" not required.	

	
	public void add()
	{
		System.out.println("add");
	}
	
	public void sub()
	{
		System.out.println("sub");
	}
	
	public void mul()
	{
		System.out.println("mul");
	}
	
	public void div()
	{
		System.out.println("div");
	}
	
}
