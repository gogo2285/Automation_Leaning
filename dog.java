package constructors;

public class dog extends Animal {
	
	public dog()
	{
		System.out.println("dog constructor");
	}
	
	public dog(int a)
	{
		System.out.println("dog constructor with argument");
	}
	
	public void show()
	
	{
		super.show(); // in case you want to use parent class mthod also
		System.out.println("child show");
	}
	
	public static void main(String[] args) {
		
		dog d = new dog();
		d.show();
		
		
		
	}

}
