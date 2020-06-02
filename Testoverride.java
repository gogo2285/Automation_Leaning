package polymorphism;

public class Testoverride extends override {

	public double homeloan()
	{
		return 13.5;
	}
	
		
	// public int homeloan() {return 2;}--- this is not possible changing the return type
	
	// we cannot override the return type while overriding. it is only possible when the return types are class name.
	
	/*public Testoverride getobj() /// now here we change the return type and this is possible.
	{
		Testoverride l= new Testoverride();
		return l;
	}*/
	
	public Testoverride2 getobj() /// you will get an error here till the time you define a parent child relation between testoverride2 class and override class
	{
		Testoverride2 n= new Testoverride2();
		return n;
	}

	
	public static void main(String[] args) {
		
		Testoverride t=new Testoverride();
		
		override r= new Testoverride();
		override s= new override();
		System.out.println(t.homeloan());/// calls child class method
		System.out.println(r.homeloan());/// calls child class method
		System.out.println(s.homeloan());/// calls parent class method
		
		

	}

}
