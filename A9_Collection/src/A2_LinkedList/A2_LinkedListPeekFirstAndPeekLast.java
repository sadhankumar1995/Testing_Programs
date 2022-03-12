package A2_LinkedList;

import java.util.LinkedList;

public class A2_LinkedListPeekFirstAndPeekLast {

	public static void main(String[] args) {
LinkedList l= new LinkedList();
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		
	}

}
