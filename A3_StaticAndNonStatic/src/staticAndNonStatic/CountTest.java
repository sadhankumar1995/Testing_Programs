package staticAndNonStatic;

public class CountTest {
	
	public static int i=0;          // ---> output1 : 1 2 3  ---> Bcoz c1 initialized by i=0; c2 initialize by c1 value{1}, c3 initialize by c2 value{2}.
	
	//public int i=0;                                    // ---> output2 : 1 1 1  ---> Bcoz c1,c2,c3 object value initialized by i=0;
	
	public static void main(String[] args) {							// main method --> always static

		CountTest c1= new CountTest();									// step2,3,4 : object creating for to access the non-static method.
		CountTest c2= new CountTest();
		CountTest c3= new CountTest();
		
		c1.count();					    								//****** Refer not******
		c2.count();
		c3.count();                      							   //---> syso not required here, bcoc in the "count" method we already have syso.
		
		System.out.println("---------------------------");
		
		System.out.println("object value of c1 is : " + c1);
		System.out.println("object value of c2 is : " + c2);
		System.out.println("object value of c3 is : " + c3);
	}
	public void count()				     							  // step1 : creating an non-static method
	{
		i++; 
		System.out.println(i);
	}
}
