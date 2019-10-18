package Java_Handson;

public class mainclass {

	public static void main(String[] args) {
		
		Rectangle r =new Rectangle();
		Triangle t = new Triangle ();
		
		r.set_values(8, 9);
		t.set_values(6, 3);
		
	System.out.println("area of rectangle"+ r.area());
		System.out.println("area of triangle"+ t.area());

	}

}
