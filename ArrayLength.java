package programing;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				System.out.print(a[i]);
			}
		}
			
		
		
		
	}

}
