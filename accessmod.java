package learning_2020_udemy;

import accessmodifiers.class1;

public class accessmod {

	public static void main(String[] args) {
		
		class1 c=new class1();
		//System.out.println(c.i);--- default not visisble to diff pakage
		System.out.println(c.var1);
		//System.out.println(c.var2);--- potected not visisble to diff pakage
		//System.out.println(c.var3);--- private not visisble to diff pakage

	}

}
