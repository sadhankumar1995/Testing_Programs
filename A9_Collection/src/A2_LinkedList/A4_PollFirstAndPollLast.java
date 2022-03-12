package A2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A4_PollFirstAndPollLast {

	public static void main(String[] args) {
LinkedList l= new LinkedList();
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
		System.out.println(l.pollFirst());  //a
		System.out.println(l.pollLast());   //d
		System.out.println("---------------------------");
		
	Iterator it=	l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());  // b and c
	}

	}

}
