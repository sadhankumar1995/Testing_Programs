package A2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A5_PushAndPop {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add("d");
		l.add("b");
		l.add("c");
		l.add("a");
		
		System.out.println(l.pop());
		l.push("aaa");
System.out.println("-------------------------------------------");
		Iterator it=	l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
	}

}
