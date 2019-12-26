package Java_Handson;

public class Program12 {

	public static void main(String[] args) {

		System.out.println("sum od 2 strings is " + add("123.4564654", "123.2"));

	}

	public static double add(String a, String b) {

		double a1 = Double.parseDouble(a);
		double a2 = Double.parseDouble(b);
		double sum = a1 + a2;
		return sum;

	}

}
