package Interface;

public class childclass implements Parent { // use word implement when class extends interface and hass to have all methods implemented

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclass c= new childclass();
		c.show();
		//c.click();---- not avilable bcoz it is in child interface
		

	}

	@Override
	public void show() {
		System.out.println("child implementation");
	}

}

