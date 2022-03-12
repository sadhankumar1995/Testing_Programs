package A1_ListTest;

import java.util.ArrayList;

public class B3_ArrayListIndexOf {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("vcentry1");  //0
		a.add("vcentry2");  //1
		a.add("vcentry3");  //2
		a.add("vcentry4");  //3
		a.add("vcentry5");  //4
		a.add("vcentry1");  //5
		a.add("vcentry1");  //6
		a.add("vcentry7");  //7
		
		System.out.println(a.indexOf("vcentry1"));
		System.out.println(a.lastIndexOf("vcentry1"));
		
	}

}