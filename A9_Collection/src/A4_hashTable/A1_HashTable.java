package A4_hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class A1_HashTable {

	public static void main(String[] args) {
		
		Hashtable table= new Hashtable();
		
		table.put("username", "abcd");
		table.put("password", "1234");
		table.put("domain", "testing");
		table.put("company", "vcentry");
		//table.put("mobile", null);
		//table.put(null, "guindy");
	//	System.out.println(table.get("domain"));
		
	Enumeration e=	table.keys();

	//System.out.println(e.hasMoreElements());
	//System.out.println(e.nextElement());
	
	while(e.hasMoreElements())
	{
		//System.out.println(e.nextElement());
		
	String key= (String) e.nextElement();
		System.out.println(key+":"+table.get(key));
		
	}
	
	
	
	
		}

}
