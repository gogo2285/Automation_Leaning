package Abstract;

public  abstract class AbstractChild extends Abparent {
	
	public static void main(String[] args) {
		
		//AbstractChild c= new AbstractChild(); //-not allowed
		
	}
	
	
	
	//no point doing this as u cannot call anything from parent
	
	// no use as there is no way to call. but u can call it in non abstract class i.e. if you remove the abstract word
	
	public void click2()
	{
		System.out.println("child click");
	}



	@Override
	public void click1() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
