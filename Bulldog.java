package constructors;

public class Bulldog extends dog {
	
	public Bulldog()
	
	{
		super(10);//  if we do not have by default constructor in parent class and if we do not define this also then bulldog will have error
		System.out.println("Bulldog constructor");
	}

}
