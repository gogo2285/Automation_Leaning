package learning_2020_udemy;

public class array3d {

	public static void main(String[] args) {


		int i;
		int j;
		int k;
		int l=0;
		
		int [][][] arr1= new int [2][3][4];
		
		for(i=0;i<arr1.length;i++)
		{
		for(j=0;j<arr1[i].length;j++)
		{
			for (k=0;k<arr1[i][j].length;k++)
			{
				arr1[i][j][k]=l;
				l++;
				System.out.println("element at"+ i + j + k + " is"+ arr1[i][j][k]);
				
			}
		}
	    }

}
}