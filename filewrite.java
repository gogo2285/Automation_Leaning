package FileRW;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
	
	public static void main(String[] args) throws IOException {
		
		//3 steps to chain 
		
		File f = new File("F:\\jave_prac\\myfirstFile.txt");
		FileWriter fw = new FileWriter(f,false); // false s to overwrite
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("Name updated twice");
		writer.newLine();
		writer.write("Class");
		writer.newLine();
		
		
		File f1 = new File("F:\\jave_prac\\secondfile.txt");
		FileWriter fw1 = new FileWriter(f1,true); /// true is to append
		BufferedWriter writer1 = new BufferedWriter(fw1);
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
				
			{
				int num= (int)(Math.random()*100);
				writer1.write(num + "\t");
				//writer.write("gayatri"+ "\t");
			}
			writer1.newLine();
		}
		File f2 = new File("F:\\jave_prac\\fourthfile.csv");
		FileWriter fw2 = new FileWriter(f2); /// by default its false
		BufferedWriter writer2 = new BufferedWriter(fw2);
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
				
			{
				int num= (int)(Math.random()*100);
				writer2.write(num + ",");   //use comma instead of \t for csv files
				//writer.write("gayatri"+ "\t");
			}
			writer2.newLine();
		}
		writer.close();  // very important step to close else nothing will be written
		writer1.close();
		writer2.close();
		
	}

}
