package polymorphism;

public class TestOverload extends Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverload t= new TestOverload();
		
		System.out.println(t.func1(12.234, 12));
		System.out.println(t.func1(1, 2)); // here int is called
		System.out.println(t.func1(2, 34, 56));
		
		byte a= 2;
		byte b=1;
		System.out.println(t.func1(a, b));// here byte is called after explict defining of signature as byte
		
	}

}
