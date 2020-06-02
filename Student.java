package constructors;

public class Student {
	
	int rollno;
	String name;
	
	
	public Student() {            // define constructor
		
		System.out.println("calllinggg constructor");
		
	}
	
	public Student (int rollno,String name) // constructor with arguments same asglobal variable so use this keyword
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("rollno--"+this.rollno+"   and  "+"name---" + this.name);
	}
	
	public Student (String location,int classname) // constructor overloading
	{
		System.out.println("location--"+location+"   and  "+"classname---" + classname);
	}

	public static void main(String[] args) {
		

		new Student(); /// as soon as object is created constructor will be called based on signature
		new Student(11,"Gayatri");
		new Student("Delhi",10);
	}

}
