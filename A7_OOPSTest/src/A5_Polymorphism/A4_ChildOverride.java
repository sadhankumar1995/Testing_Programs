package A5_Polymorphism;

public class A4_ChildOverride extends A3_ParentOverride {

	public static void main(String[] args) {
		
		A4_ChildOverride c = new A4_ChildOverride();
		c.copy();
		
		}
	
	public static void add()
	{
		
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
		super.add(2,2);
	}
}

