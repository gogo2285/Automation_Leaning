package Abstract;

public class Abchild1 extends Abparent { // since this the first child it should implement all methods of parent class

	public static void main(String[] args) {
		

	}

@Override
public void click1() {
	System.out.println("implementing click1 of paent in child");
}

@Override
public void show() {
	
	
	// only abstract methods get extended in child class not the concrete methods.
	
}

}
