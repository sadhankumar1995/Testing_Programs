package finalizeTest;

public class FinalizeTest {

	public void finalize()
	{
		System.out.println("finalize called");
	}
	public static void main(String[] args) {
		System.out.println("hello");
		FinalizeTest f1= new FinalizeTest();
		FinalizeTest f2= new FinalizeTest();
		FinalizeTest f3= new FinalizeTest();
		
		f1=null;
		f2=null;
		f3=null;
		
		System.gc(); // gc means garbage collection

	}

}
