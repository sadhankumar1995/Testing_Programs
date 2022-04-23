package A5_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class A2_TreeMap {

	public static void main(String[] args) 
	{
		TreeMap table= new TreeMap();

		table.put("username", "abcd");
		table.put("password", "1234");
		table.put("mobile", null);  // value can accept null
		//table.put(null, "guindy"); // key can not accept null
		//table.put(null, "1600 x 720 Pixels");

	Iterator it=	table.keySet().iterator();
	while(it.hasNext())
	{
	String key=	(String) it.next();
	System.out.println(key+":"+table.get(key));
	}
		

	}

}
