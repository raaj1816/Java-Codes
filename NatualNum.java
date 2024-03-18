package programing;
import java.util.*;

public class NatualNum 
{

	public static void main(String[] args)
	{
		/*int n=5, num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}*/

		/*int[] arr = {1,2,3,4,5};
		int r1=2;
		for(int r=0;r<r1;r++)
		{
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		for(int k=0;k<=4;k++)
		{
		System.out.print
		(arr[k]);
		}*/
		int[][] matrix1 = {{1,2},{3,4}};
		int[][] matrix2 ={{5,6},{7,8}};

		int[][] result = new int[2][2];

		for (int i=0; i < 2; i++)
		{
			for(int j=0;j < 2; j++)
			{

		 for (int k=0;k<2; k++) 
		 {

		result[i][j]+= ( matrix1[i][k] * matrix2[k][j]);
		
		 }
			}
		}
		for (int i=0; i < 2; i++)
		{
			for(int j=0;j < 2; j++)
			{

		 for (int k=0;k<2; k++) 
		 {

		System.out.print(result[i][j]+= ( matrix1[i][k] * matrix2[k][j]));
		
		 }
			}
		}
		
		
			
		

		


	}

}

