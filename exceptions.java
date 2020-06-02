package learning_2020_udemy;

public class exceptions {

	public static void main(String[] args) {

System.out.println("before exception");

try{
	int i= 10/0;
	System.out.println(i);
	
}catch(Exception e)
{

	System.out.println(e.getMessage());
     e.printStackTrace();
	}
finally
{
	System.out.println("always printing final block");
}
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally
{
	System.out.println("always printing final block no. 2");
}

}}
	


/// try exception with finally