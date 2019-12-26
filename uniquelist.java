package Java_Handson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class uniquelist {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();

		list1.add("gayatri");
		list1.add("malini");
		list1.add("siddhartha");
		list1.add("jyoti");

		list2.add("malini");
		list2.add("jyoti");
		list2.add("#gatha");
		
		boolean flag = false;
		for (int i = 0; i < list2.size(); i++) {
			String s= list2.get(i);
			list1.add(s);
		}
		 System.out.println(list1);
		 
		 for (int j=0;j<7;j++)
		 {
			 
			 for (int k=0;k<2;k++)
			 {
				 if(list1.get(j)==list2.get(k))
				 {
					  flag = false;
					  break;
			 }
				 else
				 {
					 flag= true;
				 }
				// System.out.println(flag);
			 }
				 if(flag == true)
				 {
					 String t= list1.get(j);
					 list3.add(t);
					 
				 }
				 
			 
		 }	
		 System.out.println(list3);
			Set<String> unique = new HashSet<>(list3);
			System.out.println(unique);
	}
	
}
			
				
