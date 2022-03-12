package A1_TextFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3_FileWriter {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\vcentry Batch 205\\B1_FileHandling\\File\\test2.txt");
		
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); // to identify the text file
		 
		fw.write("vcentry1");
		
		fw.write("vcentry2");
		
		fw.close();  // used for save and close
	}
	

}
