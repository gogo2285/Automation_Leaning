package oops;

public class p18_class1 {

	public static void main(String[] args) {
		
		p18_class2 s = new p18_class2();
		System.out.println(Add(5,5)); 
		s.func();
		student(22, "gayatri");
		s.func();
	}
		public static int Add(int a, int b)
		{
			return (a+b);
		}
			
		public static void student(int id,String name)
		{
			System.out.println("student id is " + id + " student name is " + name);
		}
			}


