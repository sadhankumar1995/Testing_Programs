package A5_Polymorphism;

public class A3_ChildOverride extends A2_ParentOverride {

	public static void main(String[] args) {
		
		A3_ChildOverride c = new A3_ChildOverride();
		c.copy();
		
		
	}
	
	public static void add()
	{
		//2+5
		System.out.println("i am from child add");
	}
	//                         1     1
	public static void add(int i, int j)
	{
		System.out.println(i+j+" from child");
	}
	
	public void copy()
	{
		super.add();
	add();
		add(1, 1);
		//super.add(2,2);
	}
}

