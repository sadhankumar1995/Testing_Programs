package A1_ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class A8_ArrayListSort {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("vcentry3");  //0
		a.add("vcentry2");  //1
		a.add("vcentry4");  //2
		a.add("vcentry1");  //3
		
		for(int i=0;i<a.size();i++) //0,1,2,3
		{                                           
			System.out.println(a.get(i));
		}
		
		System.out.println("-----------------------------------");
		// sorting

		Collections.sort(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
	}

}
