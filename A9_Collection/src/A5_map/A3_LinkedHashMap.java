package A5_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class A3_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap table= new LinkedHashMap();
		
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
