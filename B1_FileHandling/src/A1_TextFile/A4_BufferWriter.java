package A1_TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A4_BufferWriter {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\vcentry Batch 205\\B1_FileHandling\\File\\test3.txt");
		
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); // to identify the text file
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("vcentry1");
		bw.newLine();
		bw.write("vcentry2");
		bw.newLine();
		bw.write("vcentry3");
		bw.newLine();
		bw.write("vcentry4");
		bw.close();
		
	}

}
