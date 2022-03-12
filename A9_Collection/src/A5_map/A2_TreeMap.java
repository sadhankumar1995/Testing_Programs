package A5_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class A2_TreeMap {

	public static void main(String[] args) 
	{
		TreeMap table= new TreeMap();
		
		System.out.println(table.get("domain"));                     // null Bcoz we r setting value here after only
		System.out.println(table.get("password"));					// null Bcoz we r setting value here after only
		System.out.println("--------------------------------");
		
		table.put("username", "abcd");
		table.put("password", "1234");
		table.put("domain", "testing");
		table.put("company", "vcentry");
		table.put("mobile", null);  // value can accept null
		//table.put(null, "guindy"); // key can not accept null
		//table.put(null, "1600 x 720 Pixels");
		
		System.out.println(table.get("domain"));				// getting value Bcoz value set
		System.out.println(table.get("password"));				// getting value Bcoz value set
		
	Iterator it=	table.keySet().iterator();
	while(it.hasNext())
	{
	String key=	(String) it.next();
	System.out.println(key+":"+table.get(key));
	}
		

	}

}
