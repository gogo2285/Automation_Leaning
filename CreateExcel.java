package ExcelRW;

//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CreateExcel {

	public static void main(String[] args) throws IOException  {

		// System.out.println("all ok");

		// setting up file and its value
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstSheet");

		Row row0 = sheet0.createRow(0);

		Cell cell1 = row0.createCell(0);
		Cell cell2 = row0.createCell(1);

		cell1.setCellValue("name");
		cell2.setCellValue("age");

		// creating and writing into file---CONNECTING STREAMS
		File f1 = new File("F:\\jave_prac\\Firstexcel.xlsx");
		FileOutputStream fw1 = new FileOutputStream(f1); /// true is to append
		workbook.write(fw1);

		
		fw1.close();
		
		System.out.println("file created");

	}

}
