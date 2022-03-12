package A2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;



public class A3_OfferFirstAndOfferLast {

	public static void main(String[] args) {
		
LinkedList l= new LinkedList();
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
	Iterator it= l.iterator();

	while(it.hasNext()) // it will check whether next value is available or not 
	{
		System.out.println(it.next()); // it will execute
	}
	System.out.println("-----------------------------");
	l.offerFirst("e");
	l.offerLast("f");
	
Iterator its	=l.iterator();

while(its.hasNext())
{
	System.out.println(its.next());
}



	
	}

}
