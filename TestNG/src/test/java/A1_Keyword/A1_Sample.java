package A1_Keyword;

import org.testng.annotations.Test;

public class A1_Sample {
	
	// "STATIC" should not use. if we use also it is not cause any problem. but, not advisable.	
	// In testNG "MAIN METHOD" not required.
	
	@Test													// Normally, Runs in Alphabetic Order.
	public void add() {
		System.out.println("add");
	}
	
	@Test
	public void sub() {
		System.out.println("sub");
	}
	
	@Test
	public void mul() {
		System.out.println("mul");
	}
	
	@Test
	public void div() {
		System.out.println("div");
	}
	
}
