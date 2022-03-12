package A1_ListTest;

import java.util.ArrayList;

public class B7_ArrayListInsideArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList> insideList= new ArrayList<ArrayList>();
		
		ArrayList a= new ArrayList();
		a.add("vcentry1");  //0
		a.add("vcentry2");  //1
		a.add("vcentry3");  //2
		a.add("vcentry4");  //3
		
		ArrayList b= new ArrayList();
		b.add("vcentry5");  //0
		b.add("vcentry6");  //1
		b.add("vcentry7");  //2
		b.add("vcentry8");  //3

		 insideList.add(a);
		 insideList.add(b);
		
		 System.out.println(insideList);
		 
		// [[a],[b]]
		
	}

}
