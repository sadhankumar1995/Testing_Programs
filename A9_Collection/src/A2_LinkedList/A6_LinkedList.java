package A2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A6_LinkedList {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
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

