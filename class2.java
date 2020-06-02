package accessmodifiers;

public class class2 {

	public static void main(String[] args) {
		
		class1 c=new class1();
		System.out.println(c.i);
		System.out.println(c.var1);
		System.out.println(c.var2);
		//System.out.println(c.var3);--------------- this is private to class1 hence not accessible her

	}

}
