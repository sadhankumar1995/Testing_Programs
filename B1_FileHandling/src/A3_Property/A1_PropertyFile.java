package A3_Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class A1_PropertyFile {

	public static void main(String[] args) throws IOException {

		File f= new File("C:\\vcentryBatch205\\B1_FileHandling\\src\\property\\data.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop= new Properties();
		prop.load(fis);
		System.out.println(prop.get("domain"));
		Enumeration e=	prop.keys();
		while(e.hasMoreElements())
		{
			
			
		String key= (String) e.nextElement();
			System.out.println(key+":"+prop.get(key));
			
		}
		
	}

}
