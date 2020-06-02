package Inheritence;

public class Bulldog extends Dog {
	
	public void animalmethod()
	{
		System.out.println("this is buldog method");
	}

	public static void main(String[] args) {

		Bulldog d= new Bulldog();
		d.animalmethod();
		d.sound();

	}

}
