package polymorphism;

public class Overload {
	
	
	
     public byte func1(byte a, byte b) 
	
	{
        byte d=  (byte) (a+b);
        return d;
	}
     public int func1(int a, int b) 
 	
 	{
         int c= a+b;
         return c;
 	}
	
	public int func1 (int a, int b, int c) /// so this is called overloading where we have same name but diff signature
	{
	int d= a+b+c;
	return d;
	}
	
	public double func1( double a, int b)
	{
		if (b!=0)
		{
			System.out.println(a);
		}
	
		return a;
	}
	
	//public double func1( double a, int b) -we cannot have like this since the signature int a and int b is same.





}



