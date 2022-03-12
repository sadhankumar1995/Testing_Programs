package A5_Polymorphism;

public class A1_Overload {

	public static void main(String[] args) {
		
		//add(1,1);
		add(2,2);
		add(1,1,1);
		add(2,2,"two+two= ");
		add(3,"three+three= ",3);
		
	}
	//                         1     1 
	public static void add(int i,int j)
	{
		//int i=1;
		//int j=1;
	//        1+1	
		int k=i+j;
		System.out.println(k);
	}
	
	public static void add(int i,int j,int k)
	{
		
		int z=i+j+k;
		System.out.println(z);
	}
	public static void add(int i,int j,String msg)
	{
		int k= i+j;
		System.out.println(msg+k);
	}
	public static void add(int i,String msg,int j)
	{
		int k= i+j;
		System.out.println(msg+k);
	}
}
