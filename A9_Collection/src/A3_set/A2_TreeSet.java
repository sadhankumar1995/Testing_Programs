package A3_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A2_TreeSet {

	public static void main(String[] args) {
			TreeSet t= new TreeSet();
		
		t.add("d");
		t.add("b");
		t.add("c");
		t.add("a");
		
		t.add("b");
		t.add("c");
		t.add("a");
		t.add("d");
		
		Iterator it=	t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
		

	}

}
