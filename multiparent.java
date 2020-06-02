package Interface;

public class multiparent implements Parent,Parent2 {

	@Override
	public void parent2() {

    
    		
	}

	@Override
	public void show() {
		System.out.println("child show");
		
	}
public static void main(String[] args) {
	multiparent m = new multiparent();
	m.show();
}
	
}
