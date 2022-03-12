package A1_TextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A5_FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("C:\\vcentry Batch 205\\B1_FileHandling\\File\\test3.txt");
		
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		//br.readLine();
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		String x="";
		while((x=br.readLine())!=null)
		{
			System.out.println(x);
		}
	}

}
