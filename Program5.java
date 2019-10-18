package G2;

public class Program5 {

	public static void main(String[] args) {
		
		String S= "My first learning Program";
		
		int i= S.length();
		
		String h ="";
		
		for (int j=i-1;j>=0;j--)
			
		{
			 h= h +S.charAt(j);
			
		}
          System.out.println(h);
	}

}
