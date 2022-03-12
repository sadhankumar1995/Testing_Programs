package A1_ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class A9_ArrayListAllDataType {

	public static void main(String[] args) {
		
	ArrayList a= new ArrayList();
	a.add("vcentry1");
	a.add(2);
	a.add(true);
	a.add(1.5);
	a.add('c');
	
	for(int i=0;i<a.size();i++)
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
