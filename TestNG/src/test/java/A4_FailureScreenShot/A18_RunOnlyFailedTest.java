package A4_FailureScreenShot;

import org.testng.annotations.Test;

@Test
public class A18_RunOnlyFailedTest {			// In folder ----> test-output ----> old ----> There is file called "failed.png" Here we need to run this XML file.
												// Outputs are stored in the ----> test-output ----> old
	public void add()
	{
		System.out.println("add");
	}
	public void sub()
	{
		int i=1/0;							// Failed
		System.out.println("sub");
	}
	public void mul()
	{
		int j=1/0;							// Failed
		System.out.println("mul");
	}
	public void div()
	{
		System.out.println("div");
	}
	
	
	
	
}