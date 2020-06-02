package learning_2020_udemy;

public class array {

	public static void main(String[] args) {
		
		int [] arr= {0,10,2,3,4};
		int k1=100;
		
		int [] arr1= new int[10];
		
		for (int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		for (int i=0;i<arr1.length;i++)
		{
			
			arr1[i]=k1;
		System.out.println(arr1[i]);
		k1++;

	}

		
		// 2d array
		int [][] arr2 = new int [2][3];
		int [][] arr3 = new int [3][10];
		System.out.println( "array 3 lenght is  " + arr3.length);
		int k=0;
		
		for (int i=0;i<arr2.length;i++)
		{
			for (int j=0;j < arr2[i].length;j++)
			{
				arr2 [i][j] = k;
				k++;
				System.out.println("element at " +i +" row and  " + j + "column is " + arr2[i][j]);
			}
		}
		
		System.out.println("array 3 with undefined column");
		try {
		for (int i=0;i<arr3.length;i++)
		{
			for (int j=0;j < 10;j++)
			{
				arr3 [i][j] = k;
				k++;
				System.out.println("element at " +i +" row and  " + j + "column is " + arr3[i][j]);
			}
		}
		}catch (Exception e)
		{
			System.out.println("some error occurred");
			System.out.println(e.getMessage()); 
		}
}
}
// practise 2d and 3d array