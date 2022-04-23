package returnTypeTest;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		add();
		sub();
		int result=add()+sub();
		System.out.println(result);
	
		                                    //System.out.println(msg());  check this one
		String a=msg();
		System.out.println(a);
	}
	public static  int add()
	{
		System.out.println("add");
		int i=1;
		int j=1;
		int k=i+j;
		System.out.println(k);
		return k;	
	}
	public static int sub()
	{
		System.out.println("sub");
		int i=4;
		int j=2;
		int k=i-j;
		System.out.println(k);
		return k;
	}
	public static String msg()
	{
		int i=1;
		int j=1;
		int k=i+j;
		String m="addition of two number is : ";
		
		String result=m+k;
		System.out.println(result);
		return result;
		
	}
}
