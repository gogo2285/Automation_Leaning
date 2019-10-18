package G2;
  
import java.util.Date; 

import java.text.*;
public class Progran21 {  
public static void main(String[] args) {  
    
    Date date = new Date(); 
    
    System.out.println("complete date is " + date.toString());
    System.out.println("date is " + date.getDate());
    System.out.println("day is " + date.getDay());
    System.out.println("month is " + date.getMonth());
    System.out.println("year is " + date.getYear());
    
    SimpleDateFormat d= new SimpleDateFormat("E yyyy/MM/dd");
    
    System.out.println(d.format(date));
    
   
}  
}  
