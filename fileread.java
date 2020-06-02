package FileRW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class fileread {

	public static void main(String[] args) throws IOException {
		
		
		Properties p = new Properties();
		FileInputStream f= new FileInputStream(System.getProperty("user.dir")+"\\src\\FileRW\\object.properties");
		p.load(f);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("age"));
		p.setProperty("Name", "Malini");
		System.out.println(p.getProperty("Name"));
		System.out.println(System.getProperty("user.dir"));
	}

}
