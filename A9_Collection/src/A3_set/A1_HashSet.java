package A3_set;

import java.util.HashSet;
import java.util.Iterator;

public class A1_HashSet {

	public static void main(String[] args) {
	
		HashSet h= new HashSet();
		// it is heterogenes
		h.add("d");
		h.add("b");
		h.add("c");
		h.add("a");
		
		h.add("b");
		h.add(1);
		h.add(1.5);
		h.add("d");
		
		Iterator it=	h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
		
		
		
		

	}

}

