package A3_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A3_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet l= new LinkedHashSet();
		
		l.add("d");
		l.add("b");
		l.add("c");
		l.add("a");
		
		l.add("b");
		l.add("c");
		l.add("a");
		l.add("d");
	
		Iterator it=	l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		

	}

}
