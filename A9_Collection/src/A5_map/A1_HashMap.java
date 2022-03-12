package A5_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class A1_HashMap {

	public static void main(String[] args) {
		
		HashMap table= new HashMap();
	
		table.put("username", "abcd");
		table.put("password", "1234");
		table.put("domain", "testing");
		table.put("company", "vcentry");
		table.put("mobile", null);
		table.put(null, "guindy");
		table.put(null, "1600 x 720 Pixels");
		
	Iterator it=	table.keySet().iterator();
	while(it.hasNext())
	{
	String key=	(String) it.next();
	System.out.println(key+":"+table.get(key));
	}
		
	
		
		
	}

}
