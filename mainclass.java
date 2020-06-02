package learning_2020_udemy;

public class mainclass {

	public static void main(String[] args) {
		
		calculatorMethod c = new calculatorMethod();
		System.out.println( "sum is " + c.add(4, 8));
		
		double division = c.div(490, 999);
		
		System.out.println("divsion is "+ division);
		
		int num = Math.max(12, 19); /* predefined functions or methods */
		
		double num1 = Math.random()*50;
		
		// type casting
		
		double num2 = (int)(Math.random()*50); // storing result as double
		int num3 =  (int)(Math.random()*50);  // storing result as int
		
		System.out.println(num);
		////break; ----------------------the break cannot be used outside loop or switch statement.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		for (int i=0;i<10;i++)
		{
			if (i%2==0)
				continue; /// this continue statement takes you back to the loop. it does not goes to next line of code
						System.out.println("odd no. is "+ i);
		} 
		

	}

}
