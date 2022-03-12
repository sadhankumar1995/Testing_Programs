package A1_TextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A6_FileWriterAndReader {

	public static void main(String[] args) throws IOException {
File f = new File("C:\\vcentry Batch 205\\B1_FileHandling\\File\\Read.txt");
		
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); // to identify the text file
		BufferedWriter bw = new BufferedWriter(fw);
		//bw.write("vcentry1");
		//bw.newLine();
		//bw.write("vcentry2");
		//bw.newLine();
		//bw.write("vcentry3");
		for(int i=0;i<=100;i++)
		{
			bw.write("vcentry"+i);
			bw.newLine();
		}
		bw.close();
		
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String x="";
		while((x=br.readLine())!=null)
		{
			System.out.println(x);
		}
		
	
	}

}
