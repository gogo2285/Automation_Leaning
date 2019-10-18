package G2;
  
import java.util.Date; 

import java.text.*;
public class Progran22 {  
public static void main(String[] args) {  
    
    Date date = new Date(); 
    int newday = date.getDay()+5;
    System.out.println("complete date is " + date.toString());
    /*System.out.println("date is " + date.getDate());
    System.out.println("day is " + date.getDay());
    System.out.println("month is " + date.getMonth());
    System.out.println("year is " + date.getYear());*/
    
           SimpleDateFormat d= new SimpleDateFormat("E dd/MM/yyyy");
    
    System.out.println(d.format(date));
    
    System.out.println(newday);
    
    if(newday=='6' || newday=='7')
    	
    { System.out.println("its a weekend");
    
    }
    else
    {
    	System.out.println("its not weekend");
    }
    
    
    
   
}  
}  
