package A1_ListTest;

import java.util.ArrayList;

public class B5_ArrayListClear {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("vcentry1");  //0
		a.add("vcentry2");  //1
		a.add("vcentry3");  //2
		a.add("vcentry4");  //3
		
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
	}

}
