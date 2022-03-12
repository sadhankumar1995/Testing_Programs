package exceptionHandling;

public class A5_TryCatch {

	public static void main(String[] args) {
System.out.println("program starts");
		
		try {
			String name=null;
			name.toUpperCase();
			
			int i=1/0;
		int [] a= new int[2];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("alert: please check the size");
			System.out.println(e.getLocalizedMessage());
		}
	
	catch (ArithmeticException e) {
		System.out.println("alert: please enter valid input");
		System.out.println(e.getLocalizedMessage());
	}
		catch (Exception e) {
			System.out.println("alert: something went wrong");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("program completed");

	}

}
