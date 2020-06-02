package Inheritence;

public class Dog extends Animal {
	
	public void sound()
	{
		System.out.println("this is dogs sound");
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound();
		d.animalmethod();
		

	}

}
