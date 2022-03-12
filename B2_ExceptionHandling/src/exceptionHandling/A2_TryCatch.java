package exceptionHandling;

public class A2_TryCatch {

	public static void main(String[] args) {
		
		System.out.println("program starts");
	
		try {
		int i=1/0;
		}
		catch (ArithmeticException e) {
			System.out.println("alert: please enter valid input");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("program completed");

	}

}
