package exceptionHandling;

public class A44_TryCatch {

	public static void main(String[] args) {

		try {
		int [] a= new int[2];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int i=1/0;
		
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("alert: please check the size");
		System.out.println(e.getLocalizedMessage());
		System.out.println(1);
		}
		
		catch (Exception e) {
			System.out.println("alert: something went wrong");
			System.out.println(e.getLocalizedMessage());
		}

	}

}
