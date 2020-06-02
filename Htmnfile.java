package FileRW;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Htmnfile {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("F:\\jave_prac\\HTMLfile.html");
		FileWriter fw1 = new FileWriter(f1); /// true is to append
		BufferedWriter writer = new BufferedWriter(fw1);
		
	   writer.write("<html><body><title>Way to automation HTML</title>Body of automation</body></html>");
	   //<br>  give this for new line
	   writer.write("<html><body><br>Body of automation line 2</body></html>");
	   writer.close();
	   System.out.println("file created");
		
	}

}
