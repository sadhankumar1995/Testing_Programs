package A4_Encapsulation;

public class A2_Example1Gpay {

	public static void main(String[] args) throws InterruptedException {
		
		A1_Example1Encap e = new A1_Example1Encap();
		e.setUsername("vcentry");
		System.out.println("yes customer name exists : "+e.getUsername());
		e.setProcessingamount(100);
		System.out.println("your request detection "+e.getProcessingamount());

	}

}
