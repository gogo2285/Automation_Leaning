package G2;

public class Program3 {

	
	public static void main(String[] args) {
		
		String S= "My Mirst learning Program";
		
		for(int i=0;i<(S.length()-1);i++)
		{
			char a= S.charAt(i);
			//System.out.println(a);
			for(int j=i+1;j<(S.length()-2);j++)
			{
		    char b=S.charAt(j);
			//System.out.println(b);
			if (a==b)
			{
				System.out.println(S.charAt(i) + "is duplicate");
			}
			
			}
		}
		
		}
		
			}
	


