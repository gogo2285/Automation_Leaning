package FileRW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("F:\\jave_prac\\myfirstFile.txt");
		FileReader fw1 = new FileReader(f1); /// true is to append
		//BufferedReader writer1 = new BufferedReader(fw1);
		BufferedReader reader = new BufferedReader(fw1);
		
		//one way of reading
		/*System.out.println(writer1.readLine());
		System.out.println(writer1.readLine());
		System.out.println(writer1.readLine());*/
		
		//to read full file
		String line=null;
		while ((line=reader.readLine())!=null)
				{
			System.out.println(line);
				}
		
		
		reader.close();
		
	}

}
